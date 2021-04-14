(defmacro test []
    '(println "Hello Macro!" (clojure.string/upper-case "woaaawww")))

(test)

(macroexpand '(test))

(defmacro repeatme [n]
    (cons 'do (repeat n '(println "test macro"))))
(repeatme 5)

(macroexpand '(repeatme 5))

;; It's expected to fail as the S will be unresolved
;;(defmacro repeatmystr [n s]
;;    (cons 'do (repeat n '(println s))))
;;(repeatmystr 5)

(defmacro repeatmystr [n s]
    (concat (list 'let ['str s])
        (repeat n '(println str))))
(repeatmystr 5 "TEST")

(macroexpand '(repeatmystr 5 "TEST"))