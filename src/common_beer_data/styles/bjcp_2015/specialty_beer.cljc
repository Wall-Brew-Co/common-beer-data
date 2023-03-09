(ns common-beer-data.styles.bjcp-2015.specialty-beer
  "2015 BJCP guidelines on Specialty Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def clone-beer
  "Based on declared clone beer."
  (styles/build-style :clone-beer
                      {cbf/category        "Specialty Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.02
                       cbf/og-min          1.076
                       cbf/name            "Clone Beer"
                       cbf/type            "Mixed"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.07
                       cbf/fg-min          1.016
                       cbf/category-number "34"
                       cbf/carb-max        3.0
                       cbf/ibu-max         15
                       cbf/ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                       cbf/examples        "Founders Kentucky Breakfast Stout, Goose Island Bourbon County Stout, J.W. Lees Harvest Ale in Port, Sherry, Lagavulin Whisky or Calvados Casks, The Lost Abbey Angel's Share Ale; many microbreweries have specialty beers served only on premises often directly from the cask."
                       cbf/notes           "Based on declared clone beer."
                       cbf/og-max          1.12
                       cbf/color-min       4.0
                       cbf/abv-max         0.11
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Based on declared clone beer. Appearance: Based on declared clone beer. Flavor: Based on declared clone beer. Mouthfeel: Based on declared clone beer."
                       cbf/ibu-min         7}))


(def mixed-style-beer
  "Based on the declared base styles. 
   
   As with all Specialty-Type Beers, the resulting combination of beer styles needs to be harmonious and balanced, and be pleasant to drink."
  (styles/build-style :mixed-style-beer
                      {cbf/category        "Specialty Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.02
                       cbf/og-min          1.076
                       cbf/name            "Mixed-Style Beer"
                       cbf/type            "Mixed"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.07
                       cbf/fg-min          1.016
                       cbf/category-number "34"
                       cbf/carb-max        3.0
                       cbf/ibu-max         15
                       cbf/ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                       cbf/examples        "Founders Kentucky Breakfast Stout, Goose Island Bourbon County Stout, J.W. Lees Harvest Ale in Port, Sherry, Lagavulin Whisky or Calvados Casks, The Lost Abbey Angel's Share Ale; many microbreweries have specialty beers served only on premises often directly from the cask."
                       cbf/notes           "Based on the declared base styles. As with all Specialty-Type Beers, the resulting combination of beer styles needs to be harmonious and balanced, and be pleasant to drink."
                       cbf/og-max          1.12
                       cbf/color-min       4.0
                       cbf/abv-max         0.11
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Based on the declared base styles. Appearance: Based on the declared base styles. Flavor: Based on the declared base styles. Mouthfeel: Based on the declared base styles."
                       cbf/ibu-min         7}))


(def experimental-beer
  "Varies, but should be a unique experience."
  (styles/build-style :experimental-beer
                      {cbf/category        "Specialty Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.02
                       cbf/og-min          1.076
                       cbf/name            "Experimental Beer"
                       cbf/type            "Mixed"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.07
                       cbf/fg-min          1.016
                       cbf/category-number "34"
                       cbf/carb-max        3.0
                       cbf/ibu-max         15
                       cbf/ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                       cbf/examples        "None"
                       cbf/notes           "Varies, but should be a unique experience."
                       cbf/og-max          1.12
                       cbf/color-min       4.0
                       cbf/abv-max         0.11
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Varies. Appearance: Varies. Flavor: Varies. Mouthfeel: Varies."
                       cbf/ibu-min         7}))


(def specialty-beer
  "2015 BJCP guidelines on Specialty Beers."
  (merge clone-beer
         mixed-style-beer
         experimental-beer))
