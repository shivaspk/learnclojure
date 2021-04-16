(ns liberator-app.core (:require [liberator.core :refer [resource defresource]]
                                 [ring.middleware.params :refer [wrap-params]]
                                 [compojure.core :refer [defroutes ANY]]
                                 [clojure-csv.core :as csv]))

(defresource parameter [txt]
  :available-media-types ["text/plain"]
  :handle-ok (fn [_] (format "The text is %s" txt)))

(defroutes app
  (ANY "/" [] (resource))
  (ANY "/hello" [] (resource
                    :allowed-methods [:get :head]
                    :available-media-types ["text/html"]
                    :handle-ok "<html><h1>Hello, Liberator!</h1></html>"))
  (ANY "/hello/:name" [name] (parameter name))
  (ANY "/babel" []
    (resource :available-media-types ["text/plain" "text/html" "text/csv" "application/xml"
                                      "application/json" "application/clojure;q=0.9"]
              :handle-ok
              #(let [media-type
                     (get-in % [:representation :media-type])]
                 (condp = media-type
                   "text/plain" "You requested plain text"
                   "text/csv" (csv/write-csv [["Sl no" "name" "place"]["1" "Siva" "BLR"]])
                   "application/xml" "<test> data as xml </test>"
                   "text/html" "<html><h1>You requested HTML</h1></html>"
                   {:message "You requested a media type"
                    :media-type media-type}))
              :handle-not-acceptable "Uh, Oh, I cannot speak those languages!"))
  )
(def handler
  (-> app
      wrap-params))