(ns myproject.core)

(defn number-is-out-of-bounds [number array]
	(or (empty? array) (< number (first array)) (> number (last array)))
)

(defn chop [number array]
	(loop [position 0 sub-array array]
		(do (println position sub-array)
		(if (number-is-out-of-bounds number sub-array)
			-1
			(if (= number (first sub-array))
				position
				(recur (+ position 1) (rest sub-array))
			)
		))
	)
)	
