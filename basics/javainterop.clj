;; . notation for java classes
(println (.toUpperCase "now this is java!"))

(println (.toLowerCase "TESTING!"))

(def mystr (new String "Test new!"))

(println ( type mystr))

;;access system props
(println(System/getProperty "java.vm.version"))

;;access PI in two ways
(println (Math/PI))
(println (. Math PI))

;;import java class
(import java.util.Date)
(let [date (Date.)]
(println date))

;;map
(doto (new java.util.HashMap) (.put "a" 1) (.put "b" 2))
