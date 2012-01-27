(ns myproject.core)

(defn position-check [position-value number]
	(when (= number (last position-value))
		(first position-value)
	)
)

(defn reduce-to-valid [result-set-from-map]
		(filter #(not (nil? %))	result-set-from-map)
)

(defn return-result [list-valid-positions]
	(cond 
		(empty? list-valid-positions)	-1
		(= (count list-valid-positions) 1)	(first list-valid-positions)
		:else	list-valid-positions		
	)
)

(defn map-position-check [number array]
		(map #(position-check % number) (map-indexed vector array))
)

(defn chop [number array]	
	(return-result 	(reduce-to-valid (map-position-check number array)))
)
