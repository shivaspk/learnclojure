; this is a list example
(def myvector (list 100 10 23 45 67))
(println "*******List output********")
(println "Sorted:" (sort mylist))
(println "First:" (first mylist))
(println "Rest:" (rest mylist))
(println "at 4th Position:" (nth mylist 3))
(println "Cojoined:" (conj mylist 500))

; this is a vector example
(def myvector (vector 100 10 23 45 67))
(println "*******Vector output********")
(println "Sorted:" (sort myvector))
(println "First:" (first myvector))
(println "Rest:" (rest myvector))
(println "at 0th Position:" (get myvector 0))

; this is a map example
(def mymap (hash-map :INR "INDIA", :USD "US", :GBP "UK", :GBP "United Kingdom", :USD "United States"))
(println "*******Map output********")
(println mymap)
(println "Country:" (get mymap :GBP))
(println (assoc mymap :SGD "Singapore"))
(println (update mymap :INR clojure.string/lower-case))
(println (empty? []))
(println (empty? mymap))

;Additional functions
(println "*******Into output********")
(println (into #{} [1 2 2 3 3 3 4 4 4 5 5 5 5]))
(println (sort (into #{} [1 2 2 3 3 3 4 4 4 5 5 5 5])))

;nil and false
(println (if -1 "True" "False"))
(println (if 0 "True" "False"))
(println (if [] "True" "False"))

(println (if (nil? nil) "True NIL" "False"))

(println (if false "True" "False"))

(println (if "True" "Empty False"))

;logical operators
(println (and true true))
(println (and true true false))

(println "Equality of Vectors : " (= [4 5 9] [5 5 9]))