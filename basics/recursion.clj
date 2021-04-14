(defn recradd [pending numbers]
(if (first numbers)
    (recradd (+ pending (first numbers))
    (next numbers))
    pending))

( println ( recradd 0 (range 10000)))