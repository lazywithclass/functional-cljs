(ns functional-cljs
  (:require-macros [cemerick.cljs.test
    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t])
)

(deftest answer
  (is (= 42 (+ 1 41))))

(set! *main-cli-fn* t/run-all-tests)
