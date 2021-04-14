(defmacro test []
    '(println "Hello Macro!" (clojure.string/upper-case "woaaawww")))

(test)

(macroexpand '(test))