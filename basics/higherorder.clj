(defn operate [f arg] (f arg))

(println (operate clojure.string/upper-case "test string"))
(println (operate clojure.string/reverse "test string"))
(println (operate inc 30))

(defn multi-operate [f & arg] (f arg))

(println (multi-operate clojure.string/join "test string" " " "wow"))
;; (println (multi-operate clojure.string/reverse "test string"))
;; (println (multi-operate inc 30))

(defn random-operation [] (first (shuffle [* / + -])))

((random-operation) 10 5)