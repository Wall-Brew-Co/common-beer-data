(ns common-beer-data.hops.both
  "Data for multi-purpose hops."
  (:require [common-beer-data.hops.hops :as hops]))


(def el-dorado
  "Flavors of tropical fruit, pineapple, mango.
   
   Aromas of pear, watermelon, stone fruit and candy."
  (hops/build-hop :el-dorado
                  {:beta          0.08
                   :name          "El Dorado"
                   :cohumulone    0.3
                   :type          "Both"
                   :myrcene       0.57
                   :humulene      0.1
                   :hsi           0.75
                   :notes         "Flavors of tropical fruit, pineapple, mango. Aromas of pear, watermelon, stone fruit and candy."
                   :caryophyllene 0.06
                   :alpha         0.16
                   :substitutes   "Galena, Simcoe"}))


(def celeia
  "Floral and citrus aroma."
  (hops/build-hop :celeia
                  {:beta          0.035
                   :name          "Celeia"
                   :cohumulone    0.25
                   :type          "Both"
                   :myrcene       0.5
                   :humulene      0.17
                   :hsi           0.56
                   :notes         "Floral and citrus aroma."
                   :caryophyllene 0.07
                   :alpha         0.055
                   :substitutes   "Saaz US"}))


(def perle-us
  "Faint spicy aroma."
  (hops/build-hop :perle-us
                  {:beta          0.05
                   :name          "Perle US"
                   :cohumulone    0.28
                   :type          "Both"
                   :myrcene       0.45
                   :humulene      0.3
                   :hsi           0.7
                   :notes         "Faint spicy aroma."
                   :caryophyllene 0.1
                   :alpha         0.095
                   :substitutes   "Northern Brewer"}))


(def northdown
  "Fresh, flowery, piney, berry and spice."
  (hops/build-hop :northdown
                  {:beta          0.048
                   :name          "Northdown"
                   :cohumulone    0.3
                   :type          "Both"
                   :myrcene       0.25
                   :humulene      0.4
                   :hsi           0.65
                   :notes         "Fresh, flowery, piney, berry and spice."
                   :caryophyllene 0.15
                   :alpha         0.085
                   :substitutes   "Challenger"}))


(def horizon
  "Floral, citrusy flavors and aromas."
  (hops/build-hop :horizon
                  {:beta          0.05
                   :name          "Horizon"
                   :cohumulone    0.2
                   :type          "Both"
                   :myrcene       0.65
                   :humulene      0.12
                   :hsi           0.85
                   :notes         "Floral, citrusy flavors and aromas."
                   :caryophyllene 0.1
                   :alpha         0.1
                   :substitutes   "Magnum"}))


(def northern-brewer
  "Minty and resinous."
  (hops/build-hop :northern-brewer
                  {:beta          0.04
                   :name          "Northern Brewer"
                   :cohumulone    0.25
                   :type          "Both"
                   :myrcene       0.55
                   :humulene      0.2
                   :hsi           0.75
                   :notes         "Minty and resinous."
                   :caryophyllene 0.07
                   :alpha         0.095
                   :substitutes   "Perle US, Columbus"}))


(def columbus
  "It features a punchy hoppiness and deep, pensive aroma with understated citrus notes—perfect as a dual use hop."
  (hops/build-hop :columbus
                  {:beta          0.053
                   :name          "Columbus"
                   :cohumulone    0.32
                   :type          "Both"
                   :myrcene       0.34
                   :humulene      0.17
                   :hsi           0.55
                   :notes         "It features a punchy hoppiness and deep, pensive aroma with understated citrus notes—perfect as a dual use hop."
                   :caryophyllene 0.09
                   :alpha         0.16
                   :substitutes   "Chinook, Northern Brewer, Nugget"}))


(def challenger
  "Challenger features decent bitterness and a floral aroma."
  (hops/build-hop :challenger
                  {:beta          0.037
                   :name          "Challenger"
                   :cohumulone    0.2
                   :type          "aroma"
                   :myrcene       0.36
                   :humulene      0.3
                   :hsi           0.8
                   :notes         "Challenger features decent bitterness and a floral aroma."
                   :caryophyllene 0.09
                   :alpha         0.021
                   :substitutes   "Admiral, Perle"}))


(def citra
  "HBC# 394cv. Strong notes of tropical fruits with a harsh bitterness."
  (hops/build-hop :citra
                  {:beta          0.045
                   :name          "Citra"
                   :cohumulone    0.3
                   :type          "aroma"
                   :myrcene       0.65
                   :humulene      0.1
                   :hsi           0.75
                   :notes         "HBC# 394cv. Strong notes of tropical fruits with a harsh bitterness."
                   :caryophyllene 0.05
                   :alpha         0.13
                   :substitutes   "Cascade, Simcoe"}))


(def tettnanger
  "Floral and herbal notes with a mild spiciness."
  (hops/build-hop :tettnanger
                  {:beta          0.04
                   :name          "Tettnanger"
                   :cohumulone    0.2
                   :type          "aroma"
                   :myrcene       0.24
                   :humulene      0.2
                   :hsi           0.55
                   :notes         "Floral and herbal notes with a mild spiciness."
                   :caryophyllene 0.06
                   :alpha         0.05
                   :substitutes   "Spalt, Saaz"}))


(def galaxy
  "Stone fruit aroma with citrus notes."
  (hops/build-hop :galaxy
                  {:beta          0.055
                   :name          "Galaxy"
                   :cohumulone    0.36
                   :type          "aroma"
                   :myrcene       0.5
                   :humulene      0.01
                   :hsi           0.55
                   :notes         "Stone fruit aroma with citrus notes."
                   :caryophyllene 0.06
                   :alpha         0.13
                   :substitutes   "Topaz, Citra, Cascade"}))


(def topaz
  "Stone fruit aroma with citrus notes."
  (hops/build-hop :topaz
                  {:beta          0.07
                   :name          "Topaz"
                   :cohumulone    0.5
                   :type          "aroma"
                   :myrcene       0.4
                   :humulene      0.1
                   :hsi           0.55
                   :notes         "Stone fruit aroma with citrus notes."
                   :caryophyllene 0.1
                   :alpha         0.15
                   :substitutes   "Galaxy, Citra, Amarillo"}))


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
