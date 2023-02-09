(ns common-beer-data.fermentables.adjuncts
  "Data for common adjunctive fermentable ingredients")


(def ^:private adjunct-defaults
  {:version        1
   :amount         0.0
   :recommend-mash false
   :add-after-boil false
   :type           "Adjunct"})


(defn ^:private build-adjunct
  [adjunct-key adjunct-data]
  {adjunct-key (merge adjunct-defaults adjunct-data)})


(def barley-hulls
  "Neutral hulls used to improve lautering."
  (build-adjunct :barley-hulls {:name         "Barley Hulls"
                                :yield        0.0
                                :color        0
                                :max-in-batch 0.05
                                :potential    1.0
                                :notes        "Neutral hulls used to improve lautering."}))


(def grits
  "Imparts a corn and grain taste."
  (build-adjunct :grits {:name           "Grits"
                         :yield          0.8
                         :color          1
                         :recommend-mash true
                         :max-in-batch   0.1
                         :potential      1.037
                         :notes          "Imparts a corn and grain taste."}))


(def rice-hulls
  "Neutral hulls used to improve lautering."
  (build-adjunct :rice-hulls {:name         "Rice Hulls"
                              :yield        0.0
                              :color        0
                              :max-in-batch 0.05
                              :potential    1.0
                              :notes        "Neutral hulls used to improve lautering."}))


(def adjuncts
  "A non-grain and non-sugar ingredient that is added to the wort that contain fermentable sugars."
  (merge barley-hulls
         grits
         rice-hulls))
