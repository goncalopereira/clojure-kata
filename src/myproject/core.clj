(ns myproject.core)

(defn position-check [position-value number]
	(when (= number (last position-value))
		(first position-value)
	)
)

(defn reduce-to-valids [result-set-from-map]
		(filter #(not (nil? %))	result-set-from-map)
)

(defn return-result [valid-positions]
	(cond 
		(empty? valid-positions)	-1
		(= (count valid-positions) 1)	(first valid-positions)
		:else	valid-positions		
	)
)

(defn map-position-check [number array]
		(map #(position-check % number) (map-indexed vector array))
)

(defn chop [number array]	
	(return-result 	(reduce-to-valids (map-position-check number array)))
)
