(ns common-beer-data.options
  "A namespace of static keyword options for common-beer-data/core."
  {:added "1.5"})


;; Fermentables

(def include-adjuncts?
  "A keyword option for `select-fermentables` to include adjuncts."
  :include-adjuncts?)


(def include-dry-extracts?
  "A keyword option for `select-fermentables` to include dry extracts."
  :include-dry-extracts?)


(def include-extracts?
  "A keyword option for `select-fermentables` to include extracts."
  :include-extracts?)


(def include-grains?
  "A keyword option for `select-fermentables` to include grains."
  :include-grains?)


(def include-sugars?
  "A keyword option for `select-fermentables` to include sugars."
  :include-sugars?)


;; Hops

(def include-aroma?
  "A keyword option for `select-hops` to include aromatic hops."
  :include-aroma?)


(def include-bittering?
  "A keyword option for `select-hops` to include bittering hops."
  :include-bittering?)


(def include-both?
  "A keyword option for `select-hops` to include hops which can be used for both aroma and bittering."
  :include-both?)


;; Style Guides

(def include-bjcp-2015?
  "A keyword option for `select-style-guides` to include 2015 BJCP style guides."
  :include-bjcp-2015?)


;; Yeasts

(def include-brewtek?
  "A keyword option for `select-yeasts` to include Brewtek yeasts."
  :include-brewtek?)


(def include-dcl-fermentis?
  "A keyword option for `select-yeasts` to include DCL Fermentis yeasts."
  :include-dcl-fermentis?)


(def include-lallemand?
  "A keyword option for `select-yeasts` to include Lallemand yeasts."
  :include-lallemand?)


(def include-white-labs?
  "A keyword option for `select-yeasts` to include White Labs yeasts."
  :include-white-labs?)


(def include-wyeast?
  "A keyword option for `select-yeasts` to include Wyeast yeasts."
  :include-wyeast?)
