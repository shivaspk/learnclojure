;; creates a file called hello.txt and writes data



;;(spit "hello.txt" "This is a file from clojure! THis is secondline")

;; read a file safely else print a error
(try

;;   (slurp "hello1.txt")

(with-open [rdr (clojure.java.io/reader "hello.txt")]
    (reduce conj [] (line-seq rdr)))

  (catch java.io.FileNotFoundException e (println (str "File related Exception Occured: " (.getMessage e))))
  (catch Exception e (println (str "Exception Occured: " (.getMessage e))))

  (finally (println "Proceed...")))

