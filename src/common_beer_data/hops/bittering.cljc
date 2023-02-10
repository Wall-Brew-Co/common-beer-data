(ns common-beer-data.hops.bittering
  "Data for bitter hops"
  (:require [common-beer-data.hops.hops :as hops]))


(def summit
  "Summit boasts citric aromas of tangerine, grapefruit and orange along with an impressive alpha content giving it a wide spectrum of potential use."
  (hops/build-hop :summit
                  {:beta          0.06
                   :name          "Summit"
                   :cohumulone    0.3
                   :type          "Bittering"
                   :myrcene       0.4
                   :humulene      0.2
                   :hsi           0.85
                   :notes         "Summit boasts citric aromas of tangerine, grapefruit and orange along with an impressive alpha content giving it a wide spectrum of potential use."
                   :caryophyllene 0.13
                   :alpha         0.18
                   :substitutes   "Columbus, Simcoe, Apollo"}))


(def chelan
  "Despite being comparable in style, Chelan enjoys higher yields and a higher alpha percentage than its parent Galena."
  (hops/build-hop :chelan
                  {:beta          0.098
                   :name          "Chelan"
                   :cohumulone    0.34
                   :type          "Bittering"
                   :myrcene       0.5
                   :humulene      0.13
                   :hsi           0.8
                   :notes         "Despite being comparable in style, Chelan enjoys higher yields and a higher alpha percentage than its parent Galena."
                   :caryophyllene 0.11
                   :alpha         0.15
                   :substitutes   "Galena, Nugget"}))


(def cluster
  "Clean, neutral, and slightly floral in taste."
  (hops/build-hop :cluster
                  {:beta          0.055
                   :name          "Cluster"
                   :cohumulone    0.39
                   :type          "Bittering"
                   :myrcene       0.45
                   :humulene      0.17
                   :hsi           0.83
                   :notes         "Clean, neutral, and slightly floral in taste."
                   :caryophyllene 0.08
                   :alpha         0.085
                   :substitutes   "Galena, Eroica"}))


(def eroica
  "Possesses a sharp fruity essence."
  (hops/build-hop :eroica
                  {:beta          0.045
                   :name          "Eroica"
                   :cohumulone    0.4
                   :type          "Bittering"
                   :myrcene       0.6
                   :humulene      0.005
                   :hsi           0.8
                   :notes         "Possesses a sharp fruity essence."
                   :caryophyllene 0.09
                   :alpha         0.12
                   :substitutes   "Galena, Cluster, Brewer's Gold"}))


(def tillicum
  "Elements of citrus and peach."
  (hops/build-hop :tillicum
                  {:beta          0.11
                   :name          "Tillicum"
                   :cohumulone    0.34
                   :type          "Bittering"
                   :myrcene       0.39
                   :humulene      0.15
                   :hsi           0.8
                   :notes         "Elements of citrus and peach."
                   :caryophyllene 0.07
                   :alpha         0.15
                   :substitutes   "Galena, Chelan"}))


(def brewers-gold-us
  "An incredibly sharp bittering flavor."
  (hops/build-hop :brewers-gold-us
                  {:beta          0.045
                   :name          "Brewer's Gold US"
                   :cohumulone    0.4
                   :type          "Bittering"
                   :myrcene       0.4
                   :humulene      0.35
                   :hsi           0.1
                   :notes         "An incredibly sharp bittering flavor."
                   :caryophyllene 0.35
                   :alpha         0.1
                   :substitutes   "Cascade, Galena"}))


(def nugget
  "Solid bittering, light flavor, herbal aroma."
  (hops/build-hop :nugget
                  {:beta          0.06
                   :name          "Nugget"
                   :cohumulone    0.26
                   :type          "Bittering"
                   :myrcene       0.54
                   :humulene      0.17
                   :hsi           0.75
                   :notes         "Solid bittering, light flavor, herbal aroma."
                   :caryophyllene 0.08
                   :alpha         0.14
                   :substitutes   "Galena"}))


(def bravo
  "Spicy, earthy, and lightly floral aroma."
  (hops/build-hop :bravo
                  {:beta          0.05
                   :name          "Bravo"
                   :cohumulone    0.32
                   :type          "Bittering"
                   :myrcene       0.38
                   :humulene      0.2
                   :hsi           0.7
                   :notes         "Spicy, earthy, and lightly floral aroma."
                   :caryophyllene 0.1
                   :alpha         0.18
                   :substitutes   "Columbus, CTZ, Nugget"}))


(def magnum-us
  "Excellent bittering profile and a nice, hoppy, floral aroma and subtle characters of citrus.
   
   Genetically indistinguishable from the German variety"
  (hops/build-hop :magnum-us
                  {:beta          0.06
                   :name          "Magnum US"
                   :cohumulone    0.25
                   :type          "Bittering"
                   :myrcene       0.3
                   :humulene      0.35
                   :hsi           0.85
                   :notes         "Excellent bittering profile and a nice, hoppy, floral aroma and subtle characters of citrus. Genetically indistinguishable from the German variety."
                   :caryophyllene 0.1
                   :alpha         0.14
                   :substitutes   "Hallertau, Columbus, Nugget"}))


