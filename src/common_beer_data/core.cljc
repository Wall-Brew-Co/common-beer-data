(ns common-beer-data.core
  "Quick functions and references to ingredient data."
  (:require [common-beer-data.fermentables.adjuncts :as adjuncts]
            [common-beer-data.fermentables.dry-extracts :as dry-extracts]
            [common-beer-data.fermentables.extracts :as extracts]
            [common-beer-data.fermentables.grains :as grains]
            [common-beer-data.fermentables.sugars :as sugars]
            [common-beer-data.hops.aroma :as aroma]
            [common-beer-data.hops.bittering :as bittering]
            [common-beer-data.hops.both :as both]
            [common-beer-data.styles.bjcp-2015.bjcp-2015 :as bjcp-2015]
            [common-beer-data.yeasts.brewtek :as brewtek]
            [common-beer-data.yeasts.dcl-fermentis :as dcl-fermentis]
            [common-beer-data.yeasts.lallemand :as lallemand]
            [common-beer-data.yeasts.white-labs :as white-labs]
            [common-beer-data.yeasts.wyeast :as wyeast]))


(defn select-fermentables
  "Returns a map from keywords to `common-beer-format.fermentables/fermentable` maps based on their attributes.
   Legal selection keys include:
     - `include-adjuncts?` : Whether or not to include adjuncts in the selection. Adjuncts are non-malted grain starches.
     - `include-dry-extracts?` : Whether or not to include dry extracts in the selection. Dry extracts are concentrated extracts of malted grain.
     - `include-extracts?` : Whether or not to include extracts in the selection. Extracts are liquid extracts of malted grain.
     - `include-grains?` : Whether or not to include malted grains in the selection.
     - `include-sugars?` : Whether or not to include pure sugars or sugar syrups in the selection."
  {:added "1.0"}
  [{:keys [include-adjuncts? include-dry-extracts? include-extracts? include-grains? include-sugars?]}]
  (cond-> {}
    include-adjuncts?     (merge adjuncts/adjuncts)
    include-dry-extracts? (merge dry-extracts/dry-extracts)
    include-extracts?     (merge extracts/extracts)
    include-grains?       (merge grains/grains)
    include-sugars?       (merge sugars/sugars)))


(def all-fermentables
  "A map from keywords to `common-beer-format.fermentables/fermentable` maps for all fermentables.
   This is a convenience function for `select-fermentables` with all options set to true."
  (select-fermentables {:include-adjuncts?     true
                        :include-dry-extracts? true
                        :include-extracts?     true
                        :include-grains?       true
                        :include-sugars?       true}))


(defn get-fermentable
  "Returns the `common-beer-format.hops/hop` at the given keyword.
   If the keyword is not found, returns nil a la `clojure.core/get`.
   An optional last entry may be used to specify a default value to return if the keyword is not found."
  {:added "1.0"}
  ([fermentable-key]
   (get all-fermentables fermentable-key))
  ([fermentable-key default-value]
   (get all-fermentables fermentable-key default-value)))


(defn select-hops
  "Returns a map from keywords to `common-beer-format.hops/hop` maps based on their attributes.
   Legal selection keys include:
   - `include-aroma?` : Whether or not to include aromatic hops in the selection. Aromatic hops are hops with a low bitterness, or typically added for their essential oils.
   - `include-bittering?` : Whether or not to include bittering hops in the selection. Bittering hops are typically added for their strong, musky flavor.
   - `include-both?` : Whether or not to include hops which can be used for both aroma and bittering in the selection."
  {:added "1.0"}
  [{:keys [include-aroma? include-bittering? include-both?]}]
  (cond-> {}
    include-aroma?     (merge aroma/aroma)
    include-bittering? (merge bittering/bittering)
    include-both?      (merge both/both)))


(def all-hops
  "A map from keywords to `common-beer-format.hops/hop` maps for all hops.
   This is a convenience function for `select-hops` with all options set to true."
  (select-hops {:include-aroma?     true
                :include-bittering? true
                :include-both?      true}))


(defn get-hop
  "Returns the `common-beer-format.hops/hop` at the given keyword.
   If the keyword is not found, returns nil a la `clojure.core/get`.
   An optional last entry may be used to specify a default value to return if the keyword is not found."
  {:added "1.0"}
  ([hop-key]
   (get all-hops hop-key))
  ([hop-key default-value]
   (get all-hops hop-key default-value)))


(defn select-style-guides
  "Returns a map from keywords to `common-beer-format.stlyes/style` maps based on their attributes.
   Legal selection keys include:
     - `include-bjcp-2015?` : Whether or not to include the [BJCP 2015](https://www.bjcp.org/bjcp-style-guidelines/) style guide in the selection."
  {:added "1.0"}
  [{:keys [include-bjcp-2015?]}]
  (cond-> {}
    include-bjcp-2015? (merge bjcp-2015/all-styles)))


(def all-style-guides
  "A map from keywords to `common-beer-format.stlyes/style` maps for all style guides.
   This is a convenience function for `select-style-guides` with all options set to true."
  (select-style-guides {:include-bjcp-2015? true}))


(defn select-yeasts
  "Returns a map from keywords to `common-beer-format.yeasts/yeast` maps based on their attributes.
   Legal selection keys include:
     - `include-brewtek?` : Whether or not to include yeasts manufactured by BrewTek in the selection.
     - `include-dcl-fermentis?` : Whether or not to include yeasts manufactured by [Fermentis](https://fermentis.com/en/) in the selection.
     - `include-lallemand?` : Whether or not to include yeasts manufactured by [Lallemand](https://www.lallemand.com/) in the selection.
     - `include-white-labs?` : Whether or not to include yeasts manufactured by [White Labs](https://www.whitelabs.com/) in the selection.
     - `include-wyeast?` : Whether or not to include yeasts manufactured by [Wyeast](https://www.wyeastlab.com/) in the selection."
  {:added "1.0"}
  [{:keys [include-brewtek? include-dcl-fermentis? include-lallemand? include-white-labs? include-wyeast?]}]
  (cond-> {}
    include-brewtek?       (merge brewtek/brewtek)
    include-dcl-fermentis? (merge dcl-fermentis/dcl-fermentis)
    include-lallemand?     (merge lallemand/lallemand)
    include-white-labs?    (merge white-labs/white-labs)
    include-wyeast?        (merge wyeast/wyeast)))


(def all-yeasts
  "A map from keywords to `common-beer-format.yeasts/yeast` maps for all yeasts.
   This is a convenience function for `select-yeasts` with all options set to true."
  (select-yeasts {:include-brewtek?       true
                  :include-dcl-fermentis? true
                  :include-lallemand?     true
                  :include-white-labs?    true
                  :include-wyeast?        true}))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn get-yeast
  "Returns the `common-beer-format.yeasts/yeast` at the given keyword.
   If the keyword is not found, returns nil a la `clojure.core/get`.
   An optional last entry may be used to specify a default value to return if the keyword is not found."
  {:added "1.0"}
  ([yeast-key]
   (get all-yeasts yeast-key))
  ([yeast-key default-value]
   (get all-yeasts yeast-key default-value)))
