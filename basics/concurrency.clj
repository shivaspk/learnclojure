(def my-atom (atom 100))

;; (swap! my-atom inc)
;; (swap! my-atom inc)
;; (swap! my-atom (fn [n] (* (+ n n) 2)))

;; (reset! my-atom 100)

(println @my-atom)

(println (compare-and-set! my-atom 100 100))
(println @my-atom)

(def my-ref (ref 1 :validator pos?))
(println @my-ref)

(def my-ref (ref 1 :validator neg?))
(println @my-ref)
