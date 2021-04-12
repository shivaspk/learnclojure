; this is a list example
(def myvector (list 100 10 23 45 67))
(println "*******List output********")
(println "Sorted:" (sort mylist))
(println "First:" (first mylist))
(println "Rest:" (rest mylist))
(println "at 4th Position:" (nth mylist 3))

; this is a vector example
(def myvector (vector 100 10 23 45 67))
(println "*******Vector output********")
(println "Sorted:" (sort myvector))
(println "First:" (first myvector))
(println "Rest:" (rest myvector))
(println "at 0th Position:" (get myvector 0))

(def mymap (hash-map :INR "INDIA", :USD "US", :GBP "UK", :GBP "United Kingdom", :USD "United States"))
(println "*******Map output********")
(println mymap)
(println "Country:" (get mymap :GBP))

