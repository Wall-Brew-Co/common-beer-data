(ns common-beer-data.styles.bjcp-2015.international-lager
  "2015 BJCP guidelines on International Lagers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def international-pale-lager
  "A highly-attenuated pale lager without strong flavors, typically well-balanced and highly carbonated.
   
   Served cold, it is refreshing and thirst-quenching."
  (styles/build-style :international-pale-lager
                      {cbf/category        "International Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.012
                       cbf/og-min          1.042
                       cbf/name            "International Pale Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.046
                       cbf/fg-min          1.008
                       cbf/category-number "2"
                       cbf/carb-max        3.0
                       cbf/ibu-max         25
                       cbf/ingredients     "Two- or six-row barley. May use rice, corn, or sugar as adjuncts, or may be all malt."
                       cbf/examples        "Asahi Super Dry, Birra Moretti, Corona Extra, Devils Backbone Gold Leaf Lager, Full Sail Session Premium Lager, Heineken, Red Stripe, Singha"
                       cbf/notes           "A highly-attenuated pale lager without strong flavors, typically well-balanced and highly carbonated. Served cold, it is refreshing and thirst-quenching."
                       cbf/og-max          1.05
                       cbf/color-min       2.0
                       cbf/abv-max         0.06
                       cbf/color-max       6.0
                       cbf/profile         "Aroma: Low to medium-low malt aroma, which can be grainy-malty or slightly corny-sweet. Hop aroma may range from very low to a medium, spicy or floral hop presence. While a clean fermentation profile is generally most desirable, low levels of yeast character (such as a light apple fruitiness) are not a fault. A light amount of DMS or corn aroma is not a fault. Appearance: Pale straw to gold color. White, frothy head may not be long lasting. Very clear. Flavor: Low to moderate levels of grainy-malt flavor, with a crisp, dry, well-attenuated finish. The grain character can be somewhat neutral, or show a light bready-crackery quality or up to moderate corny or malty sweetness. Hop flavor ranges from none to medium levels, and often showing a floral, spicy, or herbal character if detected. Hop bitterness at medium-low to medium level. Balance may vary from slightly malty to slightly bitter, but is relatively close to even. Neutral aftertaste with light malt and sometimes hop flavors. A light amount of DMS is not a fault. Mouthfeel: Light to medium body. Moderately high to highly carbonated. Can have a slight carbonic bite on the tongue."
                       cbf/ibu-min         18}))


(def international-amber-lager
  "A well-attenuated malty amber lager with an interesting caramel or toast quality and restrained bitterness. 
   
   Usually fairly well-attenuated, often with an adjunct quality. 
   Smooth, easily-drinkable lager character."
  (styles/build-style :international-amber-lager
                      {cbf/category        "International Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.042
                       cbf/name            "International Amber Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.046
                       cbf/fg-min          1.008
                       cbf/category-number "2"
                       cbf/carb-max        3.0
                       cbf/ibu-max         25
                       cbf/ingredients     "Two-row or six-row base malt. Color malts such as victory, amber, etc. Caramel malt adjuncts. European or American hops or a combination of both."
                       cbf/examples        "Brooklyn Lager, Capital Winter Skål, Dos Equis Amber, Schell's Oktoberfest, Yuengling Lager"
                       cbf/notes           "A well-attenuated malty amber lager with an interesting caramel or toast quality and restrained bitterness. Usually fairly well-attenuated, often with an adjunct quality. Smooth, easily-drinkable lager character."
                       cbf/og-max          1.055
                       cbf/color-min       7.0
                       cbf/abv-max         0.06
                       cbf/color-max       14.0
                       cbf/profile         "Aroma: Low to moderate malt aroma which can be grainy, with a very low to moderate caramel-sweet to toasty-malty aroma. Hop aroma can range from low to none with a mildly floral or spicy character. Clean lager profile. A slight DMS or corny aroma is acceptable. Appearance: Golden-amber to reddish-copper color. Bright clarity. White to off-white foam stand which may not last. Flavor: Low to moderate malt profile which can vary from dry to grainy-sweet. Low to moderate levels of caramel and toasty-bready notes can be evident. Low to medium-low corny sweetness is optional, but not a fault. Hop bitterness is low to moderate, and hop flavor is low to moderate with a spicy, herbal, or floral character. The balance can be fairly malty to nearly even, with the bitterness becoming more noticeable but not objectionable. The bitterness level can increase if the malt character increases to match. Clean fermentation profile. Finish is moderately dry with a moderately malty aftertaste. Mouthfeel: Light to medium body. Medium to high carbonation. Smooth; some examples can be creamy."
                       cbf/ibu-min         8}))


(def international-dark-lager
  "A darker and somewhat sweeter version of international pale lager with a little more body and flavor, but equally restrained in bitterness. 
   
   The low bitterness leaves the malt as the primary flavor element, and the low hop levels provide very little in the way of balance."
  (styles/build-style :international-dark-lager
                      {cbf/category        "International Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.012
                       cbf/og-min          1.044
                       cbf/name            "International Dark Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.042
                       cbf/fg-min          1.008
                       cbf/category-number "2"
                       cbf/carb-max        3.0
                       cbf/ibu-max         20
                       cbf/ingredients     "Two- or six-row barley, corn, rice, or sugars as adjuncts. Light use of caramel and darker malts. Commercial versions may use coloring agents."
                       cbf/examples        "Baltika #4 Original, Devils Backbone Old Virginia Dark, Dixie Blackened Voodoo, Saint Pauli Girl Dark, San Miguel Dark, Session Black Dark Lager, Shiner Bock"
                       cbf/notes           "A darker and somewhat sweeter version of international pale lager with a little more body and flavor, but equally restrained in bitterness. The low bitterness leaves the malt as the primary flavor element, and the low hop levels provide very little in the way of balance."
                       cbf/og-max          1.056
                       cbf/color-min       14.0
                       cbf/abv-max         0.06
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Little to no malt aroma; may have a light corn character. Medium-low to no roast and caramel malt aroma. Hop aroma may range from none to light spicy or floral hop presence. While a clean fermentation profile is generally most desirable, low levels of yeast character (such as a light apple fruitiness) are not a fault. A light amount of DMS or corn aroma is not a fault. Appearance: Deep amber to dark brown with bright clarity and ruby highlights. Foam stand may not be long lasting, and is beige to light tan in color. Flavor: Low to medium malty sweetness with medium-low to no caramel and/or roasted malt flavors (and may include hints of coffee, molasses or cocoa). Hop flavor ranges from none to low levels, and is typically floral, spicy, or herbal. Low to medium hop bitterness. May have a very light fruitiness. Moderately crisp finish. The balance is typically somewhat malty. Burnt or moderately strong roasted malt flavors are a defect. Mouthfeel: Light to medium-light body. Smooth with a light creaminess. Medium to high carbonation."
                       cbf/ibu-min         8}))


(def international-lager
  "2015 BJCP guidelines on International Lagers."
  (merge international-pale-lager
         international-amber-lager
         international-dark-lager))
