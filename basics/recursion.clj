(defn recradd [pending numbers]
(if (first numbers)
    (recur (+ pending (first numbers))
    (next numbers))
    pending))

( println ( recradd 0 (range 10000)))

(loop [i 0]  
    (when (< i 5)    
      (println i)    
      (recur (inc i)); loop i will take this value
  ))

  (defn positive-numbers 
	([] (positive-numbers 1))
	([n] (lazy-seq (cons n (positive-numbers (inc n))))))

    (take 50 (positive-numbers))

    (take 20 (iterate (partial + 2) 0))