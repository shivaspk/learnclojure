(defmulti area :shape)

(defmethod area :circle [{:keys [r]}]
    (* Math/PI r r))

(defmethod area :rectangle [{:keys [l w]}]
    (* l w))

(area {:shape :circle :r 10})

(area {:shape :rectangle :l 10 :w 20})
