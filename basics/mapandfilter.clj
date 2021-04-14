(println (map inc [1 10 20 3 4 5]))

(println (map (fn [i] (* i 100)) [1 10 20 3 4 5]))

(println (map count ["Test" "Now" "this" "rocks!"]))

;; This is operates on multi sequence but note the result drops the non mapped values
(println (map +  [1 10 20 3 4 5] [21 10 20 32]))

(println (filter odd? [1 10 20 3 4 5]))

(println (take 2 [1 2 3 4 5]))

(println (drop 2 [1 2 3 4 5]))

(println (take-while #(> 25 %) [10 20 30 40 50]))

(println (map (fn [i] (* 10 i)) (filter odd? [10 10 20 30 4 5])))

(->> [1 7 20 30 4 5] (filter odd?) (map (fn [i] (* 10 i))) (println))
