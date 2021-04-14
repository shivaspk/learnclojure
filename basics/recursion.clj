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