;;create a collection with META
(def myoddmap (with-meta [1 3 5] {:type "Odd Values" :datatype "Numbers"}))
;;print map
(println myoddmap)

;; print metadata
(meta myoddmap)