(ns common-beer-data.yeasts.lallemand
  "Data for yeasts cultivated by Lallemand.
   https://www.lallemandbrewing.com/en/canada/products/brewing-yeast/"
  {:added "1.0"}
  (:require [common-beer-data.yeasts.yeasts :as yeasts]
            [common-beer-format.yeasts :as cbf]))


(def lalvin-71b-1122
  "Rapid starter with constant and complete fermentation. 
   
   Ability to metabolize high amounts (20-40%) of malic acid. 
   Partial metabolism of malic acid helps soften the wine. 
   May produce significant esters, making it a good choice for concentrates."
  (yeasts/build-yeasts :lalvin-71b-1122
                       {cbf/min-temperature 15.0
                        cbf/name            "71B-1122 Lalvin"
                        cbf/max-temperature 30.0
                        cbf/type            "Wine"
                        cbf/best-for        "Young wines such as nouveau, blush and sugar white."
                        cbf/laboratory      "Lallemand"
                        cbf/attenuation     0.765
                        cbf/notes           "Rapid starter with constant and complete fermentation. Ability to metabolize high amounts (20-40%) of malic acid. Partial metabolism of malic acid helps soften the wine. May produce significant esters, making it a good choice for concentrates."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "71B-1122"}))


(def lalvin-d-47
  "Recommended for white variety wines such as Chardonnay and Rose as well as Mead. 
   
   Low foaming, quick fermenting, forming a compact lees at the end of fermentation. 
   Use yeast nutrients if making mead. 
   Saccharomyces Cerevisiae."
  (yeasts/build-yeasts :lalvin-d-47
                       {cbf/min-temperature 10.0
                        cbf/name            "D-47 Lalvin"
                        cbf/max-temperature 30.0
                        cbf/type            "Wine"
                        cbf/best-for        "White wines such as Chardonnay and Rose. Also good for mead."
                        cbf/laboratory      "Lallemand"
                        cbf/attenuation     0.765
                        cbf/notes           "Recommended for white variety wines such as Chardonnay and Rose as well as Mead. Low foaming, quick fermenting, forming a compact lees at the end of fermentation. Use yeast nutrients if making mead. Saccharomyces Cerevisiae."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "D-47"}))


(def lalvin-ec-1118
  "Low production of foam, volatile acid and H2S.
   
   Ferments over a wide temperature range.
   High alcohol tolerance, compact lees and good flocculation.
   Relatively neutral flavor and aroma."
  (yeasts/build-yeasts :lalvin-ec-1118
                       {cbf/min-temperature 7.22
                        cbf/name            "EC-1118 Lalvin"
                        cbf/max-temperature 35.0
                        cbf/type            "Wine"
                        cbf/best-for        "All types of wine and also cider."
                        cbf/laboratory      "Lallemand"
                        cbf/attenuation     0.765
                        cbf/notes           "Low production of foam, volatile acid and H2S. Ferments over a wide temperature range. High alcohol tolerance, compact lees and good flocculation. Relatively neutral flavor and aroma."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "EC-1118"}))


(def lalvin-k1v-1116
  "Used for white grape varieties. 
   
   Rapid starter with constant and complete fermentation. 
   Capable of surviving difficult conditions such as low nutrient or high SO2 levels. 
   Has low volatile action."
  (yeasts/build-yeasts :lalvin-k1v-1116
                       {cbf/min-temperature 15.0
                        cbf/name            "K1V-1116 Lalvin"
                        cbf/max-temperature 30.0
                        cbf/type            "Wine"
                        cbf/best-for        "Souvingnon Blanc, Chenin Blanc and Seyval."
                        cbf/laboratory      "Lallemand"
                        cbf/attenuation     0.765
                        cbf/notes           "Used for white grape varieties. Rapid starter with constant and complete fermentation. Capable of surviving difficult conditions such as low nutrient or high SO2 levels. Has low volatile action."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "K1V-1116"}))


(def lalvin-rc-212
  "RC212 recommended for red variety wines and high gravity beers. 
   
   Alcohol tolerance in the 12-14% range. 
   Low foaming and moderate speed fermenting. 
   Saccharomyces Cerevisiae."
  (yeasts/build-yeasts :lalvin-rc-212
                       {cbf/min-temperature 15.0
                        cbf/name            "RC-212 Lalvin"
                        cbf/max-temperature 30.0
                        cbf/type            "Wine"
                        cbf/best-for        "Red wines."
                        cbf/laboratory      "Lallemand"
                        cbf/attenuation     0.765
                        cbf/notes           "RC212 recommended for red variety wines and high gravity beers. Alcohol tolerance in the 12-14% range. Low foaming and moderate speed fermenting. Saccharomyces Cerevisiae."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "RC-212"}))


(def lallemand
  "Data for yeasts cultivated by Lallemand.
   
   https://www.lallemandbrewing.com/en/canada/products/brewing-yeast/"
  (merge lalvin-71b-1122
         lalvin-d-47
         lalvin-ec-1118
         lalvin-k1v-1116
         lalvin-rc-212))
