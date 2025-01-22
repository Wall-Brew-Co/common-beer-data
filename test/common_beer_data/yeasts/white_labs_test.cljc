(ns common-beer-data.yeasts.white-labs-test
  (:require [clojure.test :refer [deftest is testing]]
             [com.wallbrew.spoon.spec :as spoon.spec]
             [common-beer-data.yeasts.white-labs :as sut]
             [common-beer-format.yeasts :as yeasts]))


  (deftest validity-test
    (testing "Ensure White Labs group is valid"
      (is (every? #(spoon.spec/test-valid? ::yeasts/yeasts %) (vals sut/white-labs)))
      (is (every? keyword? (keys sut/white-labs)))))
