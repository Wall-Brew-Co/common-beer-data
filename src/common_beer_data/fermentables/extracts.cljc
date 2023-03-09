(ns common-beer-data.fermentables.extracts
  "Data for malt extracts and brewing sugars."
  {:added "1.0"}
  (:require [common-beer-format.fermentables :as cbf]))


(def ^:private extract-defaults
  {cbf/version        1
   cbf/amount         0.0
   cbf/recommend-mash false
   cbf/type           "Extract"})


(defn ^:private build-extract
  [extract-key extract-data]
  {extract-key (merge extract-data extract-defaults)})


(def amber-liquid-extract
  "Amber colored liquid malt extract for general purpose use."
  (build-extract :amber-liquid-extract
                 {cbf/name           "Amber Liquid Extract"
                  cbf/yield          0.78
                  cbf/color          13
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "Amber colored liquid malt extract for general purpose use."}))


(def dark-liquid-extract
  "For general-purpose use in darker beers."
  (build-extract :dark-liquid-extract
                 {cbf/name           "Dark Liquid Extract"
                  cbf/yield          0.78
                  cbf/color          18
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "For general-purpose use in darker beers."}))


(def honey
  "Used for light flavor and body. 
   
   Can be added to primary fermentation, but must be pasteurized."
  (build-extract :honey
                 {cbf/name           "Honey"
                  cbf/yield          0.75
                  cbf/color          1
                  cbf/add-after-boil true
                  cbf/max-in-batch   0.3
                  cbf/potential      1.035
                  cbf/notes          "Used for light flavor and body. Can be added to primary fermentation, but must be pasteurized."}))


(def pale-liquid-extract
  "For general-purpose use in light and pale beers."
  (build-extract :pale-liquid-extract
                 {cbf/name           "Pale Liquid Extract"
                  cbf/yield          0.78
                  cbf/color          8
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "For general-purpose use in light and pale beers."}))


(def pilsner-liquid-extract
  "For general-purpose use in pale beers."
  (build-extract :pilsner-liquid-extract
                 {cbf/name           "Pilsner Liquid Extract"
                  cbf/yield          0.78
                  cbf/color          4
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "For general-purpose use in pale beers."}))


(def rice-extract-syrup
  "Used like other rice adjuncts in American and Japanese lagers."
  (build-extract :rice-extract-syrup
                 {cbf/name           "Rice Extract Syrup"
                  cbf/yield          0.69
                  cbf/color          7
                  cbf/add-after-boil false
                  cbf/max-in-batch   0.15
                  cbf/potential      1.032
                  cbf/notes          "Used like other rice adjuncts in American and Japanese lagers."}))


(def rye-liquid-extract
  "Mixed rye/barley extract for general-purpose brewing."
  (build-extract :rye-liquid-extract
                 {cbf/name           "Rye Liquid Extract"
                  cbf/yield          0.69
                  cbf/color          7
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.034
                  cbf/notes          "Mixed rye/barley extract for general-purpose brewing."}))


(def sorghum-syrup
  "A gluten-free extract based on sorghum grain.
   
   Can be used as a substitute for Light Malt Extract."
  (build-extract :sorghum-syrup
                 {cbf/name           "Sorghum Syrup"
                  cbf/yield          0.78
                  cbf/color          7
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "A gluten-free extract based on sorghum grain. Can be used as a substitute for Light Malt Extract."}))


(def wheat-liquid-extract
  "Wheat/barley extract for general-purpose use in wheat beers."
  (build-extract :wheat-liquid-extract
                 {cbf/name           "Wheat Liquid Extract"
                  cbf/yield          0.78
                  cbf/color          8
                  cbf/add-after-boil false
                  cbf/max-in-batch   1.0
                  cbf/potential      1.036
                  cbf/notes          "Wheat/barley extract for general-purpose use in wheat beers."}))


(def extracts
  "A concentrated form of fermentable sugars derived from malted barley in liquid form."
  (merge amber-liquid-extract
         dark-liquid-extract
         honey
         pale-liquid-extract
         pilsner-liquid-extract
         rice-extract-syrup
         rye-liquid-extract
         sorghum-syrup
         wheat-liquid-extract))
