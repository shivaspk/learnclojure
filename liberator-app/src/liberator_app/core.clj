(ns liberator-app.core (:require [liberator.core :refer [resource defresource]]
                                 [ring.middleware.params :refer [wrap-params]]
                                 [compojure.core :refer [defroutes ANY]]))
(defroutes app
  (ANY "/" [] (resource))
  (ANY "/hello" [] (resource :available-media-types ["text/html"]
                             :handle-ok "<html><h1>Hello, Liberator!</h1></html>")))
(def handler
  (-> app
      wrap-params))