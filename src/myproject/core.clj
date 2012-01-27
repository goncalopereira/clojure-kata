(ns myproject.core)

(defn chop [number array] 
	(loop [position 0 sub-array array]
		(if (= 0 (count sub-array))
			-1
			(if (= number (first sub-array))
				position
				(recur (+ position 1) (rest sub-array))
			)
		)
	)
)

	


