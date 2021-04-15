(ns hello-app.core
  (:require [clojure.string :as str] 
            [java-time :as time] 
            [clj-json.core :as json] 
            [clojure.contrib.humanize :as humanize])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (time/year))
  (println (json/generate-string {"foo" "bar"}))
  (println (str/upper-case "now this works!"))
  (println (humanize/numberword 8736)))
