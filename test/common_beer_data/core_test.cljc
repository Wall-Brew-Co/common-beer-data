(ns common-beer-data.core-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-data.core :as data]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.hops :as hops]
            [common-beer-format.styles :as styles]
            [common-beer-format.yeasts :as yeasts]))


(defn note-ends-with-period?
  "Check if the notes attribute ends with a period.

   If not, print a message and return false."
  [data]
  (let [notes             (get data :notes)
        ends-with-period? (str/ends-with? notes ".")]
    (if ends-with-period?
      true
      (do (println (str "Notes for \"" (:name data) "\" do not end with period."))
          false))))


(deftest fermentables-test
  (testing "Ensure all fermentables are well formed"
    (is (seq data/all-fermentables))
    (is (every? keyword? (keys data/all-fermentables)))
    (is (every? note-ends-with-period? (vals data/all-fermentables)))
    (is (every? #(spoon.spec/test-valid? ::fermentables/fermentable %) (vals data/all-fermentables)))))


(deftest hops-test
  (testing "Ensure all hops are well formed"
    (is (seq data/all-hops))
    (is (every? keyword? (keys data/all-hops)))
    (is (every? note-ends-with-period? (vals data/all-hops)))
    (is (every? #(spoon.spec/test-valid? ::hops/hop %) (vals data/all-hops)))))


(deftest style-test
  (testing "Ensure all styles are well formed"
    (is (seq data/all-style-guides))
    (is (every? keyword? (keys data/all-style-guides)))
    (is (every? note-ends-with-period? (vals data/all-style-guides)))
    (is (every? #(spoon.spec/test-valid? ::styles/style %) (vals data/all-style-guides)))))


(deftest yeast-test
  (testing "Ensure all yeasts are well formed"
    (is (seq data/all-yeasts))
    (is (every? keyword? (keys data/all-yeasts)))
    (is (every? note-ends-with-period? (vals data/all-yeasts)))
    (is (every? #(spoon.spec/test-valid? ::yeasts/yeast %) (vals data/all-yeasts)))))


(deftest select-*-tests
  (testing "Basic tests around selection of ingredients"
    (is (empty? (data/select-fermentables {})))
    (is (> (count (data/select-fermentables {:include-adjuncts? true}))
           (count (data/select-fermentables {}))))
    (is (> (count (data/select-fermentables {:include-dry-extracts? true}))
           (count (data/select-fermentables {}))))
    (is (> (count (data/select-fermentables {:include-extracts? true}))
           (count (data/select-fermentables {}))))
    (is (> (count (data/select-fermentables {:include-grains? true}))
           (count (data/select-fermentables {}))))
    (is (> (count (data/select-fermentables {:include-sugars? true}))
           (count (data/select-fermentables {}))))
    (is (empty? (data/select-hops {})))
    (is (> (count (data/select-hops {:include-aroma? true}))
           (count (data/select-hops {}))))
    (is (> (count (data/select-hops {:include-bittering? true}))
           (count (data/select-hops {}))))
    (is (> (count (data/select-hops {:include-both? true}))
           (count (data/select-hops {}))))
    (is (empty? (data/select-style-guides {})))
    (is (> (count (data/select-style-guides {:include-bjcp-2015? true}))
           (count (data/select-style-guides {}))))
    (is (empty? (data/select-yeasts {})))
    (is (> (count (data/select-yeasts {:include-brewtek? true}))
           (count (data/select-yeasts {}))))
    (is (> (count (data/select-yeasts {:include-dcl-fermentis? true}))
           (count (data/select-yeasts {}))))
    (is (> (count (data/select-yeasts {:include-lallemand? true}))
           (count (data/select-yeasts {}))))
    (is (> (count (data/select-yeasts {:include-white-labs? true}))
           (count (data/select-yeasts {}))))
    (is (> (count (data/select-yeasts {:include-wyeast? true}))
           (count (data/select-yeasts {}))))))


(deftest get-*-tests
  (testing "Basic tests around selection of ingredients"
    (is (spoon.spec/test-valid? ::fermentables/fermentable (data/get-fermentable :light-dry-extract)))
    (is (spoon.spec/test-valid? ::fermentables/fermentable (data/get-fermentable :light-dry-extract :a)))
    (is (nil? (data/get-fermentable :ope)))
    (is (= :baz (data/get-fermentable :ope :baz)))
    (is (spoon.spec/test-valid? ::hops/hop (data/get-hop :crystal)))
    (is (spoon.spec/test-valid? ::hops/hop (data/get-hop :crystal :a)))
    (is (nil? (data/get-hop :ope)))
    (is (= :baz (data/get-hop :ope :baz)))
    (is (spoon.spec/test-valid? ::yeasts/yeast (data/get-yeast :german-ale-1007)))
    (is (spoon.spec/test-valid? ::yeasts/yeast (data/get-yeast :german-ale-1007 :a)))
    (is (nil? (data/get-yeast :ope)))
    (is (= :baz (data/get-yeast :ope :baz)))))
