(defmacro test []
    '(println "Hello Macro!" (clojure.string/upper-case "woaaawww")))

(test)

(macroexpand '(test))

(defmacro repeatme [n]
    (cons 'do (repeat n '(println "test macro"))))
(repeatme 5)

(macroexpand '(repeatme 5))