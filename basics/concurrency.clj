(def my-atom (atom 100))

;; (swap! my-atom inc)
;; (swap! my-atom inc)
;; (swap! my-atom (fn [n] (* (+ n n) 2)))

;; (reset! my-atom 100)

(println @my-atom)

(println (compare-and-set! my-atom 100 100))
(println @my-atom)

(def my-ref-pos (ref 1 :validator pos?))
(println @my-ref-pos)

(def my-ref-neg (ref -1 :validator neg?))
    (dosync 
        (ref-set my-ref-neg -100)
    )
(println @my-ref-neg)
