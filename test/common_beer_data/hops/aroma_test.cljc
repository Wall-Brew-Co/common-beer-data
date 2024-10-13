(ns common-beer-data.hops.aroma-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.hops.aroma :as aroma]
            [common-beer-format.hops :as hops]))


(deftest validity-test
  (testing "Ensure static hop definitions are valid"
    (is (spoon.spec/test-valid? ::hops/hop aroma/ahtanum))
    (is (spoon.spec/test-valid? ::hops/hop aroma/amarillo))
    (is (spoon.spec/test-valid? ::hops/hop aroma/cascade))
    (is (spoon.spec/test-valid? ::hops/hop aroma/centennial))
    (is (spoon.spec/test-valid? ::hops/hop aroma/crystal))
    (is (spoon.spec/test-valid? ::hops/hop aroma/delta))
    (is (spoon.spec/test-valid? ::hops/hop aroma/east-kent-golding))
    (is (spoon.spec/test-valid? ::hops/hop aroma/fuggle-us))
    (is (spoon.spec/test-valid? ::hops/hop aroma/glacier))
    (is (spoon.spec/test-valid? ::hops/hop aroma/golding-us))
    (is (spoon.spec/test-valid? ::hops/hop aroma/hallertau-us))
    (is (spoon.spec/test-valid? ::hops/hop aroma/liberty))
    (is (spoon.spec/test-valid? ::hops/hop aroma/mosaic))
    (is (spoon.spec/test-valid? ::hops/hop aroma/mt-hood))
    (is (spoon.spec/test-valid? ::hops/hop aroma/palisade))
    (is (spoon.spec/test-valid? ::hops/hop aroma/saaz-us))
    (is (spoon.spec/test-valid? ::hops/hop aroma/santiam))
    (is (spoon.spec/test-valid? ::hops/hop aroma/simcoe))
    (is (spoon.spec/test-valid? ::hops/hop aroma/spalt))
    (is (spoon.spec/test-valid? ::hops/hop aroma/sterling))
    (is (spoon.spec/test-valid? ::hops/hop aroma/strisselspalt))
    (is (spoon.spec/test-valid? ::hops/hop aroma/ultra))
    (is (spoon.spec/test-valid? ::hops/hop aroma/vanguard))
    (is (spoon.spec/test-valid? ::hops/hop aroma/willamette)))
  (testing "Ensure hop group is valid"
    (is (every? #(spoon.spec/test-valid? ::hops/hop %) (vals aroma/aroma)))
    (is (every? keyword? (keys aroma/aroma)))))
