(ns common-beer-data.hops.bittering-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.hops.bittering :as bittering]
            [common-beer-format.hops :as hops]))


(deftest validity-test
  (testing "Ensure static hop definitions are valid"
    (is (spoon.spec/test-valid? ::hops/hop bittering/summit))
    (is (spoon.spec/test-valid? ::hops/hop bittering/chelan))
    (is (spoon.spec/test-valid? ::hops/hop bittering/cluster))
    (is (spoon.spec/test-valid? ::hops/hop bittering/eroica))
    (is (spoon.spec/test-valid? ::hops/hop bittering/tillicum))
    (is (spoon.spec/test-valid? ::hops/hop bittering/brewers-gold-us))
    (is (spoon.spec/test-valid? ::hops/hop bittering/nugget))
    (is (spoon.spec/test-valid? ::hops/hop bittering/bravo))
    (is (spoon.spec/test-valid? ::hops/hop bittering/magnum-us))
    (is (spoon.spec/test-valid? ::hops/hop bittering/apollo))
    (is (spoon.spec/test-valid? ::hops/hop bittering/ctz))
    (is (spoon.spec/test-valid? ::hops/hop bittering/super-galena))
    (is (spoon.spec/test-valid? ::hops/hop bittering/warrior))
    (is (spoon.spec/test-valid? ::hops/hop bittering/chinook))
    (is (spoon.spec/test-valid? ::hops/hop bittering/millennium))
    (is (spoon.spec/test-valid? ::hops/hop bittering/newport))
    (is (spoon.spec/test-valid? ::hops/hop bittering/galena))
    (is (spoon.spec/test-valid? ::hops/hop bittering/bullion)))
  (testing "Ensure hop group is valid"
    (is (every? #(spoon.spec/test-valid? ::hops/hop %) (vals bittering/bittering)))
    (is (every? keyword? (keys bittering/bittering)))))
