(ns common-beer-data.fermentables.dry-extracts
  "Data for malt extracts and brewing sugars."
  {:added "1.0"}
  (:require [common-beer-format.fermentables :as cbf]))


(def ^:private extract-defaults
  {cbf/version        1
   cbf/amount         0.0
   cbf/type           "Dry Extract"
   cbf/recommend-mash false
   cbf/add-after-boil false
   cbf/max-in-batch   1.0
   cbf/yield          0.95})


(defn ^:private build-extract
  [extract-key extract-data]
  {extract-key (merge extract-data extract-defaults)})


(def amber-dry-extract
  "Amber colored dry malt extract for general purpose use."
  (build-extract :amber-dry-extract
                 {cbf/name      "Amber Dry Extract"
                  cbf/color     13
                  cbf/potential 1.044
                  cbf/notes     "Amber colored dry malt extract for general purpose use."}))


(def dark-dry-extract
  "For general-purpose use in darker beers."
  (build-extract :dark-dry-extract
                 {cbf/name      "Dark Dry Extract"
                  cbf/color     18
                  cbf/potential 1.044
                  cbf/notes     "For general-purpose use in darker beers."}))


(def extra-light-dry-extract
  "For general-purpose use in light and very light beers."
  (build-extract :extra-light-dry-extract
                 {cbf/name      "Extra Light Dry Extract"
                  cbf/color     3
                  cbf/potential 1.036
                  cbf/notes     "For general-purpose use in light and very light beers."}))


(def light-dry-extract
  "For general-purpose use in light beers."
  (build-extract :light-dry-extract
                 {cbf/name      "Light Dry Extract"
                  cbf/color     8
                  cbf/potential 1.044
                  cbf/notes     "For general-purpose use in light beers."}))


(def wheat-dry-extract
  "Wheat extract for general-purpose use in wheat beers."
  (build-extract :wheat-dry-extract
                 {cbf/name      "Wheat Dry Extract"
                  cbf/color     8
                  cbf/potential 1.044
                  cbf/notes     "Wheat extract for general-purpose use in wheat beers."}))


(def dry-extracts
  "A concentrated form of fermentable sugars derived from malted barley in powder form."
  (merge amber-dry-extract
         dark-dry-extract
         extra-light-dry-extract
         light-dry-extract
         wheat-dry-extract))
