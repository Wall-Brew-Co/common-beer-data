(ns ^:no-doc common-beer-data.yeasts.yeasts
  "Function to help minimize repeated data in yeast entry"
  {:no-doc true
   :added  "1.0"}
  (:require [clojure.string :as str]
            [common-beer-format.yeasts :as cbf]))


(def ^:private yeast-defaults
  "Defaults to generate complete records that match the ::yeast spec"
  {cbf/version 1
   cbf/amount  0.0})


(defn capitalize-all
  "Capitalize every word in a sentence."
  [s]
  (as-> s %
        (str/split % #" ")
        (map str/capitalize %)
        (str/join " " %)))


(defn build-yeasts
  "Construct a yeast, including display/range values derived from core yeast data."
  [yeast-key yeast-data]
  (let [display-min-temp (str (cbf/min-temperature yeast-data) "C")
        display-max-temp (str (cbf/max-temperature yeast-data) "C")
        yeast-definition (merge yeast-defaults yeast-data)
        yeast            (assoc yeast-definition cbf/disp-min-temp display-min-temp cbf/disp-max-temp display-max-temp)
        cleaned-yeast    (-> yeast
                             (update cbf/flocculation capitalize-all)
                             (update cbf/form str/capitalize)
                             (update cbf/type str/capitalize))]
    {yeast-key cleaned-yeast}))
