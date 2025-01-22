(ns common-beer-data.yeasts.wyeast-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.yeasts.wyeast :as sut]
            [common-beer-format.yeasts :as yeasts]))


(deftest validity-test
  (testing "Ensure Wyeast group is valid"
    (is (every? #(spoon.spec/test-valid? ::yeasts/yeasts %) (vals sut/wyeast)))
    (is (every? keyword? (keys sut/wyeast)))))
