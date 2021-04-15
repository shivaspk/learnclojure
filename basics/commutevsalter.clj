(def counter (ref 0))

(defn commute-inc! [counter]
    (dosync (Thread/sleep 100) (commute counter inc)))

(defn alter-inc! [counter]
    (dosync (Thread/sleep 100) (alter counter inc)))

(defn bombard-counter! [n f counter]
    (apply pcalls (repeat n #(f counter))))

(dosync (ref-set counter 0))
(time (doall (bombard-counter! 20 alter-inc! counter)))

(dosync (ref-set counter 0))
(time (doall (bombard-counter! 20 commute-inc! counter)))