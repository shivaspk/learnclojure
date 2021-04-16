(ns liberator-app.core (:require [liberator.core :refer [resource defresource]]
                                 [ring.middleware.params :refer [wrap-params]]
                                 [compojure.core :refer [defroutes ANY]]))

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
  )
(def handler
  (-> app
      wrap-params))