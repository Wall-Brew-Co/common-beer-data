(ns common-beer-data.fermentables.adjuncts
  "Data for common adjunctive fermentable ingredients."
  {:added "1.0"}
  (:require [common-beer-format.fermentables :as cbf]))


(def ^:private adjunct-defaults
  {cbf/version        1
   cbf/amount         0.0
   cbf/recommend-mash false
   cbf/add-after-boil false
   cbf/type           "Adjunct"})


(defn ^:private build-adjunct
  [adjunct-key adjunct-data]
  {adjunct-key (merge adjunct-defaults adjunct-data)})


(def barley-hulls
  "Neutral hulls used to improve lautering."
  (build-adjunct :barley-hulls
                 {cbf/name         "Barley Hulls"
                  cbf/yield        0.0
                  cbf/color        0
                  cbf/max-in-batch 0.05
                  cbf/potential    1.0
                  cbf/notes        "Neutral hulls used to improve lautering."}))


(def grits
  "Imparts a corn and grain taste."
  (build-adjunct :grits
                 {cbf/name           "Grits"
                  cbf/yield          0.8
                  cbf/color          1
                  cbf/recommend-mash true
                  cbf/max-in-batch   0.1
                  cbf/potential      1.037
                  cbf/notes          "Imparts a corn and grain taste."}))


(def rice-hulls
  "Neutral hulls used to improve lautering."
  (build-adjunct :rice-hulls
                 {cbf/name         "Rice Hulls"
                  cbf/yield        0.0
                  cbf/color        0
                  cbf/max-in-batch 0.05
                  cbf/potential    1.0
                  cbf/notes        "Neutral hulls used to improve lautering."}))


(def adjuncts
  "A non-grain and non-sugar ingredient that is added to the wort that contain fermentable sugars."
  (merge barley-hulls
         grits
         rice-hulls))
