(ns myproject.test.core
  (:use [myproject.core])
  (:use [clojure.test]))

(deftest empty-array-is-false (is (= -1 (chop 3 []) )))
(deftest size-one-array-wrong-param-is-false (is (= -1 (chop 3 [1]) )))
(deftest size-one-array-right-param-on-0-is-0  (is (=  0 (chop 1 [1]) )))
 
(deftest size-three-array-right-param-on-0-is-0 (is (=  0 (chop 1 [1 3 5]) )))
(deftest size-three-array-right-param-on-1-is-1 (is (=  1 (chop 3 [1 3 5]) )))
(deftest size-three-array-right-param-on-2-is-2  (is (=  2 (chop 5 [1 3 5]) )))
(deftest size-three-array-wrong-param--0-is-false  (is (= -1 (chop 0 [1 3 5]) )))
(deftest size-three-array-wrong-param-2-is-false (is (= -1 (chop 2 [1 3 5]) )))
(deftest size-three-array-wrong-param-4-is-false  (is (= -1 (chop 4 [1 3 5]) )))
;(deftest size-three-array-wrong-param-6-is-false  (is (= -1 (chop 6 [1 3 5]) )))
 
;(deftest size-four-array-right-param-on-0-is-0 (is (=  0 (chop 1 [1 3 5 7]) )))
;(deftest size-four-array-right-param-on-1-is-1  (is (=  1 (chop 3 [1 3 5 7]) )))
;(deftest size-four-array-right-param-on-2-is-2  (is (=  2 (chop 5 [1 3 5 7]) )))
;(deftest size-four-array-right-param-on-3-is-3  (is (=  3 (chop 7 [1 3 5 7]) )))
;(deftest size-four-array-wrong-param-0-is-false  (is (= -1 (chop 0 [1 3 5 7]) )))
;(deftest size-four-array-wrong-param-2-is-false  (is (= -1 (chop 2 [1 3 5 7]) )))
;(deftest size-four-array-wrong-param-4-is-false  (is (= -1 (chop 4 [1 3 5 7]) )))
;(deftest size-four-array-wrong-param-6-is-false  (is (= -1 (chop 6 [1 3 5 7]) )))
;(deftest size-four-array-wrong-param-8-is-false  (is (= -1 (chop 8 [1 3 5 7]) )))

