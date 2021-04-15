(def counter (atom 0))
(add-watch counter :watcher 
    (fn [key atom oldval newval]
        (println "Changed!")
        (println "old:" oldval)
        (println "new:" newval)))

(reset! counter 100)
(swap!  counter inc)

(def myagent (agent 0))
(add-watch myagent :watcher 
    (fn [key agent oldval newval]
        (println "Agent Changed!")
        (println "old:" oldval)
        (println "new:" newval)))

(send-off myagent + 50)
(println "immediate update")
(println "immediate update")
(println "immediate update")
(send myagent + 500)
(remove-watch myagent :watcher)
(println "watcher removed")
(println "async update")
(println "async update" @myagent)
;;(Thread/sleep 100) 
