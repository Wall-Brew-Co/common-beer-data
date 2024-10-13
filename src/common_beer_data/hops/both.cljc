(ns common-beer-data.hops.both
  "Data for multi-purpose hops."
  {:added "1.0"}
  (:require [common-beer-data.hops.hops :as hops]
            [common-beer-format.hops :as cbf]))


(def el-dorado
  "Flavors of tropical fruit, pineapple, mango.

   Aromas of pear, watermelon, stone fruit and candy."
  (hops/build-hop :el-dorado
                  {cbf/beta          0.08
                   cbf/name          "El Dorado"
                   cbf/cohumulone    0.3
                   cbf/type          "Both"
                   cbf/myrcene       0.57
                   cbf/humulene      0.1
                   cbf/hsi           0.75
                   cbf/notes         "Flavors of tropical fruit, pineapple, mango. Aromas of pear, watermelon, stone fruit and candy."
                   cbf/caryophyllene 0.06
                   cbf/alpha         0.16
                   cbf/substitutes   "Galena, Simcoe"}))


(def celeia
  "Floral and citrus aroma."
  (hops/build-hop :celeia
                  {cbf/beta          0.035
                   cbf/name          "Celeia"
                   cbf/cohumulone    0.25
                   cbf/type          "Both"
                   cbf/myrcene       0.5
                   cbf/humulene      0.17
                   cbf/hsi           0.56
                   cbf/notes         "Floral and citrus aroma."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.055
                   cbf/substitutes   "Saaz US"}))


(def perle-us
  "Faint spicy aroma."
  (hops/build-hop :perle-us
                  {cbf/beta          0.05
                   cbf/name          "Perle US"
                   cbf/cohumulone    0.28
                   cbf/type          "Both"
                   cbf/myrcene       0.45
                   cbf/humulene      0.3
                   cbf/hsi           0.7
                   cbf/notes         "Faint spicy aroma."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.095
                   cbf/substitutes   "Northern Brewer"}))


(def northdown
  "Fresh, flowery, piney, berry and spice."
  (hops/build-hop :northdown
                  {cbf/beta          0.048
                   cbf/name          "Northdown"
                   cbf/cohumulone    0.3
                   cbf/type          "Both"
                   cbf/myrcene       0.25
                   cbf/humulene      0.4
                   cbf/hsi           0.65
                   cbf/notes         "Fresh, flowery, piney, berry and spice."
                   cbf/caryophyllene 0.15
                   cbf/alpha         0.085
                   cbf/substitutes   "Challenger"}))


(def horizon
  "Floral, citrusy flavors and aromas."
  (hops/build-hop :horizon
                  {cbf/beta          0.05
                   cbf/name          "Horizon"
                   cbf/cohumulone    0.2
                   cbf/type          "Both"
                   cbf/myrcene       0.65
                   cbf/humulene      0.12
                   cbf/hsi           0.85
                   cbf/notes         "Floral, citrusy flavors and aromas."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.1
                   cbf/substitutes   "Magnum"}))


(def northern-brewer
  "Minty and resinous."
  (hops/build-hop :northern-brewer
                  {cbf/beta          0.04
                   cbf/name          "Northern Brewer"
                   cbf/cohumulone    0.25
                   cbf/type          "Both"
                   cbf/myrcene       0.55
                   cbf/humulene      0.2
                   cbf/hsi           0.75
                   cbf/notes         "Minty and resinous."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.095
                   cbf/substitutes   "Perle US, Columbus"}))


(def columbus
  "It features a punchy hoppiness and deep, pensive aroma with understated citrus notes—perfect as a dual use hop."
  (hops/build-hop :columbus
                  {cbf/beta          0.053
                   cbf/name          "Columbus"
                   cbf/cohumulone    0.32
                   cbf/type          "Both"
                   cbf/myrcene       0.34
                   cbf/humulene      0.17
                   cbf/hsi           0.55
                   cbf/notes         "It features a punchy hoppiness and deep, pensive aroma with understated citrus notes—perfect as a dual use hop."
                   cbf/caryophyllene 0.09
                   cbf/alpha         0.16
                   cbf/substitutes   "Chinook, Northern Brewer, Nugget"}))


(def challenger
  "Challenger features decent bitterness and a floral aroma."
  (hops/build-hop :challenger
                  {cbf/beta          0.037
                   cbf/name          "Challenger"
                   cbf/cohumulone    0.2
                   cbf/type          "aroma"
                   cbf/myrcene       0.36
                   cbf/humulene      0.3
                   cbf/hsi           0.8
                   cbf/notes         "Challenger features decent bitterness and a floral aroma."
                   cbf/caryophyllene 0.09
                   cbf/alpha         0.021
                   cbf/substitutes   "Admiral, Perle"}))


(def citra
  "HBC# 394cv. Strong notes of tropical fruits with a harsh bitterness."
  (hops/build-hop :citra
                  {cbf/beta          0.045
                   cbf/name          "Citra"
                   cbf/cohumulone    0.3
                   cbf/type          "aroma"
                   cbf/myrcene       0.65
                   cbf/humulene      0.1
                   cbf/hsi           0.75
                   cbf/notes         "HBC# 394cv. Strong notes of tropical fruits with a harsh bitterness."
                   cbf/caryophyllene 0.05
                   cbf/alpha         0.13
                   cbf/substitutes   "Cascade, Simcoe"}))


(def tettnanger
  "Floral and herbal notes with a mild spiciness."
  (hops/build-hop :tettnanger
                  {cbf/beta          0.04
                   cbf/name          "Tettnanger"
                   cbf/cohumulone    0.2
                   cbf/type          "aroma"
                   cbf/myrcene       0.24
                   cbf/humulene      0.2
                   cbf/hsi           0.55
                   cbf/notes         "Floral and herbal notes with a mild spiciness."
                   cbf/caryophyllene 0.06
                   cbf/alpha         0.05
                   cbf/substitutes   "Spalt, Saaz"}))


(def galaxy
  "Stone fruit aroma with citrus notes."
  (hops/build-hop :galaxy
                  {cbf/beta          0.055
                   cbf/name          "Galaxy"
                   cbf/cohumulone    0.36
                   cbf/type          "aroma"
                   cbf/myrcene       0.5
                   cbf/humulene      0.01
                   cbf/hsi           0.55
                   cbf/notes         "Stone fruit aroma with citrus notes."
                   cbf/caryophyllene 0.06
                   cbf/alpha         0.13
                   cbf/substitutes   "Topaz, Citra, Cascade"}))


(def topaz
  "Stone fruit aroma with citrus notes."
  (hops/build-hop :topaz
                  {cbf/beta          0.07
                   cbf/name          "Topaz"
                   cbf/cohumulone    0.5
                   cbf/type          "aroma"
                   cbf/myrcene       0.4
                   cbf/humulene      0.1
                   cbf/hsi           0.55
                   cbf/notes         "Stone fruit aroma with citrus notes."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.15
                   cbf/substitutes   "Galaxy, Citra, Amarillo"}))


(def both
  "Hops which can be used either to bitter a beer or to add aroma."
  (merge el-dorado
         celeia
         perle-us
         northdown
         horizon
         columbus
         northern-brewer
         challenger
         citra
         tettnanger
         galaxy
         topaz))
