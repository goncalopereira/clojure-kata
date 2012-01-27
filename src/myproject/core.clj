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
		(first list-valid-positions)
	)
)

(defn chop [number array]	
	(let [list-valid-positions	
		(get-valid-positions
				(map 
					#(check-position % number) 
					(map-indexed vector array)	
				)
			)
		]
		
		(return-result list-valid-positions)
	)	
)

