(doseq [n (range 10)] 
    (println (str "line " n)))

(take 3 (repeat "Hello"))

(take 3 (repeatedly #(clojure.string/upper-case "hello")))

(dotimes [n 5] (println "n is" n))

(for [x (range 6)]
  (* x x))

