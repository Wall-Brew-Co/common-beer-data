(ns common-beer-data.fermentables.grains
  "Data for malt barley and core grains."
  {:added "1.0"}
  (:require [common-beer-format.fermentables :as cbf]))


(def ^:private grain-defaults
  {cbf/version 1
   cbf/amount  0.0
   cbf/type    "Grain"})


(defn ^:private build-grain
  [grain-key grain-data]
  {grain-key (merge grain-data grain-defaults)})


(def acid-malt
  "Acid malt contains acids from natural lactic acids.

   Used by German brewers to adjust malt PH without chemicals to adhere to German purity laws.
   Also enhances head retention."
  (build-grain :acid-malt
               {cbf/name             "Acid Malt"
                cbf/potential        1.027
                cbf/yield            0.587
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            3
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.06
                cbf/notes            "Acid malt contains acids from natural lactic acids. Used by German brewers to adjust malt PH without chemicals to adhere to German purity laws. Also enhances the head retention."}))


(def amber-malt
  "Roasted specialty malt used in some English browns, milds and old ales to add color and a biscuit taste.

   Intense flavor - so limit use.
   Low diastatic power so must be mashed with well modified malts."
  (build-grain :amber-malt
               {cbf/name             "Amber Malt"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.028
                cbf/color            22
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  20
                cbf/max-in-batch     0.2
                cbf/protein          0.1
                cbf/notes            "Roasted specialty malt used in some English browns, milds and old ales to add color and a biscuit taste. Intense flavor - so limit use. Low diastatic power so must be mashed with well modified malts."}))


(def aromatic-malt
  "Provides a very strong malt flavor and aroma to your beer."
  (build-grain :aromatic-malt
               {cbf/name             "Aromatic Malt"
                cbf/potential        1.036
                cbf/yield            0.78
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            26
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  29
                cbf/max-in-batch     0.1
                cbf/protein          0.118
                cbf/notes            "Provides a very strong malt flavor and aroma to your beer."}))


(def barley-flaked
  "Adds significant body to Porters and Stouts.

   High haze producing protein prevents use in light beers."
  (build-grain :barley-flaked
               {cbf/name             "Barley, Flaked"
                cbf/potential        1.032
                cbf/yield            0.7
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.135
                cbf/notes            "Adds significant body to Porters and Stouts. High haze producing protein prevents use in light beers."}))


(def barley-raw
  "Raw, unmalted barley can be used to add body to your beer.

   Use in homebrew requires very fine milling combined with a decoction or multi-stage mash.
   Performs best when used in small quantities with well modified grains."
  (build-grain :barley-raw
               {cbf/name             "Barley, Raw"
                cbf/potential        1.028
                cbf/yield            0.609
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.15
                cbf/protein          0.117
                cbf/notes            "Raw, unmalted barley can be used to add body to your beer. Use in homebrew requires very fine milling combined with a decoction or multi-stage mash. Performs best when used in small quantities with well modified grains."}))


(def barley-torrefied
  "Raw barley that has been popped to open the kernels.

   Used in place of raw barley for faster conversion and higher yields.
   High in haze producing protein."
  (build-grain :barley-torrefied
               {cbf/name             "Barley, Torrefied"
                cbf/potential        1.036
                cbf/yield            0.79
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.4
                cbf/protein          0.16
                cbf/notes            "Raw barley that has been popped to open the kernels. Used in place of raw barley for faster conversion and higher yields. High in haze producing protein."}))


(def biscuit-malt
  "Use for English ales, brown ales and porters.

   Adds a biscuit like flavor and aroma.
   Can be used as a substitute for toasted malt."
  (build-grain :biscuit-malt
               {cbf/name             "Biscuit Malt"
                cbf/potential        1.036
                cbf/yield            0.79
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            23
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  6
                cbf/max-in-batch     0.1
                cbf/protein          0.105
                cbf/notes            "Use for English ales, brown ales and porters. Adds a biscuit like flavor and aroma. Can be used as a substitute for toasted malt."}))


