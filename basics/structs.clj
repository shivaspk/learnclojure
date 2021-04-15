;; define a struct
(defstruct Employee :empid :empname :empage)

(def emp1 (struct  Employee 1 "Siva" 35 ))
(def emp2 (struct  Employee 2 "Vijay" 35 ))
(def emp3 (struct  Employee 3 "Raj" 30 ))
(println emp1 emp2 emp3)

;;creating a struct map
(def emp (struct-map Employee :empid 100  :empage 32 :empname "Raju"))
(println emp)

;;accessing individual fields of struct map
(println "ID: " (:empid emp))
(println "Name: " (:empname emp))
(println "Age: " (:empage emp))

;; to show immutability 
(assoc emp :empname "Rocky!")
(println "ID: " (:empid emp))
(println "Name: " (:empname emp))
(println "Age: " (:empage emp))

;; can only be done during new def! 
(def newemp (assoc emp :empname "Rocky!"))
(println "ID: " (:empid newemp))
(println "Name: " (:empname newemp))
(println "Age: " (:empage newemp))