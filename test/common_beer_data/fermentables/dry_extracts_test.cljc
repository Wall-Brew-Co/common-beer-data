(ns common-beer-data.fermentables.dry-extracts-test
  (:require #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.fermentables.dry-extracts :as dry-extracts]
            [common-beer-format.fermentables :as fermentables]))


(deftest validity-test
  (testing "Ensure static dry extract definitions are valid"
    (is (spoon.spec/test-valid? ::fermentables/fermentable dry-extracts/amber-dry-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable dry-extracts/dark-dry-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable dry-extracts/extra-light-dry-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable dry-extracts/light-dry-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable dry-extracts/wheat-dry-extract)))
  (testing "Ensure dry extract group is valid"
    (is (every? #(spoon.spec/test-valid? ::fermentables/fermentable %) (vals dry-extracts/dry-extracts)))
    (is (every? keyword? (keys dry-extracts/dry-extracts)))))
