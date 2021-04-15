(ns ring-app.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello Ring!</h1>"})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Ring Starting....")
  (jetty/run-jetty handler {:port  3000}))
