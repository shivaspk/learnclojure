(println (map #(* 10 %) (range 10)))

(map(fn [i] (print ".") (* 10 i)) (range 5))

(remove neg? [1 -2 2 -1 3 7 0])

(def temperature-by-day  [18 20 24 23 27 24 22 21 21 20 32 33 30 29 35 28 25 24 28 29 30] )

(map 
    (fn [today yes]
        (cond 
            (> today yes) :warmer
            (< today yes) :colder
            (= today yes) :unchanged
            )
    )
    (rest temperature-by-day)
    temperature-by-day)

