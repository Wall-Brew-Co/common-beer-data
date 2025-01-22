(ns common-beer-data.yeasts.dcl-fermentis-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.yeasts.dcl-fermentis :as sut]
            [common-beer-format.yeasts :as yeasts]))





(deftest validity-test
  (testing "Ensure DCL Fermentis group is valid"
    (is (every? #(spoon.spec/test-valid? ::yeasts/yeasts %) (vals sut/dcl-fermentis)))
    (is (every? keyword? (keys sut/dcl-fermentis)))))
