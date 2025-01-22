(ns common-beer-data.yeasts.brewtek-test
  (:require [clojure.test :refer [deftest is testing]]
             [com.wallbrew.spoon.spec :as spoon.spec]
             [common-beer-data.yeasts.brewtek :as sut]
             [common-beer-format.yeasts :as yeasts]))


  (deftest validity-test
    (testing "Ensure Brewtek group is valid"
      (is (every? #(spoon.spec/test-valid? ::yeasts/yeasts %) (vals sut/brewtek)))
      (is (every? keyword? (keys sut/brewtek)))))
