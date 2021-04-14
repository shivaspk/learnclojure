(defmacro test []
    '(println "Hello Macro!" (clojure.string/upper-case "woaaawww")))

(test)

(macroexpand '(test))

(defmacro repeatme [n]
    (cons 'do (repeat n '(println "test macro"))))
(repeatme 5)

(println (macroexpand '(repeatme 5)))

;; It's expected to fail as the S will be unresolved
;;(defmacro repeatmystr [n s]
;;    (cons 'do (repeat n '(println s))))
;;(repeatmystr 5)

(defmacro repeatmystr [n s]
    (concat (list 'let ['str s])
        (repeat n '(println str))))
(repeatmystr 5 "abc")

(macroexpand '(repeatmystr 5 "abc"))

(defmacro repeatmystrsq [n s x]
   `(do ~@(repeat n `(println ~s ~x))))
(println (macroexpand '(repeatmystrsq 5 "TEST QQQQ" "Rocks")))
(repeatmystrsq 500 "TEST QQQQ" "Rocks")
