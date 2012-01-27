(ns myproject.core)

(defn first-position-is-correct [number array]
		(= number (first array))	
)

(defn chop [number array] 
	(loop [position 0 sub-array array]
		(if (first-position-is-correct number sub-array)
			position
			(if (= 0 (count sub-array))
				-1
				(recur (+ position 1) (rest sub-array))
			)
		)
	)
)

	


