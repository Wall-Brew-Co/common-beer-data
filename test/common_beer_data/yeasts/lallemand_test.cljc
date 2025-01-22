(ns common-beer-data.yeasts.lallemand-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.yeasts.lallemand :as sut]
            [common-beer-format.yeasts :as yeasts]))


(deftest validity-test
  (testing "Ensure Lallemand group is valid"
    (is (every? #(spoon.spec/test-valid? ::yeasts/yeasts %) (vals sut/lallemand)))
    (is (every? keyword? (keys sut/lallemand)))))
