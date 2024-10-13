(ns common-beer-data.fermentables.adjuncts-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.fermentables.adjuncts :as adjuncts]
            [common-beer-format.fermentables :as fermentables]))


(deftest validity-test
  (testing "Ensure static adjunct definitions are valid"
    (is (spoon.spec/test-valid? ::fermentables/fermentable adjuncts/barley-hulls))
    (is (spoon.spec/test-valid? ::fermentables/fermentable adjuncts/grits))
    (is (spoon.spec/test-valid? ::fermentables/fermentable adjuncts/rice-hulls)))
  (testing "Ensure adjunct group is valid"
    (is (every? #(spoon.spec/test-valid? ::fermentables/fermentable %) (vals adjuncts/adjuncts)))
    (is (every? keyword? (keys adjuncts/adjuncts)))))
