(ns common-beer-data.yeasts.dcl-fermentis
  "Data for yeasts cultivated by DCL/Fermentis.
   
   https://fermentis.com/en/fermentation-solutions/beer/"
  {:added "1.0"}
  (:require [common-beer-data.yeasts.yeasts :as yeasts]
            [common-beer-format.yeasts :as cbf]))


(def k-97-safale-german-ale
  "Low sedimentation yeast, sometimes used in open fermentation. 
   
   Good for wheat beers, weizens and light ales."
  (yeasts/build-yeasts :k-97-safale-german-ale
                       {cbf/min-temperature 15.0
                        cbf/name            "K-97 SafAle German Ale"
                        cbf/max-temperature 24.0
                        cbf/type            "Ale"
                        cbf/best-for        "High attenuation ales, wheat beers and weizens."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "Low sedimentation yeast, sometimes used in open fermentation. Good for wheat beers, weizens and light ales."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "K-97"}))


(def s-04-safale-english-ale
  "Fast starting, fast fermenting yeast. 
   
   Quick attenuation helps to produce a clean, crisp, clear ale. 
   Can be used in a wide range of ales."
  (yeasts/build-yeasts :s-04-safale-english-ale
                       {cbf/min-temperature 15.0
                        cbf/name            "S-04 SafAle English Ale"
                        cbf/max-temperature 24.0
                        cbf/type            "Ale"
                        cbf/best-for        "Great general purpose ale yeast."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "Fast starting, fast fermenting yeast. Quick attenuation helps to produce a clean, crisp, clear ale. Can be used in a wide range of ales."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "S-04"}))


(def s-189-saflager-german-lager
  "Popular lager yeast strain. 
   
   Produces wide range of continental lagers and pilsners. 
   Clean finish."
  (yeasts/build-yeasts :s-189-saflager-german-lager
                       {cbf/min-temperature 8.89
                        cbf/name            "S-189 SafLager German Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "Wide range of lagers and pilsners."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "Popular lager yeast strain. Produces wide range of continental lagers and pilsners. Clean finish."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "S-189"}))


(def s-23-saflager-west-european-lager
  "German lager yeast strain. 
   
   Performs well at low temperature. 
   High flocculation and attenuation for a clean German finish."
  (yeasts/build-yeasts :s-23-saflager-west-european-lager
                       {cbf/min-temperature 7.78
                        cbf/name            "S-23 SafLager West European Lager"
                        cbf/max-temperature 10.0
                        cbf/type            "Lager"
                        cbf/best-for        "German style Lagers and Pilsners."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "German lager yeast strain. Performs well at low temperature. High flocculation and attenuation for a clean German finish."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "S-23"}))


(def s-33-safbrew-ale
  "General purpose ale yeast, widely used. 
   
   Very consistent, clean finish. 
   High attenuation and good flavor profile."
  (yeasts/build-yeasts :s-33-safbrew-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "S-33 SafBrew Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Most ales."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "General purpose ale yeast, widely used. Very consistent, clean finish. High attenuation and good flavor profile."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "S-33"}))


(def t-58-safbrew-specialty-ale
  "Estery, somewhat spicy ale yeast. 
   
   Solid yeast formation at end of fermentation. 
   Widely used for bottle and cask conditioning."
  (yeasts/build-yeasts :t-58-safbrew-specialty-ale
                       {cbf/min-temperature 15.56
                        cbf/name            "T-58 SafBrew Specialty Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Complex ales."
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "Estery, somewhat spicy ale yeast. Solid yeast formation at end of fermentation. Widely used for bottle and cask conditioning."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "T-58"}))


(def us-05-safale-american
  "American ale yeast that produces well balanced beers with low diacetyl and a very clean, crisp end palate."
  (yeasts/build-yeasts :us-05-safale-american
                       {cbf/min-temperature 15.0
                        cbf/name            "US-05 Safale American"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "American ale, other clean finish ales"
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "American ale yeast that produces well balanced beers with low diacetyl and a very clean, crisp end palate."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "US-05"}))


(def w-34-70-saflager-lager
  "A famous yeast strain from Weihenstephan Germany used worldwide in brewing. 
   
   Their most popular strain for lagers."
  (yeasts/build-yeasts :w-34-70-saflager-lager
                       {cbf/min-temperature 8.89
                        cbf/name            "W-34/70 Saflager Lager"
                        cbf/max-temperature 15.0
                        cbf/type            "Lager"
                        cbf/best-for        "European lagers"
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "A famous yeast strain from Weihenstephan Germany used worldwide in brewing. Their most popular strain for lagers."
                        cbf/flocculation    "High"
                        cbf/form            "Dry"
                        cbf/product-id      "W-34/70"}))


(def wb-06-safbrew-wheat
  "A specialty yeast for wheat beer fermentation. 
   
   The yeast produces a subtle estery and phenlol flavor typical of wheat beers."
  (yeasts/build-yeasts :wb-06-safbrew-wheat
                       {cbf/min-temperature 15.0
                        cbf/name            "WB-06 Safbrew Wheat"
                        cbf/max-temperature 23.89
                        cbf/type            "Wheat"
                        cbf/best-for        "Wheat beers"
                        cbf/laboratory      "DCL/Fermentis"
                        cbf/attenuation     0.765
                        cbf/notes           "A specialty yeast for wheat beer fermentation. The yeast produces a subtle estery and phenlol flavor typical of wheat beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Dry"
                        cbf/product-id      "WB-06"}))


(def dcl-fermentis
  "Data for yeasts cultivated by DCL/Fermentis.
   
   https://fermentis.com/en/fermentation-solutions/beer/"
  (merge k-97-safale-german-ale
         s-04-safale-english-ale
         s-189-saflager-german-lager
         s-23-saflager-west-european-lager
         s-33-safbrew-ale
         t-58-safbrew-specialty-ale
         us-05-safale-american
         w-34-70-saflager-lager
         wb-06-safbrew-wheat))
