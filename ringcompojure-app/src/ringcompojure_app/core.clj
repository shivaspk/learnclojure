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

(defn helloresponse [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str "Hello " (:name (:params req)))})


(defroutes app
  (GET "/" [] defaultresponse)
  (GET "/hello/:name" [] helloresponse)
  (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (println "Ring Starting....")
  (jetty/run-jetty  app {:port  3000}))