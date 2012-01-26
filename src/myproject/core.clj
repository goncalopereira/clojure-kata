(ns myproject.core)

(defn first-position-is-correct [number array]
	(= number (first array))
)

(defn chop [number array] 
	(if (first-position-is-correct number array)
		0
		-1
	) 
)


