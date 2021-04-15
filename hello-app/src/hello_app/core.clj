(ns hello-app.core
  (:require [clojure.string :as str] [java-time :as time] [clj-json.core :as json])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (time/year))
  (println (json/generate-string {"foo" "bar"}))
  (println (str/upper-case "now this works!")))
