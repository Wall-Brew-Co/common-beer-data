(ns common-beer-data.styles.bjcp-2015.standard-american-beer
  "2015 BJCP guidelines on Standard American Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def american-light-lager
  "Highly carbonated, very light-bodied, nearly flavorless lager designed to be consumed very cold. 
   
   Very refreshing and thirst quenching."
  (styles/build-style :american-light-lager
                      {cbf/category        "Standard American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.008
                       cbf/og-min          1.028
                       cbf/name            "American Light Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.028
                       cbf/fg-min          0.998
                       cbf/category-number "1"
                       cbf/carb-max        3.0
                       cbf/ibu-max         12
                       cbf/ingredients     "Two- or six-row barley with high percentage (up to 40%) of rice or corn as adjuncts. Additional enzymes can further lighten the body and lower carbohydrates."
                       cbf/examples        "Bud Light, Coors Light, Keystone Light, Michelob Light, Miller Lite, Old Milwaukee Light"
                       cbf/notes           "Highly carbonated, very light-bodied, nearly flavorless lager designed to be consumed very cold. Very refreshing and thirst quenching."
                       cbf/og-max          1.04
                       cbf/color-min       2
                       cbf/abv-max         0.042
                       cbf/color-max       3
                       cbf/profile         "Aroma: Low to no malt aroma, although it can be perceived as grainy, sweet, or corn-like if present. Hop aroma is light to none, with a spicy or floral hop character if present. While a clean fermentation character is desirable, a light amount of yeast character (particularly a light apple fruitiness) is not a fault. Light DMS is not a fault. Appearance: Very pale straw to pale yellow color. White, frothy head seldom persists. Very clear. Flavor: Relatively neutral palate with a crisp and dry finish and a low to very low grainy or corn-like flavor that might be perceived as sweetness due to the low bitterness. Hop flavor ranges from none to low levels, and can have a floral, spicy, or herbal quality (although rarely strong enough to detect). Low to very low hop bitterness. Balance may vary from slightly malty to slightly bitter, but is relatively close to even. High levels of carbonation may accentuate the crispness of the dry finish. Clean lager fermentation character. Mouthfeel: Very light (sometimes watery) body. Very highly carbonated with slight carbonic bite on the tongue."
                       cbf/ibu-min         8}))


(def american-lager
  "A very pale, highly-carbonated, light-bodied, well-attenuated lager with a very neutral flavor profile and low bitterness.
   
   Served very cold, it can be a very refreshing and thirst quenching drink."
  (styles/build-style :american-lager
                      {cbf/category        "Standard American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.01
                       cbf/og-min          1.04
                       cbf/name            "American Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.042
                       cbf/fg-min          1.004
                       cbf/category-number "1"
                       cbf/carb-max        3.0
                       cbf/ibu-max         18
                       cbf/ingredients     "Two- or six-row barley with high percentage (up to 40%) of rice or corn as adjuncts."
                       cbf/examples        "Budweiser, Coors Original, Grain Belt Premium Lager, Miller High Life, Pabst Blue Ribbon, Special Export"
                       cbf/notes           "A very pale, highly-carbonated, light-bodied, well-attenuated lager with a very neutral flavor profile and low bitterness. Served very cold, it can be a very refreshing and thirst quenching drink."
                       cbf/og-max          1.05
                       cbf/color-min       2
                       cbf/abv-max         0.053
                       cbf/color-max       4
                       cbf/profile         "Aroma: Low to no malt aroma, although it can be perceived as grainy, sweet or corn-like if present. Hop aroma may range from none to a light, spicy or floral hop presence. While a clean fermentation character is desirable, a light amount of yeast character (particularly a light apple character) is not a fault. Light DMS is also not a fault. Appearance: Very pale straw to medium yellow color. White, frothy head seldom persists. Very clear. Flavor: Relatively neutral palate with a crisp and dry finish and a moderately-low to low grainy or corn-like flavor that might be perceived as sweetness due to the low bitterness. Hop flavor ranges from none to moderately-low levels, and can have a floral, spicy, or herbal quality (although often not strong enough to distinguish). Hop bitterness at low to medium-low level. Balance may vary from slightly malty to slightly bitter, but is relatively close to even. High levels of carbonation may accentuate the crispness of the dry finish. Clean lager fermentation character. Mouthfeel: Low to medium-low body. Very highly carbonated with slight carbonic bite on the tongue."
                       cbf/ibu-min         8}))


