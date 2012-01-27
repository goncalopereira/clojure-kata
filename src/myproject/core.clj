(ns myproject.core)

(defn check-position [position-value number]
	(when (= number (last position-value))
		(first position-value)
	)
)

(defn get-valid-positions [result-set-from-map]
		(filter 
			#(not (nil? %))
			result-set-from-map
		)
)

(defn return-result [list-valid-positions]
	(if (empty? list-valid-positions)
		-1
		(if (= (count list-valid-positions) 1)
			(first list-valid-positions)
			list-valid-positions
		)
	)
)

(defn get-map-index-value [number array]
		(map 
			#(check-position % number) 
			(map-indexed vector array)	
		)
)

(defn chop [number array]	
	(return-result 	(get-valid-positions (get-map-index-value number array)))
)
		

