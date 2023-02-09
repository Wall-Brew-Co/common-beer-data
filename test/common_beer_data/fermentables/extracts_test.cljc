(ns common-beer-data.fermentables.extracts-test
  (:require #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.fermentables.extracts :as extracts]
            [common-beer-format.fermentables :as fermentables]))


(deftest validity-test
  (testing "Ensure static dry extract definitions are valid"
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/amber-liquid-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/dark-liquid-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/honey))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/pale-liquid-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/pilsner-liquid-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/rice-extract-syrup))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/rye-liquid-extract))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/sorghum-syrup))
    (is (spoon.spec/test-valid? ::fermentables/fermentable extracts/wheat-liquid-extract)))
  (testing "Ensure dry extract group is valid"
    (is (every? #(spoon.spec/test-valid? ::fermentables/fermentable %) (vals extracts/extracts)))
    (is (every? keyword? (keys extracts/extracts)))))
