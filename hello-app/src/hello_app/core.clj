(ns hello-app.core
  (:require [clojure.string :as str] [java-time :as time])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (time/year))
  (println (str/upper-case "now this works!")))
