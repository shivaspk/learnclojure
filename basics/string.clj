(def message "This is a test String!")
(println (clojure.string/reverse message))
(println (clojure.string/upper-case message))
(println (clojure.string/capitalize message))
(println (clojure.string/replace message #"\w" (fn [ch] (do (println ch) "$"))))

(defn touppercase [s]
    (clojure.string/upper-case s))
( println(touppercase "Hey we are trying new things!"))
