(reduce + [1 2 3 4 5])

(reduce (fn [{:keys [minimum maximum]} n]
            {
                :minimum (if ( and minimum (> n minimum)) minimum n)
                :maximum (if ( and maximum (< n maximum)) maximum n)
            }
        )
    {}
    [100 2 3 4 500])
