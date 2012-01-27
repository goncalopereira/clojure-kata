(ns myproject.core)

(defn first-position-is-correct [number array]
		(if (integer? array)
			(= number array)
			(= number (first array))
	
	)
)

(defn chop [number array] 
	(loop [position 0 sub-array array]
		(do
			 (println position sub-array)
	
			(if (first-position-is-correct number sub-array)
				position
				(if (= 0 (count sub-array))
					-1
					(recur (+ position 1) (rest sub-array))
				)
			)
		)
	)
)
	


