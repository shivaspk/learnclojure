(def mypromise (promise))

(doto (Thread. (fn [] (deliver mypromise 100))) .start)

(println (deref mypromise))

(def myatom (atom 5))

(doto (Thread. (fn []

                 (swap! myatom
                        (fn [n] (* (+ n n) 2))))) .start)

(println @myatom)