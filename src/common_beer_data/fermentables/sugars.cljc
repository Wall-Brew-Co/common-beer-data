(ns common-beer-data.fermentables.sugars
  "Data for sugars and syrups used in brewing."
  {:added "1.0"}
  (:require [common-beer-format.fermentables :as cbf]))


(def ^:private sugar-defaults
  {cbf/version        1
   cbf/amount         0.0
   cbf/type           "Sugar"
   cbf/recommend-mash false
   cbf/add-after-boil false})


(defn ^:private build-sugar
  [sugar-key sugar-data]
  {sugar-key (merge sugar-data sugar-defaults)})


(def dark-brown-sugar
  "Imparts a sweet, rich flavor."
  (build-sugar :dark-brown-sugar
               {cbf/name         "Dark Brown Sugar"
                cbf/color        50
                cbf/potential    1.046
                cbf/max-in-batch 0.1
                cbf/yield        1.0
                cbf/notes        "Imparts a sweet, rich flavor."}))


(def light-brown-sugar
  "Imparts a sweet, rich flavor."
  (build-sugar :light-brown-sugar
               {cbf/name         "Light Brown Sugar"
                cbf/color        8
                cbf/potential    1.046
                cbf/max-in-batch 0.1
                cbf/yield        1.0
                cbf/notes        "Imparts a sweet, rich flavor."}))


(def belgian-candi-syrup-45l
  "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."
  (build-sugar :belgian-candi-syrup-45l
               {cbf/name         "Belgian Candi Syrup - 45L"
                cbf/potential    1.032
                cbf/yield        0.783
                cbf/color        60
                cbf/max-in-batch 0.2
                cbf/notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."}))


(def belgian-candi-syrup-90l
  "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."
  (build-sugar :belgian-candi-syrup-90l
               {cbf/name         "Belgian Candi Syrup - 90L"
                cbf/yield        0.783
                cbf/potential    1.032
                cbf/color        121
                cbf/max-in-batch 0.2
                cbf/notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."}))


(def belgian-candi-syrup-180l
  "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."
  (build-sugar :belgian-candi-syrup-180l
               {cbf/name         "Belgian Candi Syrup - 180L"
                cbf/potential    1.032
                cbf/yield        0.783
                cbf/color        243
                cbf/max-in-batch 0.2
                cbf/notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."}))


(def clear-candi-sugar
  "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."
  (build-sugar :clear-candi-sugar
               {cbf/name         "Clear Candi Sugar"
                cbf/potential    1.036
                cbf/yield        0.783
                cbf/color        1
                cbf/max-in-batch 0.2
                cbf/notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales."}))


(def cane-sugar
  "Common, household sugar used to lighten the flavor and body."
  (build-sugar :cane-sugar
               {cbf/name         "Cane Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        0
                cbf/max-in-batch 0.07
                cbf/notes        "Common, household sugar used to lighten the flavor and body."}))


(def beet-sugar
  "Common, household sugar used to lighten the flavor and body."
  (build-sugar :beet-sugar
               {cbf/name         "Beet Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        0
                cbf/max-in-batch 0.07
                cbf/notes        "Common, household sugar used to lighten the flavor and body."}))


(def corn-sugar
  "Common bottling sugar."
  (build-sugar :corn-sugar
               {cbf/name         "Corn Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        0
                cbf/max-in-batch 0.05
                cbf/notes        "Common bottling sugar."}))


(def dextrose
  "Common bottling sugar."
  (build-sugar :dextrose
               {cbf/name         "Dextrose"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        0
                cbf/max-in-batch 0.05
                cbf/notes        "Common bottling sugar."}))


(def corn-syrup
  "Syrup derived from corn sugar."
  (build-sugar :corn-syrup
               {cbf/name         "Corn Syrup"
                cbf/potential    1.036
                cbf/yield        0.783
                cbf/color        0
                cbf/max-in-batch 0.1
                cbf/notes        "Syrup derived from corn sugar."}))


(def demerara-sugar
  "A dark, unrefined sugar that contains molasses."
  (build-sugar :demerara-sugar
               {cbf/name         "Demerara Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        2
                cbf/max-in-batch 0.1
                cbf/notes        "A dark, unrefined sugar that contains molasses."}))


(def invert-sugar
  "A sugar used to increase starting gravity."
  (build-sugar :invert-sugar
               {cbf/name         "Invert Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        0
                cbf/max-in-batch 0.1
                cbf/notes        "A sugar used to increase starting gravity."}))


(def milk-sugar
  "A partially fermentable sugar that adds lasting sweetness."
  (build-sugar :milk-sugar
               {cbf/name         "Milk Sugar"
                cbf/potential    1.035
                cbf/yield        0.761
                cbf/color        0
                cbf/max-in-batch 0.1
                cbf/notes        "A partially fermentable sugar that adds lasting sweetness."}))


(def lactose
  "A partially fermentable sugar that adds lasting sweetness."
  (build-sugar :lactose
               {cbf/name         "Lactose"
                cbf/potential    1.035
                cbf/yield        0.761
                cbf/color        0
                cbf/max-in-batch 0.1
                cbf/notes        "A partially fermentable sugar that adds lasting sweetness."}))


(def molasses
  "A strong, dark, and sweet sugar."
  (build-sugar :molasses
               {cbf/name         "Molasses"
                cbf/potential    1.036
                cbf/yield        0.783
                cbf/color        80
                cbf/max-in-batch 0.05
                cbf/notes        "A strong, dark, and sweet sugar."}))


(def maple-syrup
  "If added during the boil it will add a dry, woodsy flavor.
   
   If added at bottling, the smooth maple flavor comes through."
  (build-sugar :maple-syrup
               {cbf/name         "Maple Syrup"
                cbf/potential    1.030
                cbf/yield        0.652
                cbf/color        35
                cbf/max-in-batch 0.10
                cbf/notes        "If added during the boil it will add a dry, woodsy flavor. If added at bottling, the smooth maple flavor comes through."}))


(def table-sugar
  "A sugar used to increase starting gravity."
  (build-sugar :table-sugar
               {cbf/name         "Table Sugar"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        1
                cbf/max-in-batch 0.1
                cbf/notes        "A sugar used to increase starting gravity."}))


(def sucrose
  "A sugar used to increase starting gravity."
  (build-sugar :sucrose
               {cbf/name         "Sucrose"
                cbf/potential    1.046
                cbf/yield        1.0
                cbf/color        1
                cbf/max-in-batch 0.1
                cbf/notes        "A sugar used to increase starting gravity."}))


(def turbinado
  "A light, raw brown sugar used to increase starting gravity."
  (build-sugar :turbinado
               {cbf/name         "Turbinado"
                cbf/potential    1.044
                cbf/yield        0.957
                cbf/color        10
                cbf/max-in-batch 0.1
                cbf/notes        "A light, raw brown sugar used to increase starting gravity."}))


(def sugars
  "Raw, candied, and other natural sources of sugar."
  (merge dark-brown-sugar
         light-brown-sugar
         belgian-candi-syrup-45l
         belgian-candi-syrup-90l
         belgian-candi-syrup-180l
         clear-candi-sugar
         cane-sugar
         beet-sugar
         dextrose
         corn-sugar
         corn-syrup
         demerara-sugar
         invert-sugar
         milk-sugar
         lactose
         molasses
         maple-syrup
         sucrose
         table-sugar
         turbinado))
