(ns common-beer-data.hops.bittering
  "Data for bitter hops."
  {:added "1.0"}
  (:require [common-beer-data.hops.hops :as hops]
            [common-beer-format.hops :as cbf]))


(def summit
  "Summit boasts citric aromas of tangerine, grapefruit and orange along with an impressive alpha content giving it a wide spectrum of potential use."
  (hops/build-hop :summit
                  {cbf/beta          0.06
                   cbf/name          "Summit"
                   cbf/cohumulone    0.3
                   cbf/type          "Bittering"
                   cbf/myrcene       0.4
                   cbf/humulene      0.2
                   cbf/hsi           0.85
                   cbf/notes         "Summit boasts citric aromas of tangerine, grapefruit and orange along with an impressive alpha content giving it a wide spectrum of potential use."
                   cbf/caryophyllene 0.13
                   cbf/alpha         0.18
                   cbf/substitutes   "Columbus, Simcoe, Apollo"}))


(def chelan
  "Despite being comparable in style, Chelan enjoys higher yields and a higher alpha percentage than its parent Galena."
  (hops/build-hop :chelan
                  {cbf/beta          0.098
                   cbf/name          "Chelan"
                   cbf/cohumulone    0.34
                   cbf/type          "Bittering"
                   cbf/myrcene       0.5
                   cbf/humulene      0.13
                   cbf/hsi           0.8
                   cbf/notes         "Despite being comparable in style, Chelan enjoys higher yields and a higher alpha percentage than its parent Galena."
                   cbf/caryophyllene 0.11
                   cbf/alpha         0.15
                   cbf/substitutes   "Galena, Nugget"}))


(def cluster
  "Clean, neutral, and slightly floral in taste."
  (hops/build-hop :cluster
                  {cbf/beta          0.055
                   cbf/name          "Cluster"
                   cbf/cohumulone    0.39
                   cbf/type          "Bittering"
                   cbf/myrcene       0.45
                   cbf/humulene      0.17
                   cbf/hsi           0.83
                   cbf/notes         "Clean, neutral, and slightly floral in taste."
                   cbf/caryophyllene 0.08
                   cbf/alpha         0.085
                   cbf/substitutes   "Galena, Eroica"}))


(def eroica
  "Possesses a sharp fruity essence."
  (hops/build-hop :eroica
                  {cbf/beta          0.045
                   cbf/name          "Eroica"
                   cbf/cohumulone    0.4
                   cbf/type          "Bittering"
                   cbf/myrcene       0.6
                   cbf/humulene      0.005
                   cbf/hsi           0.8
                   cbf/notes         "Possesses a sharp fruity essence."
                   cbf/caryophyllene 0.09
                   cbf/alpha         0.12
                   cbf/substitutes   "Galena, Cluster, Brewer's Gold"}))


(def tillicum
  "Elements of citrus and peach."
  (hops/build-hop :tillicum
                  {cbf/beta          0.11
                   cbf/name          "Tillicum"
                   cbf/cohumulone    0.34
                   cbf/type          "Bittering"
                   cbf/myrcene       0.39
                   cbf/humulene      0.15
                   cbf/hsi           0.8
                   cbf/notes         "Elements of citrus and peach."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.15
                   cbf/substitutes   "Galena, Chelan"}))


(def brewers-gold-us
  "An incredibly sharp bittering flavor."
  (hops/build-hop :brewers-gold-us
                  {cbf/beta          0.045
                   cbf/name          "Brewer's Gold US"
                   cbf/cohumulone    0.4
                   cbf/type          "Bittering"
                   cbf/myrcene       0.4
                   cbf/humulene      0.35
                   cbf/hsi           0.1
                   cbf/notes         "An incredibly sharp bittering flavor."
                   cbf/caryophyllene 0.35
                   cbf/alpha         0.1
                   cbf/substitutes   "Cascade, Galena"}))


(def nugget
  "Solid bittering, light flavor, herbal aroma."
  (hops/build-hop :nugget
                  {cbf/beta          0.06
                   cbf/name          "Nugget"
                   cbf/cohumulone    0.26
                   cbf/type          "Bittering"
                   cbf/myrcene       0.54
                   cbf/humulene      0.17
                   cbf/hsi           0.75
                   cbf/notes         "Solid bittering, light flavor, herbal aroma."
                   cbf/caryophyllene 0.08
                   cbf/alpha         0.14
                   cbf/substitutes   "Galena"}))


(def bravo
  "Spicy, earthy, and lightly floral aroma."
  (hops/build-hop :bravo
                  {cbf/beta          0.05
                   cbf/name          "Bravo"
                   cbf/cohumulone    0.32
                   cbf/type          "Bittering"
                   cbf/myrcene       0.38
                   cbf/humulene      0.2
                   cbf/hsi           0.7
                   cbf/notes         "Spicy, earthy, and lightly floral aroma."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.18
                   cbf/substitutes   "Columbus, CTZ, Nugget"}))


(def magnum-us
  "Excellent bittering profile and a nice, hoppy, floral aroma and subtle characters of citrus.
   
   Genetically indistinguishable from the German variety"
  (hops/build-hop :magnum-us
                  {cbf/beta          0.06
                   cbf/name          "Magnum US"
                   cbf/cohumulone    0.25
                   cbf/type          "Bittering"
                   cbf/myrcene       0.3
                   cbf/humulene      0.35
                   cbf/hsi           0.85
                   cbf/notes         "Excellent bittering profile and a nice, hoppy, floral aroma and subtle characters of citrus. Genetically indistinguishable from the German variety."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.14
                   cbf/substitutes   "Hallertau, Columbus, Nugget"}))


