(ns common-beer-data.core-test
  (:require [clojure.spec.alpha :as s]
            [common-beer-data.core :as data]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.hops :as hops]
            [common-beer-format.styles :as styles]
            [common-beer-format.yeasts :as yeasts]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest fermentables-test
  (testing "Ensure all fermentables are well formed"
    (is (seq data/all-fermentables))
    (is (every? keyword? (keys data/all-fermentables)))
    (is (every? #(s/valid? ::fermentables/fermentable %) (vals data/all-fermentables)))))


(deftest hops-test
  (testing "Ensure all hops are well formed"
    (is (seq data/all-hops))
    (is (every? keyword? (keys data/all-hops)))
    (is (every? #(s/valid? ::hops/hop %) (vals data/all-hops)))))


(deftest style-test
  (testing "Ensure all styles are well formed"
    (is (seq data/all-style-guides))
    (is (every? keyword? (keys data/all-style-guides)))
    (is (every? #(s/valid? ::styles/style %) (vals data/all-style-guides)))))


(deftest yeast-test
  (testing "Ensure all yeasts are well formed"
    (is (seq data/all-yeasts))
    (is (every? keyword? (keys data/all-yeasts)))
    (is (every? #(s/valid? ::yeasts/yeast %) (vals data/all-yeasts)))))


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
    (is (s/valid? ::fermentables/fermentable (data/get-fermentable :light-dry-extract)))
    (is (s/valid? ::fermentables/fermentable (data/get-fermentable :light-dry-extract :a)))
    (is (nil? (data/get-fermentable :ope)))
    (is (= :baz (data/get-fermentable :ope :baz)))
    (is (s/valid? ::hops/hop (data/get-hop :crystal)))
    (is (s/valid? ::hops/hop (data/get-hop :crystal :a)))
    (is (nil? (data/get-hop :ope)))
    (is (= :baz (data/get-hop :ope :baz)))
    (is (s/valid? ::yeasts/yeast (data/get-yeast :german-ale-1007)))
    (is (s/valid? ::yeasts/yeast (data/get-yeast :german-ale-1007 :a)))
    (is (nil? (data/get-yeast :ope)))
    (is (= :baz (data/get-yeast :ope :baz)))))
