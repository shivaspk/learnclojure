(def counter (atom 0))
(add-watch counter :watcher 
    (fn [key atom oldval newval]
        (println "Changed!")
        (println "old:" oldval)
        (println "new:" newval)))

(reset! counter 100)
(swap!  counter inc)
