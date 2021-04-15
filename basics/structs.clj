(defstruct Employee :empid :empname :empage)

(def emp1 (struct  Employee 1 "Siva" 35 ))
(def emp2 (struct  Employee 2 "Vijay" 35 ))
(def emp3 (struct  Employee 3 "Raj" 30 ))
(println emp1 emp2 emp3)

(def emp (struct-map Employee :empid 100  :empage 32 :empname "Raju"))
(println emp)

(println "ID: " (:empid emp))
(println "Name: " (:empname emp))
(println "Age: " (:empage emp))

(assoc emp :empname "Rocky!")
(println "ID: " (:empid emp))
(println "Name: " (:empname emp))
(println "Age: " (:empage emp))

(def newemp (assoc emp :empname "Rocky!"))
(println "ID: " (:empid newemp))
(println "Name: " (:empname newemp))
(println "Age: " (:empage newemp))