(def apollo
  "Sharp, clean bittering with grapefruit notes."
  (hops/build-hop :apollo
                  {:beta          0.08
                   :name          "Apollo"
                   :cohumulone    0.25
                   :type          "Bittering"
                   :myrcene       0.4
                   :humulene      0.3
                   :hsi           0.85
                   :notes         "Sharp, clean bittering with grapefruit notes."
                   :caryophyllene 0.18
                   :alpha         0.2
                   :substitutes   "Nugget, Columbus, CTZ"}))


(def ctz
  "Also known as Zeus. Sweet citrus notes with an herbal aroma."
  (hops/build-hop :ctz
                  {:beta          0.05
                   :name          "CTZ"
                   :cohumulone    0.35
                   :type          "Bittering"
                   :myrcene       0.5
                   :humulene      0.12
                   :hsi           0.8
                   :notes         "Also known as Zeus. Sweet citrus notes with an herbal aroma."
                   :caryophyllene 0.07
                   :alpha         0.17
                   :substitutes   "Columbus, Apollo"}))


(def super-galena
  "A far more potent variety of Galena with great bittering potential and citrus notes."
  (hops/build-hop :super-galena
                  {:beta          0.1
                   :name          "Super Galena"
                   :cohumulone    0.4
                   :type          "Bittering"
                   :myrcene       0.5
                   :humulene      0.35
                   :hsi           0.7
                   :notes         "A far more potent variety of Galena with great bittering potential and citrus notes."
                   :caryophyllene 0.1
                   :alpha         0.16
                   :substitutes   "Galena, Columbus, CTZ, Eroica"}))


(def warrior
  "Strong aroma of spice and citrus."
  (hops/build-hop :warrior
                  {:beta          0.055
                   :name          "Warrior"
                   :cohumulone    0.26
                   :type          "Bittering"
                   :myrcene       0.45
                   :humulene      0.17
                   :hsi           0.76
                   :notes         "Strong aroma of spice and citrus."
                   :caryophyllene 0.1
                   :alpha         0.18
                   :substitutes   "Nugget, Columbus"}))


(def millennium
  "Mild herbal notes with elements of resin."
  (hops/build-hop :millennium
                  {:beta          0.053
                   :name          "Millennium"
                   :cohumulone    0.3
                   :type          "Bittering"
                   :myrcene       0.35
                   :humulene      0.25
                   :hsi           0.75
                   :notes         "Mild herbal notes with elements of resin."
                   :caryophyllene 0.1
                   :alpha         0.165
                   :substitutes   "CTZ, Nugget"}))


(def chinook
  "Powerful notes of pine and spice."
  (hops/build-hop :chinook
                  {:beta          0.04
                   :name          "Chinook"
                   :cohumulone    0.3
                   :type          "Bittering"
                   :myrcene       0.35
                   :humulene      0.2
                   :hsi           0.7
                   :notes         "Powerful notes of pine and spice."
                   :caryophyllene 0.1
                   :alpha         0.14
                   :substitutes   "Galena, Eroica, Nugget"}))


(def newport
  "Derived from the Magnum genus. Provides clean bitterness."
  (hops/build-hop :newport
                  {:beta          0.09
                   :name          "Newport"
                   :cohumulone    0.37
                   :type          "Bittering"
                   :myrcene       0.5
                   :humulene      0.09
                   :hsi           0.6
                   :notes         "Derived from the Magnum genus. Provides clean bitterness."
                   :caryophyllene 0.5
                   :alpha         0.17
                   :substitutes   "Galena, Nugget"}))


(def galena
  "One of the most commonly used bittering hops with a pleasant fruity aroma."
  (hops/build-hop :galena
                  {:beta          0.09
                   :name          "Galena"
                   :cohumulone    0.4
                   :type          "Bittering"
                   :myrcene       0.55
                   :humulene      0.12
                   :hsi           0.75
                   :notes         "One of the most commonly used bittering hops with a pleasant fruity aroma."
                   :caryophyllene 0.04
                   :alpha         0.135
                   :substitutes   "Galena, Columbus, CTZ, Eroica"}))


(def bullion
  "Scents of dark fruit and spice."
  (hops/build-hop :bullion
                  {:beta          0.06
                   :name          "Bullion"
                   :cohumulone    0.4
                   :type          "Bittering"
                   :myrcene       0.5
                   :humulene      0.25
                   :hsi           0.45
                   :notes         "Scents of dark fruit and spice."
                   :caryophyllene 0.1
                   :alpha         0.08
                   :substitutes   "Columbus, Chinook, Galena"}))


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
