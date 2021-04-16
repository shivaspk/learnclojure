(ns ringcompojure-app.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.params :as ringparams]
            [ring.util.response :as ringresponse]
            [clojure.pprint :as pp]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.data.json :as json]))

(defn defaultresponse [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello Compojure!</h1>"})

(defn echoresponse [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (-> (pp/pprint req)(str "request: " req))})

(defn helloresponse [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str "Hello " (:empid (:params req)))})

(defn hellojsonresponse [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (str (json/write-str {:hello "This is a json!"}))})

(defroutes app
  (GET "/" [] defaultresponse)
  (GET "/echo" [] echoresponse)
  (GET "/hello" [] "Hello Team!")
  (GET "/employee/:empid" [] helloresponse)
  (GET "/hellojson" [] hellojsonresponse)

  (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (println "Ring Starting....")
  (jetty/run-jetty  app {:port  3000}))