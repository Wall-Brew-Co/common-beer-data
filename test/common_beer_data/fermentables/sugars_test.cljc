(ns common-beer-data.fermentables.sugars-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.fermentables.sugars :as sugars]
            [common-beer-format.fermentables :as fermentables]))


(deftest validity-test
  (testing "Ensure static grain definitions are valid"
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/dark-brown-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/light-brown-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/belgian-candi-syrup-45l))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/belgian-candi-syrup-90l))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/belgian-candi-syrup-180l))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/clear-candi-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/cane-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/beet-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/dextrose))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/corn-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/corn-syrup))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/demerara-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/invert-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/milk-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/lactose))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/molasses))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/maple-syrup))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/sucrose))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/table-sugar))
    (is (spoon.spec/test-valid? ::fermentables/fermentable sugars/turbinado)))
  (testing "Ensure grains group is valid"
    (is (every? #(spoon.spec/test-valid? ::fermentables/fermentable %) (vals sugars/sugars)))
    (is (every? keyword? (keys sugars/sugars)))))
