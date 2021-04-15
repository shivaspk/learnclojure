;; creates a file called hello.txt and writes data



(spit "hello.txt" "This is a file from clojure!")

(try

  (slurp "hello.txt")

  (catch Exception e (println (str "Exception Occured: " (.getMessage e))))

  (finally (println "Proceed...")))

