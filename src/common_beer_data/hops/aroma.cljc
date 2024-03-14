(ns common-beer-data.hops.aroma
  "Data for aromatic hops."
  {:added "1.0"}
  (:require [common-beer-data.hops.hops :as hops]
            [common-beer-format.hops :as cbf]))


(def crystal
  "Woody, floral, and fruity with spice notes of cinnamon, nutmeg, and black pepper."
  (hops/build-hop :crystal
                  {cbf/beta          0.065
                   cbf/name          "Crystal"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.45
                   cbf/humulene      0.25
                   cbf/hsi           0.65
                   cbf/notes         "Woody, floral, and fruity with spice notes of cinnamon, nutmeg, and black pepper."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.055
                   cbf/substitutes   "Liberty, Mt Hood, Hallertau"}))


(def liberty
  "Notes of lemon and spice."
  (hops/build-hop :liberty
                  {cbf/beta          0.04
                   cbf/name          "Liberty"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.45
                   cbf/humulene      0.31
                   cbf/hsi           0.45
                   cbf/notes         "Notes of lemon and spice."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.05
                   cbf/substitutes   "Mt Hood, Hallertau"}))


(def glacier
  "Herby, woody, and citrusy notes."
  (hops/build-hop :glacier
                  {cbf/beta          0.082
                   cbf/name          "Glacier"
                   cbf/cohumulone    0.13
                   cbf/type          "Aroma"
                   cbf/myrcene       0.45
                   cbf/humulene      0.3
                   cbf/hsi           0.7
                   cbf/notes         "Herby, woody, and citrusy notes."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.055
                   cbf/substitutes   "Willamette"}))


(def mt-hood
  "Hallertau derivant.

   Mild spicy flavor."
  (hops/build-hop :mt-hood
                  {cbf/beta          0.08
                   cbf/name          "Mt. Hood"
                   cbf/cohumulone    0.22
                   cbf/type          "Aroma"
                   cbf/myrcene       0.35
                   cbf/humulene      0.2
                   cbf/hsi           0.55
                   cbf/notes         "Hallertau derivant. Mild spicy flavor."
                   cbf/caryophyllene 0.11
                   cbf/alpha         0.07
                   cbf/substitutes   "Crystal"}))


(def strisselspalt
  "Pleasant mixture of herbal, floral, and citrus notes."
  (hops/build-hop :strisselspalt
                  {cbf/beta          0.045
                   cbf/name          "Strisselspalt"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.42
                   cbf/humulene      0.22
                   cbf/hsi           0.65
                   cbf/notes         "Pleasant mixture of herbal, floral, and citrus notes."
                   cbf/caryophyllene 0.09
                   cbf/alpha         0.045
                   cbf/substitutes   "Hallertau, Mt Hood"}))


(def simcoe
  "Bright citrus flavors with earthy undertones.

   Aromas of grapefruit, pine, and herbs."
  (hops/build-hop :simcoe
                  {cbf/beta          0.05
                   cbf/name          "Simcoe"
                   cbf/cohumulone    0.17
                   cbf/type          "Aroma"
                   cbf/myrcene       0.65
                   cbf/humulene      0.15
                   cbf/hsi           0.75
                   cbf/notes         "Bright citrus flavors with earthy undertones. Aromas of grapefruit, pine, and herbs."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.14
                   cbf/substitutes   "Summit"}))


(def cascade
  "Floral, with elements of citrus."
  (hops/build-hop :cascade
                  {cbf/beta          0.07
                   cbf/name          "Cascade"
                   cbf/cohumulone    0.35
                   cbf/type          "Aroma"
                   cbf/myrcene       0.5
                   cbf/humulene      0.12
                   cbf/hsi           0.5
                   cbf/notes         "Floral, with elements of citrus."
                   cbf/caryophyllene 0.05
                   cbf/alpha         0.07
                   cbf/substitutes   "Centennial, Amarillo, Columbus"}))


(def willamette
  "Herbal spiciness with floral notes."
  (hops/build-hop :willamette
                  {cbf/beta          0.045
                   cbf/name          "Willamette"
                   cbf/cohumulone    0.3
                   cbf/type          "Aroma"
                   cbf/myrcene       0.45
                   cbf/humulene      0.25
                   cbf/hsi           0.6
                   cbf/notes         "Herbal spiciness with floral notes."
                   cbf/caryophyllene 0.07
                   cbf/alpha         0.06
                   cbf/substitutes   "Fuggle, Glacier"}))