(def black-patent-malt
  "Dark color and dry roasted flavor characteristic of Stouts and Porters.

   Used for: Coloring in small amounts, or flavoring of Stouts and Porters in larger amounts."
  (build-grain :black-patent-malt
               {cbf/name             "Black (Patent) Malt"
                cbf/potential        1.025
                cbf/yield            0.55
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.06
                cbf/color            500
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.132
                cbf/notes            "Dark color and dry roasted flavor characteristic of Stouts and Porters. Used for: Coloring in small amounts, or flavoring of Stouts and Porters in larger amounts."}))


(def black-barley-stout
  "Unmalted barley roasted at high temperature to create a dry, coffee like flavor.

   Imparts a sharp acrid flavor characteristic of dry stouts.
   Gives dryness to a stout or porter."
  (build-grain :black-barley-stout
               {cbf/name             "Black Barley (Stout)"
                cbf/potential        1.025
                cbf/yield            0.55
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.05
                cbf/color            500
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.132
                cbf/notes            "Unmalted barley roasted at high temperature to create a dry, coffee like flavor. Imparts a sharp acrid flavor characteristic of dry stouts. Gives dryness to a stout or porter."}))


(def brown-malt
  "Imparts a dry, biscuit flavor.

   Used in nut brown ales, porters and some Belgian ales."
  (build-grain :brown-malt
               {cbf/name             "Brown Malt"
                cbf/potential        1.032
                cbf/yield            0.7
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            65
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0
                cbf/notes            "Imparts a dry, biscuit flavor. Used in nut brown ales, porters and some Belgian ales."}))


(def brumalt
  "Dark German malt developed to add malt flavor of Alt, Marzen and Oktoberfest beers.

   Helps create authentic maltiness without having to do a decoction mash."
  (build-grain :brumalt
               {cbf/name             "Brumalt"
                cbf/potential        1.033
                cbf/yield            0.717
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            23
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.07
                cbf/notes            "Dark German malt developed to add malt flavor of Alt, Marzen and Oktoberfest beers. Helps create authentic maltiness without having to do a decoction mash."}))


