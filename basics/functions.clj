; Destructring example!
(defn location [cordinates]
    (let [lat (first cordinates) lon (last cordinates)]
        (println "Latitude" lat "-----" "Longitude" lon)))

(defn location-new [cordinates]
    (let [[lat lon] cordinates]
        (println "Latitude" lat "-----" "Longitude" lon)))
        (location-new ["23.63" "43.934" "bangalore"])

(defn location-by-map [cordinates]
    (let [lat (:lat cordinates)
          lon (:long cordinates)
          name (:name cordinates)]
        (println "Latitude" lat "-----" "Longitude" lon  "NAME: " (clojure.string/upper-case name))))
        (location-by-map { :lat "23.63" :long "43.934" :name "bangalore"})
