(ns ringcompojure-app.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.params :as ringparams]
            [ring.util.response :as ringresponse]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defn defaultresponse [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello Compojure!</h1>"})

(defroutes app
  (GET "/" [] defaultresponse)
  (GET "/hello" [] "<h1>Hello</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (println "Ring Starting....")
  (jetty/run-jetty  app {:port  3000}))