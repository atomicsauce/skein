(ns skein.core-test
  (:require [clojure.test :refer :all]
            [skein.core :refer :all]))

(deftest canary-zero
  (testing "skein core evaluates to true"
    (is (true? (skein.core/-main)))))
