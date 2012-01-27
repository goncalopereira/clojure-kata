(ns myproject.core)

(defn chop [number array] 
	(loop [position 0 sub-array array]
		(if (= number (first sub-array))
			position
			(if (= 0 (count sub-array))
				-1
				(recur (+ position 1) (rest sub-array))
			)
		)
	)
)

	


