(defn operate [f arg] (f arg))

(println (operate clojure.string/upper-case "test string"))
(println (operate clojure.string/reverse "test string"))
(println (operate inc 30))