(def spalt
  "Earthen and spice notes."
  (hops/build-hop :spalt
                  {cbf/beta          0.04
                   cbf/name          "Spalt"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.025
                   cbf/hsi           0.55
                   cbf/notes         "Earthen and spice notes."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.041
                   cbf/substitutes   "Saaz, Hallertau, Sterling"}))


(def sterling
  "Derivant of Saaz.

   Similar earthen and spice notes."
  (hops/build-hop :sterling
                  {cbf/beta          0.06
                   cbf/name          "Sterling"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.45
                   cbf/humulene      0.2
                   cbf/hsi           0.65
                   cbf/notes         "Derivant of Saaz. Similar earthen and spice notes."
                   cbf/caryophyllene 0.06
                   cbf/alpha         0.05
                   cbf/substitutes   "Saaz"}))


(def santiam
  "Soft, herbal, floral, fruity aromas with hints of pepper and spice."
  (hops/build-hop :santiam
                  {cbf/beta          0.08
                   cbf/name          "Santiam"
                   cbf/cohumulone    0.2
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.25
                   cbf/hsi           0.45
                   cbf/notes         "Soft, herbal, floral, fruity aromas with hints of pepper and spice."
                   cbf/caryophyllene 0.055
                   cbf/alpha         0.07
                   cbf/substitutes   "Spalt, Hallertau, Liberty"}))


(def ultra
  "Mild spice aroma and flavor."
  (hops/build-hop :ultra
                  {cbf/beta          0.045
                   cbf/name          "Ultra"
                   cbf/cohumulone    0.3
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.35
                   cbf/hsi           0.65
                   cbf/notes         "Mild spice aroma and flavor."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.035
                   cbf/substitutes   "Hallertau, Saaz"}))


(def ahtanum
  "Distinct grapefruit scent and flavor."
  (hops/build-hop :ahtanum
                  {cbf/beta          0.05
                   cbf/name          "Ahtanum"
                   cbf/cohumulone    0.3
                   cbf/type          "Aroma"
                   cbf/myrcene       0.5
                   cbf/humulene      0.18
                   cbf/hsi           0.5
                   cbf/notes         "Distinct grapefruit scent and flavor."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.057
                   cbf/substitutes   "Willamette, Centennial, Cascade"}))


(def mosaic
  "Complex flavor reminiscent of stone fruit."
  (hops/build-hop :mosaic
                  {cbf/beta          0.04
                   cbf/name          "Mosaic"
                   cbf/cohumulone    0.22
                   cbf/type          "Aroma"
                   cbf/myrcene       0.5
                   cbf/humulene      0.1
                   cbf/hsi           0.75
                   cbf/notes         "Complex flavor reminiscent of stone fruit."
                   cbf/caryophyllene 0.05
                   cbf/alpha         0.135
                   cbf/substitutes   "Citra"}))


(def golding-us
  "Direct descendants of East Kent Golding.

   Delicate fruit and herbal aromas."
  (hops/build-hop :golding-us
                  {cbf/beta          0.03
                   cbf/name          "Golding US"
                   cbf/cohumulone    0.2
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.4
                   cbf/hsi           0.65
                   cbf/notes         "Direct descendants of East Kent Golding. Delicate fruit and herbal aromas."
                   cbf/caryophyllene 0.15
                   cbf/alpha         0.06
                   cbf/substitutes   "Fuggle, East Kent Golding"}))


(def east-kent-golding
  "Delicate fruit and herbal aromas."
  (hops/build-hop :east-kent-golding
                  {cbf/beta          0.03
                   cbf/name          "East Kent Golding"
                   cbf/cohumulone    0.3
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.3
                   cbf/hsi           0.75
                   cbf/notes         "Delicate fruit and herbal aromas."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.06
                   cbf/substitutes   "Fuggle, Golding"}))


(def fuggle-us
  "A slight, fruity flavor."
  (hops/build-hop :fuggle-us
                  {cbf/beta          0.02
                   cbf/name          "Fuggle US"
                   cbf/cohumulone    0.27
                   cbf/type          "Aroma"
                   cbf/myrcene       0.4
                   cbf/humulene      0.25
                   cbf/hsi           0.5
                   cbf/notes         "A slight, fruity flavor."
                   cbf/caryophyllene 0.09
                   cbf/alpha         0.055
                   cbf/substitutes   "Willamette, Newport"}))