(def cara-pils-dextrine
  "Significantly increases foam/head retention and body of the beer."
  (build-grain :cara-pils-dextrine
               {cbf/name             "Cara-Pils/Dextrine"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Significantly increases foam/head retention and body of the beer."}))


(def carafoam
  "Significantly increases foam/head retention and body of the beer."
  (build-grain :carafoam
               {cbf/name             "CaraFoam"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Significantly increases foam/head retention and body of the beer."}))


(def dextrine
  "Significantly increases foam/head retention and body of the beer."
  (build-grain :dextrine
               {cbf/name             "Dextrine"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Significantly increases foam/head retention and body of the beer."}))


(def caraamber
  "Adds body, color and improves head retention."
  (build-grain :caraamber
               {cbf/name             "Caraamber"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            30
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-10l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-10l
               {cbf/name             "Caramel/Crystal Malt - 10L"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            10
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-20l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-20l
               {cbf/name             "Caramel/Crystal Malt - 20L"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            20
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-30l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-30l
               {cbf/name             "Caramel/Crystal Malt - 30L"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            30
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-40l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-40l
               {cbf/name             "Caramel/Crystal Malt - 40L"
                cbf/potential        1.034
                cbf/yield            0.74
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            40
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-60l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-60l
               {cbf/name             "Caramel/Crystal Malt - 60L"
                cbf/potential        1.034
                cbf/yield            0.74
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            60
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-80l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-80l
               {cbf/name             "Caramel/Crystal Malt - 80L"
                cbf/potential        1.034
                cbf/yield            0.74
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            80
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-90l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-90l
               {cbf/name             "Caramel/Crystal Malt - 90L"
                cbf/potential        1.034
                cbf/yield            0.74
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            90
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-120l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-120l
               {cbf/name             "Caramel/Crystal Malt - 120L"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            120
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.102
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-140l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-140l
               {cbf/name             "Caramel/Crystal Malt - 140L"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            140
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.102
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramel-crystal-malt-160l
  "Adds body, color and improves head retention."
  (build-grain :caramel-crystal-malt-160l
               {cbf/name             "Caramel/Crystal Malt - 160L"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            160
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.102
                cbf/notes            "Adds body, color and improves head retention."}))


(def caramunich-malt
  "Caramel, copper colored malt.

   Used in Belgian ales and German bocks."
  (build-grain :caramunich-malt
               {cbf/name             "Caramunich Malt"
                cbf/potential        1.033
                cbf/yield            0.717
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            56
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0
                cbf/notes            "Caramel, copper colored malt. Used in Belgian ales and German bocks."}))


(def carared
  "Adds body, color and improves head retention."
  (build-grain :carared
               {cbf/name             "Carared"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            20
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0.132
                cbf/notes            "Adds body, color and improves head retention."}))


(def caravienne-malt
  "Light Belgian crystal malt.

   Used in light Trappist and Abbey style Belgian ales."
  (build-grain :caravienne-malt
               {cbf/name             "Caravienne Malt"
                cbf/potential        1.034
                cbf/yield            0.739
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            22
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0
                cbf/notes            "Light Belgian crystal malt. Used in light Trappist and Abbey style Belgian ales."}))


(def chocolate-malt
  "Dark malt that gives a rich red or brown color and nutty flavor.

   Maintains some malty flavor, not as dark as roasted malt."
  (build-grain :chocolate-malt
               {cbf/name             "Chocolate Malt"
                cbf/potential        1.028
                cbf/yield            0.6
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            350
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.132
                cbf/notes            "Dark malt that gives a rich red or brown color and nutty flavor. Maintains some malty flavor, not as dark as roasted malt."}))


(def chocolate-malt-uk
  "Dark malt that gives a rich red or brown color and nutty flavor.

   Maintains some malty flavor, not as dark as roasted malt."
  (build-grain :chocolate-malt-uk
               {cbf/name             "Chocolate Malt (UK)"
                cbf/potential        1.034
                cbf/yield            0.73
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            450
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.105
                cbf/notes            "Dark malt that gives a rich red or brown color and nutty flavor. Maintains some malty flavor, not as dark as roasted malt."}))


(def corn-flaked
  "Generally a neutral flavor; used to reduce maltiness of beer."
  (build-grain :corn-flaked
               {cbf/name             "Corn (Flaked)"
                cbf/potential        1.030
                cbf/yield            0.825
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            3
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     1
                cbf/protein          0.1
                cbf/notes            "Generally a neutral flavor, used to reduce maltiness of beer."}))


(def maris-otter-pale-malt
  "A base malt from the UK."
  (build-grain :maris-otter-pale-malt
               {cbf/name             "Maris Otter Pale Malt"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.013
                cbf/moisture         0.035
                cbf/color            1
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  10
                cbf/max-in-batch     1
                cbf/protein          0.1
                cbf/notes            "A base malt from the UK."}))


(def melanoiden-malt
  "Aromatic malt from Banberg, Germany.

   Promotes a full flavor and rounds off beer color.
   Promotes deep red color and malty flavor."
  (build-grain :melanoiden-malt
               {cbf/name             "Melanoiden Malt"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.013
                cbf/moisture         0.035
                cbf/color            20
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  10
                cbf/max-in-batch     0.15
                cbf/protein          0.11
                cbf/notes            "Aromatic malt from Banberg, Germany. Promotes a full flavor and rounds off beer color. Promotes deep red color and malty flavor."}))


(def mild-malt
  "Also called 'English Mild' - a light specialty malt used in Brown Ales."
  (build-grain :mild-malt
               {cbf/name             "Mild Malt"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            4
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  53
                cbf/max-in-batch     1
                cbf/protein          0.106
                cbf/notes            "Also called 'English Mild' - a light specialty malt used in Brown Ales."}))


(def munich-malt
  "Malty-sweet flavor characteristic and adds a reddish amber color to the beer.

   Does not contribute significantly to body or head retention."
  (build-grain :munich-malt
               {cbf/name             "Munich Malt"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.013
                cbf/moisture         0.05
                cbf/color            9
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  72
                cbf/max-in-batch     0.8
                cbf/protein          0.115
                cbf/notes            "Malty-sweet flavor characteristic and adds a reddish amber color to the beer. Does not contribute significantly to body or head retention."}))


(def munich-malt-10l
  "Malty-sweet flavor characteristic and adds a slight orange color to the beer."
  (build-grain :munich-malt-10l
               {cbf/name             "Munich Malt - 10L"
                cbf/potential        1.035
                cbf/yield            0.77
                cbf/coarse-fine-diff 0.028
                cbf/moisture         0.05
                cbf/color            10
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  50
                cbf/max-in-batch     0.8
                cbf/protein          0.135
                cbf/notes            "Malty-sweet flavor characteristic and adds a slight orange color to the beer."}))


(def munich-malt-20l
  "Malty-sweet flavor characteristic and adds a slight orange color to the beer."
  (build-grain :munich-malt-20l
               {cbf/name             "Munich Malt - 20L"
                cbf/potential        1.035
                cbf/yield            0.75
                cbf/coarse-fine-diff 0.028
                cbf/moisture         0.05
                cbf/color            20
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  25
                cbf/max-in-batch     0.8
                cbf/protein          0.135
                cbf/notes            "Malty-sweet flavor characteristic and adds a orange to deep orange color to the beer."}))


(def oats-flaked
  "Adds body, mouth feel and head retention to the beer.

   Adds substantial protein haze to light beers.
   Protein rest recommended unless flakes are pre-gelatinized."
  (build-grain :oats-flaked
               {cbf/name             "Oats, Flaked"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            1
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.3
                cbf/protein          0.09
                cbf/notes            "Adds body, mouth feel and head retention to the beer. Adds substantial protein haze to light beers. Protein rest recommended unless flakes are pre-gelatinized."}))


(def oats-malted
  "Malted oats. Adds body, mouth feel and head retention to the beer.

   Creates chill haze in lighter beers, so is primarily used in dark ones."
  (build-grain :oats-malted
               {cbf/name             "Oats, Malted"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            1
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.09
                cbf/notes            "Malted oats. Adds body, mouth feel and head retention to the beer. Creates chill haze in lighter beers, so is primarily used in dark ones."}))


(def pale-malt-2-row-belgium
  "Base malt for all beer styles."
  (build-grain :pale-malt-2-row-belgium
               {cbf/name             "Pale Malt (2 Row) - Belgium"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            3
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  60
                cbf/max-in-batch     1
                cbf/protein          0.105
                cbf/notes            "Base malt for all beer styles."}))


(def pale-malt-2-row-uk
  "Base malt for all beer styles."
  (build-grain :pale-malt-2-row-uk
               {cbf/name             "Pale Malt (2 Row) - UK"
                cbf/potential        1.036
                cbf/yield            0.78
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            3
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  45
                cbf/max-in-batch     1
                cbf/protein          0.101
                cbf/notes            "Base malt for all English beer styles."}))


(def pale-malt-2-row-us
  "Base malt for all beer styles."
  (build-grain :pale-malt-2-row-us
               {cbf/name             "Pale Malt (2 Row) - USA"
                cbf/potential        1.036
                cbf/yield            0.79
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  140
                cbf/max-in-batch     1
                cbf/protein          0.123
                cbf/notes            "Base malt for all beer styles."}))


(def pale-malt-6-row-us
  "Base malt for all beer styles."
  (build-grain :pale-malt-6-row-us
               {cbf/name             "Pale Malt (6 Row) - USA"
                cbf/potential        1.035
                cbf/yield            0.76
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  150
                cbf/max-in-batch     1
                cbf/protein          0.13
                cbf/notes            "Base malt for all beer styles."}))


(def peat-smoked-malt
  "Robust smoky malt that provides a smoky flavor.

   Used in scottish ales and wee heavy ales."
  (build-grain :peat-smoked-malt
               {cbf/name             "Peat Smoked Malt"
                cbf/potential        1.034
                cbf/yield            0.74
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            3
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.2
                cbf/protein          0
                cbf/notes            "Robust smoky malt that provides a smoky flavor. Used in scottish ales and wee heavy ales."}))


(def pilsner-2-row-belgium
  "Belgian base malt for Continental lagers."
  (build-grain :pilsner-2-row-belgium
               {cbf/name             "Pilsner (2 Row) - Belgium"
                cbf/potential        1.036
                cbf/yield            0.79
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  105
                cbf/max-in-batch     1
                cbf/protein          0.105
                cbf/notes            "Belgian base malt for Continental lagers."}))


(def pilsner-2-row-germany
  "German base for Pilsners and Bohemian Lagers."
  (build-grain :pilsner-2-row-germany
               {cbf/name             "Pilsner (2 Row) - Germany"
                cbf/potential        1.037
                cbf/yield            0.81
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  110
                cbf/max-in-batch     1
                cbf/protein          0.11
                cbf/notes            "German base for Pilsners and Bohemian Lagers."}))


(def pilsner-2-row-uk
  "Pilsner base malt."
  (build-grain :pilsner-2-row-uk
               {cbf/name             "Pilsner (2 Row) - UK"
                cbf/potential        1.036
                cbf/yield            0.78
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            1
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  60
                cbf/max-in-batch     1
                cbf/protein          0.1
                cbf/notes            "Pilsner base malt."}))


(def rice-flaked
  "Used to add fermentable sugar without increasing body.

   Produces a milder, less grainy tasting beer."
  (build-grain :rice-flaked
               {cbf/name             "Rice, Flaked"
                cbf/potential        1.032
                cbf/yield            0.7
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            1
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.25
                cbf/protein          0.1
                cbf/notes            "Used to add fermentable sugar without increasing body. Produces a milder, less grainy tasting beer."}))


(def roasted-barley
  "Roasted at high temperature to create a burnt, grainy, coffee like flavor.

   Imparts a red to deep brown color to beer, and very strong roasted flavor."
  (build-grain :roasted-barley
               {cbf/name             "Roasted Barley"
                cbf/potential        1.025
                cbf/yield            0.55
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.05
                cbf/color            300
                cbf/recommend-mash   false
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.132
                cbf/notes            "Roasted at high temperature to create a burnt, grainy, coffee like flavor. Imparts a red to deep brown color to beer, and very strong roasted flavor."}))


(def rye-malt
  "Adds a dry, crisp character to the beer.

   Yields a deep red color, and a distinctive rye flavor."
  (build-grain :rye-malt
               {cbf/name             "Rye Malt"
                cbf/potential        1.029
                cbf/yield            0.63
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            5
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  75
                cbf/max-in-batch     0.15
                cbf/protein          0.103
                cbf/notes            "Adds a dry, crisp character to the beer. Yields a deep red color, and a distinctive rye flavor."}))


(def rye-flaked
  "Imparts a dry, crisp rye flavor to rye beers. Can be easier to mash than raw rye."
  (build-grain :rye-flaked
               {cbf/name             "Rye, Flaked"
                cbf/potential        1.036
                cbf/yield            0.783
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0
                cbf/notes            "Imparts a dry, crisp rye flavor to rye beers. Can be easier to mash than raw rye."}))


(def smoked-malt
  "Malt that has been smoked over an open fire. Creates a distinctive smoke flavor and aroma."
  (build-grain :smoked-malt
               {cbf/name             "Smoked Malt"
                cbf/potential        1.037
                cbf/yield            0.8
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            9
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     1
                cbf/protein          0.115
                cbf/notes            "Malt that has been smoked over an open fire. Creates a distinctive smoke flavor and aroma."}))


(def special-b-malt
  "Extreme caramel aroma and flavored malt.

   Used in dark Belgian Abbey and Trappist ales."
  (build-grain :special-b-malt
               {cbf/name             "Special B Malt"
                cbf/potential        1.030
                cbf/yield            0.652
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            180
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0
                cbf/notes            "Extreme caramel aroma and flavored malt. Used in dark Belgian Abbey and Trappist ales."}))


(def special-roast
  "Use for English ales, nut brown ales and porters.

   Adds a toasted, biscuit like flavor and aroma."
  (build-grain :special-roast
               {cbf/name             "Special Roast"
                cbf/potential        1.033
                cbf/yield            0.72
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.025
                cbf/color            50
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  6
                cbf/max-in-batch     0.1
                cbf/protein          0.105
                cbf/notes            "Use for English ales, nut brown ales and porters. Adds a toasted, biscuit like flavor and aroma."}))


(def toasted-malt
  "Similar to Biscuit or Victory malt, this malt adds reddish/orange color and improved body without sweetness along with a toasted flavor."
  (build-grain :toasted-malt
               {cbf/name             "Toasted Malt"
                cbf/potential        1.033
                cbf/yield            0.717
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            27
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.117
                cbf/notes            "Similar to Biscuit or Victory malt, this malt adds reddish/orange color and improved body without sweetness along with a toasted flavor."}))


(def victory-malt
  "Toasted malt that adds a Biscuit or toasted flavor to English ales."
  (build-grain :victory-malt
               {cbf/name             "Victory Malt"
                cbf/potential        1.034
                cbf/yield            0.73
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            25
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  50
                cbf/max-in-batch     0.15
                cbf/protein          0.132
                cbf/notes            "Toasted malt that adds a Biscuit or toasted flavor to English ales."}))


(def vienna-malt
  "Kiln dried malt darker than Pale Malt, but not as dark as Munich Malt.

   Imparts a golden to orange color to the beer."
  (build-grain :vienna-malt
               {cbf/name             "Vienna Malt"
                cbf/potential        1.036
                cbf/yield            0.78
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            4
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  50
                cbf/max-in-batch     0.9
                cbf/protein          0.11
                cbf/notes            "Kiln dried malt darker than Pale Malt, but not as dark as Munich Malt. Imparts a golden to orange color to the beer."}))


(def wheat-malt-belgium
  "Malted wheat for use in Wheat beers."
  (build-grain :wheat-malt-belgium
               {cbf/name             "Wheat Malt - Belgium"
                cbf/potential        1.037
                cbf/yield            0.81
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  74
                cbf/max-in-batch     0.6
                cbf/protein          0.115
                cbf/notes            "Malted wheat for use in Wheat beers."}))


(def dark-wheat-malt
  "Dark malted wheat base for use in dark wheat styles such as Dunkleweizen."
  (build-grain :dark-wheat-malt
               {cbf/name             "Dark Wheat Malt"
                cbf/potential        1.039
                cbf/yield            0.84
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.035
                cbf/color            9
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  10
                cbf/max-in-batch     0.2
                cbf/protein          0.115
                cbf/notes            "Dark malted wheat base for use in dark wheat styles such as Dunkleweizen."}))


(def wheat-malt-germany
  "Malted wheat base for use in all wheat styles."
  (build-grain :wheat-malt-germany
               {cbf/name             "Wheat Malt - Germany"
                cbf/potential        1.039
                cbf/yield            0.84
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  95
                cbf/max-in-batch     0.6
                cbf/protein          0.125
                cbf/notes            "Malted wheat base for use in all wheat styles."}))


(def wheat-flaked
  "Flaked wheat adds to increased body and foam retention.

   May be used in small amounts to improve head retention and body."
  (build-grain :wheat-flaked
               {cbf/name             "Wheat, Flaked"
                cbf/potential        1.035
                cbf/yield            0.77
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.4
                cbf/protein          0.16
                cbf/notes            "Flaked wheat adds to increased body and foam retention. May be used in small amounts to improve head retention and body."}))


(def wheat-roasted
  "Also called Chocolate Wheat Malt.

   Adds a deep, dark brown color to dunkelweizens and other dark beer styles."
  (build-grain :wheat-roasted
               {cbf/name             "Wheat, Roasted"
                cbf/potential        1.025
                cbf/yield            0.543
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.04
                cbf/color            425
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.1
                cbf/protein          0.13
                cbf/notes            "Also called Chocolate Wheat Malt. Adds a deep, dark brown color to dunkelweizens and other dark beer styles."}))


(def wheat-torrified
  "Unmodified wheat that has been popped to open the kernels.

   Protein rest recommended when mashing."
  (build-grain :wheat-torrified
               {cbf/name             "Wheat, Torrified"
                cbf/potential        1.036
                cbf/yield            0.79
                cbf/coarse-fine-diff 0.015
                cbf/moisture         0.09
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  0
                cbf/max-in-batch     0.4
                cbf/protein          0.16
                cbf/notes            "Unmodified wheat that has been popped to open the kernels. Protein rest recommended when mashing."}))


(def white-wheat-malt
  "White wheat gives a malty flavor not available from raw wheat."
  (build-grain :white-wheat-malt
               {cbf/name             "White Wheat Malt"
                cbf/potential        1.040
                cbf/yield            0.86
                cbf/coarse-fine-diff 0.022
                cbf/moisture         0.04
                cbf/color            2
                cbf/recommend-mash   true
                cbf/add-after-boil   false
                cbf/diastatic-power  130
                cbf/max-in-batch     0.6
                cbf/protein          0.145
                cbf/notes            "White wheat gives a malty flavor not available from raw wheat."}))


(def grains
  "Whole or milled barley, rye, wheat, or other grain."
  (merge acid-malt
         amber-malt
         aromatic-malt
         barley-flaked
         barley-raw
         barley-torrefied
         biscuit-malt
         black-patent-malt
         black-barley-stout
         brown-malt
         brumalt
         cara-pils-dextrine
         carafoam
         dextrine
         caraamber
         caramel-crystal-malt-10l
         caramel-crystal-malt-20l
         caramel-crystal-malt-30l
         caramel-crystal-malt-40l
         caramel-crystal-malt-60l
         caramel-crystal-malt-80l
         caramel-crystal-malt-90l
         caramel-crystal-malt-120l
         caramel-crystal-malt-140l
         caramel-crystal-malt-160l
         caramunich-malt
         carared
         caravienne-malt
         chocolate-malt
         chocolate-malt-uk
         corn-flaked
         melanoiden-malt
         mild-malt
         munich-malt
         munich-malt-10l
         munich-malt-20l
         oats-flaked
         oats-malted
         maris-otter-pale-malt
         pale-malt-2-row-belgium
         pale-malt-2-row-uk
         pale-malt-2-row-us
         pale-malt-6-row-us
         peat-smoked-malt
         pilsner-2-row-belgium
         pilsner-2-row-germany
         pilsner-2-row-uk
         rice-flaked
         roasted-barley
         rye-malt
         rye-flaked
         smoked-malt
         special-b-malt
         special-roast
         toasted-malt
         victory-malt
         vienna-malt
         wheat-malt-belgium
         dark-wheat-malt
         wheat-malt-germany
         wheat-flaked
         wheat-roasted
         wheat-torrified
         white-wheat-malt))
