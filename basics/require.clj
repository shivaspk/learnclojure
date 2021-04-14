(require '[clojure.pprint :as prettyprint])
(prettyprint/print-table [{:text "My Name"}{:text "is"}{:text "Siva"}{:text "Val"}])


(use '[clojure.string :only [split]])
(split "This is nEw!" #" ")




