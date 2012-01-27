(ns myproject.core)

(defn chop [number array]
	(if (or (nil? (last array)) (< (last array) number))
		-1 
		(loop [position 0 sub-array array]
			(do (println position sub-array)
			(if (or (= 0 (count sub-array)) (< number (first sub-array)))
				-1
				(if (= number (first sub-array))
					position
					(recur (+ position 1) (rest sub-array))
				)
			))
		)
	)	
)

	


