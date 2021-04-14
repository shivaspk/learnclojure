(def randomize (doall (take 10000000 (repeatedly (partial rand-int 1000)))))

(defn int-conter [i x]
    (count (filter #(= % i) x)))

(time(doall(map #(int-conter % randomize) [2 3 4 666 745 390 999])))
(time(doall(pmap #(int-conter % randomize) [2 3 4 666 745 390 999])))