(println (map inc [1 10 20 3 4 5]))

(println (map (fn [i] (* i 100)) [1 10 20 3 4 5]))

(println (map count ["Test" "Now" "this" "rocks!"]))

;; This is operates on multi sequence but note the result drops the non mapped values
(println (map +  [1 10 20 3 4 5] [21 10 20 32]))