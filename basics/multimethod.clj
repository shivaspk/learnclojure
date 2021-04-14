(defmulti area :shape)

(defmethod area :circle [{:keys [r]}]
    (* Math/PI r r))

(defmethod area :rectangle [{:keys [l w]}]
    (* l w))

(defmethod area :default [shape]
    (throw (Exception. (str "Unknown Shape: " shape))))
    
    

(println(area {:shape :circle :r 10}))

(println(area {:shape :rectangle :l 10 :w 20}))

;;(println(area {:shape :square :r 10}))