(def apollo
  "Sharp, clean bittering with grapefruit notes."
  (hops/build-hop :apollo
                  {cbf/beta          0.08
                   cbf/name          "Apollo"
                   cbf/cohumulone    0.25
                   cbf/type          "Bittering"
                   cbf/myrcene       0.4
                   cbf/humulene      0.3
                   cbf/hsi           0.85
                   cbf/notes         "Sharp, clean bittering with grapefruit notes."
                   cbf/caryophyllene 0.18
                   cbf/alpha         0.2
                   cbf/substitutes   "Nugget, Columbus, CTZ"}))


(def ctz
  "Also known as Zeus. Sweet citrus notes with an herbal aroma."
  (hops/build-hop :ctz
                  {cbf/beta          0.05
                   cbf/name          "CTZ"
                   cbf/cohumulone    0.35
                   cbf/type          "Bittering"
                   cbf/myrcene       0.5
                   cbf/humulene      0.12
                   cbf/hsi           0.8
                   cbf/notes         "Also known as Zeus. Sweet citrus notes with an herbal aroma."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.17
                   cbf/substitutes   "Columbus, Apollo"}))


(def super-galena
  "A far more potent variety of Galena with great bittering potential and citrus notes."
  (hops/build-hop :super-galena
                  {cbf/beta          0.1
                   cbf/name          "Super Galena"
                   cbf/cohumulone    0.4
                   cbf/type          "Bittering"
                   cbf/myrcene       0.5
                   cbf/humulene      0.35
                   cbf/hsi           0.7
                   cbf/notes         "A far more potent variety of Galena with great bittering potential and citrus notes."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.16
                   cbf/substitutes   "Galena, Columbus, CTZ, Eroica"}))


(def warrior
  "Strong aroma of spice and citrus."
  (hops/build-hop :warrior
                  {cbf/beta          0.055
                   cbf/name          "Warrior"
                   cbf/cohumulone    0.26
                   cbf/type          "Bittering"
                   cbf/myrcene       0.45
                   cbf/humulene      0.17
                   cbf/hsi           0.76
                   cbf/notes         "Strong aroma of spice and citrus."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.18
                   cbf/substitutes   "Nugget, Columbus"}))


(def millennium
  "Mild herbal notes with elements of resin."
  (hops/build-hop :millennium
                  {cbf/beta          0.053
                   cbf/name          "Millennium"
                   cbf/cohumulone    0.3
                   cbf/type          "Bittering"
                   cbf/myrcene       0.35
                   cbf/humulene      0.25
                   cbf/hsi           0.75
                   cbf/notes         "Mild herbal notes with elements of resin."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.165
                   cbf/substitutes   "CTZ, Nugget"}))


(def chinook
  "Powerful notes of pine and spice."
  (hops/build-hop :chinook
                  {cbf/beta          0.04
                   cbf/name          "Chinook"
                   cbf/cohumulone    0.3
                   cbf/type          "Bittering"
                   cbf/myrcene       0.35
                   cbf/humulene      0.2
                   cbf/hsi           0.7
                   cbf/notes         "Powerful notes of pine and spice."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.14
                   cbf/substitutes   "Galena, Eroica, Nugget"}))


(def newport
  "Derived from the Magnum genus. Provides clean bitterness."
  (hops/build-hop :newport
                  {cbf/beta          0.09
                   cbf/name          "Newport"
                   cbf/cohumulone    0.37
                   cbf/type          "Bittering"
                   cbf/myrcene       0.5
                   cbf/humulene      0.09
                   cbf/hsi           0.6
                   cbf/notes         "Derived from the Magnum genus. Provides clean bitterness."
                   cbf/caryophyllene 0.5
                   cbf/alpha         0.17
                   cbf/substitutes   "Galena, Nugget"}))


(def galena
  "One of the most commonly used bittering hops with a pleasant fruity aroma."
  (hops/build-hop :galena
                  {cbf/beta          0.09
                   cbf/name          "Galena"
                   cbf/cohumulone    0.4
                   cbf/type          "Bittering"
                   cbf/myrcene       0.55
                   cbf/humulene      0.12
                   cbf/hsi           0.75
                   cbf/notes         "One of the most commonly used bittering hops with a pleasant fruity aroma."
                   cbf/caryophyllene 0.04
                   cbf/alpha         0.135
                   cbf/substitutes   "Galena, Columbus, CTZ, Eroica"}))


(def bullion
  "Scents of dark fruit and spice."
  (hops/build-hop :bullion
                  {cbf/beta          0.06
                   cbf/name          "Bullion"
                   cbf/cohumulone    0.4
                   cbf/type          "Bittering"
                   cbf/myrcene       0.5
                   cbf/humulene      0.25
                   cbf/hsi           0.45
                   cbf/notes         "Scents of dark fruit and spice."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.08
                   cbf/substitutes   "Columbus, Chinook, Galena"}))


(def bittering
  "Hops used for bittering more than their aroma or flavor."
  (merge summit
         chelan
         cluster
         eroica
         tillicum
         brewers-gold-us
         nugget
         bravo
         magnum-us
         apollo
         ctz
         super-galena
         warrior
         chinook
         millennium
         newport
         galena
         bullion))
