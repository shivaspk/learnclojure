(def my-atom (atom 0))

(swap! my-atom inc)
(swap! my-atom inc)
(swap! my-atom (fn [n] (* (+ n n) 2)))

(reset! my-atom 100)

(println (time (doall(map inc (range 100)))))

(println (time (doall(map inc (range 100)))))
