(def counter (agent 0))
(println  "AGENT" @counter)
(send counter + 50)
(println "AGENT" @counter)

(Thread/sleep 100) 
(println "AGENT" @counter)


(def counter (atom 0))
(println "ATOM" @counter)
(swap! counter + 50)
(println "ATOM"  @counter)

(Thread/sleep 100) 
(println "ATOM" @counter)