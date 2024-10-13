(ns common-beer-data.hops.both-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.hops.both :as both]
            [common-beer-format.hops :as hops]))


(deftest validity-test
  (testing "Ensure static adjunct definitions are valid"
    (is (spoon.spec/test-valid? ::hops/hop both/el-dorado))
    (is (spoon.spec/test-valid? ::hops/hop both/celeia))
    (is (spoon.spec/test-valid? ::hops/hop both/perle-us))
    (is (spoon.spec/test-valid? ::hops/hop both/northdown))
    (is (spoon.spec/test-valid? ::hops/hop both/horizon))
    (is (spoon.spec/test-valid? ::hops/hop both/columbus))
    (is (spoon.spec/test-valid? ::hops/hop both/northern-brewer))
    (is (spoon.spec/test-valid? ::hops/hop both/challenger))
    (is (spoon.spec/test-valid? ::hops/hop both/citra))
    (is (spoon.spec/test-valid? ::hops/hop both/tettnanger))
    (is (spoon.spec/test-valid? ::hops/hop both/galaxy))
    (is (spoon.spec/test-valid? ::hops/hop both/topaz)))
  (testing "Ensure adjunct group is valid"
    (is (every? #(spoon.spec/test-valid? ::hops/hop %) (vals both/both)))
    (is (every? keyword? (keys both/both)))))
