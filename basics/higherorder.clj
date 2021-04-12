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

(def update-currency (partial + 0.99))

(println (update-currency 10))

(def shuffle-data (comp first shuffle ))

(println (shuffle-data [1 4 645 34 24]))