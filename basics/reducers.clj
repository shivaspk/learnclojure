(println (reduce + [1 2 3 4 5]))

(println (reduce (fn [{:keys [minimum maximum]} n]
            {
                :minimum (if ( and minimum (> n minimum)) minimum n)
                :maximum (if ( and maximum (< n maximum)) maximum n)
            }
        )
    {}
    [100 2 3 4 500]))

(println    (reduce #(assoc %1 %2 (inc (%1 %2 0)))
    {}
    (re-seq #"\w+" "THIS IS IS IS IS IS A NEW FILE UPDATED IS NOW NEW THINGS")))