(def cream-ale
  "A clean, well-attenuated, flavorful American \"lawnmower\" beer. 
   
   Easily drinkable and refreshing, with more character than typical American lagers."
  (styles/build-style :cream-ale
                      {cbf/category        "Standard American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.012
                       cbf/og-min          1.042
                       cbf/name            "Cream Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.042
                       cbf/fg-min          1.006
                       cbf/category-number "1"
                       cbf/carb-max        3.0
                       cbf/ibu-max         20
                       cbf/ingredients     "American ingredients most commonly used. A grain bill of six-row malt, or a combination of six-row and North American two-row, is common. Adjuncts can include up to 20% maize in the mash, and up to 20% glucose or other sugars in the boil. Any variety of hops can be used for bittering and finishing."
                       cbf/examples        "Genesee Cream Ale, Liebotschaner Cream Ale, Little Kings Cream Ale, New Glarus Spotted Cow, Old Style, Sleeman Cream Ale"
                       cbf/notes           "A clean, well-attenuated, flavorful American \"lawnmower\" beer. Easily drinkable and refreshing, with more character than typical American lagers."
                       cbf/og-max          1.055
                       cbf/color-min       2.5
                       cbf/abv-max         0.056
                       cbf/color-max       5.0
                       cbf/profile         "Aroma: Medium-low to low malt notes, with a sweet, corn-like aroma. Low levels of DMS are allowable, but are not required. Hop aroma medium low to none, and can be of any variety although floral, spicy, or herbal notes are most common. Overall, a subtle aroma with neither hops nor malt dominating. Low fruity esters are optional. Appearance: Pale straw to moderate gold color, although usually on the pale side. Low to medium head with medium to high carbonation. Fair head retention. Brilliant, sparkling clarity. Flavor: Low to medium-low hop bitterness. Low to moderate maltiness and sweetness, varying with gravity and attenuation. Usually well-attenuated. Neither malt nor hops dominate the palate. A low to moderate corny flavor is commonly found, as is light DMS (optional). Finish can vary from somewhat dry to faintly sweet. Low fruity esters are optional. Low to medium-low hop flavor (any variety, but typically floral, spicy, or herbal). Mouthfeel: Generally light and crisp, although body can reach medium. Smooth mouthfeel with medium to high attenuation; higher attenuation levels can lend a \"thirst quenching\" quality. High carbonation."
                       cbf/ibu-min         8}))


(def american-wheat-beer
  "Refreshing wheat beers that can display more hop character and less yeast character than their German cousins. 
   
   A clean fermentation character allows bready, doughy, or grainy wheat flavors to be complemented by hop flavor and bitterness rather than yeast qualities."
  (styles/build-style :american-wheat-beer
                      {cbf/category        "Standard American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.013
                       cbf/og-min          1.04
                       cbf/name            "American Wheat Beer"
                       cbf/type            "Ale"
                       cbf/style-letter    "D"
                       cbf/abv-min         0.04
                       cbf/fg-min          1.008
                       cbf/category-number "1"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Clean American ale or lager yeast (German weissbier yeast is inappropriate). Large proportion of wheat malt (often 30-50%, which is lower than is typical in German weissbiers). American, German, or New World hops are typical."
                       cbf/examples        "Bell's Oberon, Boulevard Unfiltered Wheat Beer, Goose Island 312 Urban Wheat Ale, Widmer Hefeweizen"
                       cbf/notes           "Refreshing wheat beers that can display more hop character and less yeast character than their German cousins. A clean fermentation character allows bready, doughy, or grainy wheat flavors to be complemented by hop flavor and bitterness rather than yeast qualities."
                       cbf/og-max          1.055
                       cbf/color-min       3.0
                       cbf/abv-max         0.055
                       cbf/color-max       6.0
                       cbf/profile         "Aroma: Low to moderate grainy, bready, or doughy wheat character. A light to moderate malty sweetness is acceptable. Esters can be moderate to none, although should reflect relatively neutral yeast strains; banana is inappropriate. Hop aroma may be low to moderate, and can have a citrusy, spicy, floral, or fruity character. No clove phenols. Appearance: Usually pale yellow to gold. Clarity may range from brilliant to hazy with yeast approximating the German weissbier style of beer. Big, long-lasting white head. Flavor: Light to moderately-strong bready, doughy, or grainy wheat flavor, which can linger into the finish. May have a moderate malty sweetness or finish quite dry. Low to moderate hop bitterness, which sometimes lasts into the finish. Balance is usually even, but may be slightly bitter. Low to moderate hop flavor (citrusy, spicy, floral, or fruity). Esters can be moderate to none, but should not include banana. No clove phenols. May have a slightly crisp finish. Mouthfeel: Medium-light to medium body. Medium-high to high carbonation. Slight creaminess is optional; wheat beers sometimes have a soft, 'fluffy' impression."
                       cbf/ibu-min         15}))


(def standard-american-beer
  "2015 BJCP guidelines on Standard American Beers."
  (merge american-light-lager
         american-lager
         cream-ale
         american-wheat-beer))
