(ns functional-cljs.tests.base 
  (:require-macros [cemerick.cljs.test
    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]
            [functional-cljs.src.base :as base]))

(deftest answer
  (is (= 42 (+ 1 41))))

(deftest truthy-true
  (is (base/truthy true)))

(deftest existy-42
  (is (base/existy 42)))

(deftest existy-undefined
  (is (not (base/existy undefined))))

(set! *main-cli-fn* t/run-all-tests)
