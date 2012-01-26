(ns myproject.core)

(defn first-position-is-correct [number array]
	(do 
		(println number array)
		(if (integer? array)
			(= number array)
			(= number (first array))
	
		)
	)
)

(defn chop [number array] 
	(if (first-position-is-correct number array)
		0
		(if (first-position-is-correct number (rest array))
			1
			-1
		)
	) 
)