(def delta
  "Spicy citrus and summer melon notes."
  (hops/build-hop :delta
                  {cbf/beta          0.07
                   cbf/name          "Delta"
                   cbf/cohumulone    0.23
                   cbf/type          "Aroma"
                   cbf/myrcene       0.35
                   cbf/humulene      0.3
                   cbf/hsi           0.85
                   cbf/notes         "Spicy citrus and summer melon notes."
                   cbf/caryophyllene 0.12
                   cbf/alpha         0.07
                   cbf/substitutes   "Fuggle, Willamette"}))


(def saaz-us
  "Also called Saazer.

   Strong herbal character."
  (hops/build-hop :saaz-us
                  {cbf/beta          0.045
                   cbf/name          "Saaz US"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.3
                   cbf/humulene      0.2
                   cbf/hsi           0.5
                   cbf/notes         "Also called Saazer. Strong herbal character."
                   cbf/caryophyllene 0.06
                   cbf/alpha         0.045
                   cbf/substitutes   "Centennial, Amarillo"}))


(def palisade
  "Flavors of nectar fruits and citrus.

   Aromas that are floral, herbaceous, and grassy."
  (hops/build-hop :palisade
                  {cbf/beta          0.08
                   cbf/name          "Palisade"
                   cbf/cohumulone    0.25
                   cbf/type          "Aroma"
                   cbf/myrcene       0.09
                   cbf/humulene      0.2
                   cbf/hsi           0.65
                   cbf/notes         "Flavors of nectar fruits and citrus. Aromas that are floral, herbaceous, and grassy."
                   cbf/caryophyllene 0.17
                   cbf/alpha         0.095
                   cbf/substitutes   "Golding, Chinook"}))


(def centennial
  "Also sold as Super Cascade.

   Earthy and floral flavor with faint citrus notes."
  (hops/build-hop :centennial
                  {cbf/beta          0.045
                   cbf/name          "Centennial"
                   cbf/cohumulone    0.3
                   cbf/type          "Aroma"
                   cbf/myrcene       0.5
                   cbf/humulene      0.14
                   cbf/hsi           0.6
                   cbf/notes         "Also sold as Super Cascade. Earthy and floral flavor with faint citrus notes."
                   cbf/caryophyllene 0.05
                   cbf/alpha         0.115
                   cbf/substitutes   "Chinook, Galena, CTZ"}))


(def hallertau-us
  "Sometimes sold as Mittelfrüher.

   Light aroma of spice and floral notes."
  (hops/build-hop :hallertau-us
                  {cbf/beta          0.055
                   cbf/name          "Hallertau US"
                   cbf/cohumulone    0.23
                   cbf/type          "Aroma"
                   cbf/myrcene       0.4
                   cbf/humulene      0.45
                   cbf/hsi           0.55
                   cbf/notes         "Sometimes sold as Mittelfrüher. Light aroma of spice and floral notes."
                   cbf/caryophyllene 0.1
                   cbf/alpha         0.055
                   cbf/substitutes   "Liberty"}))


(def amarillo
  "Known as VGXP01.

   Strong orange flavor."
  (hops/build-hop :amarillo
                  {cbf/beta          0.07
                   cbf/name          "Amarillo"
                   cbf/cohumulone    0.2
                   cbf/type          "Aroma"
                   cbf/myrcene       0.7
                   cbf/humulene      0.1
                   cbf/hsi           0.95
                   cbf/notes         "Known as VGXP01. Strong orange flavor."
                   cbf/caryophyllene 0.03
                   cbf/alpha         0.11
                   cbf/substitutes   "Cascade, Chinook"}))


(def vanguard
  "Floral and spice notes."
  (hops/build-hop :vanguard
                  {cbf/beta          0.07
                   cbf/name          "Vanguard"
                   cbf/cohumulone    0.15
                   cbf/type          "Aroma"
                   cbf/myrcene       0.25
                   cbf/humulene      0.45
                   cbf/hsi           0.75
                   cbf/notes         "Floral and spice notes."
                   cbf/caryophyllene 0.13
                   cbf/alpha         0.06
                   cbf/substitutes   "Hallertau, Saaz, Mt Hood"}))


(def aroma
  "Hops used for their aroma and flavor over bittering effects."
  (merge crystal
         liberty
         glacier
         mt-hood
         simcoe
         cascade
         willamette
         spalt
         sterling
         santiam
         ultra
         ahtanum
         mosaic
         golding-us
         east-kent-golding
         fuggle-us
         delta
         saaz-us
         palisade
         centennial
         hallertau-us
         amarillo
         vanguard
         strisselspalt))
