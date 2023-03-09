(ns common-beer-data.styles.bjcp-2015.scottish-ale
  "2015 BJCP guidelines on Scottish Ales."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def scottish-light
  "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. 
   
   Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character. 
   Traditionally the darkest of the Scottish ales, sometimes nearly black but lacking any burnt, overtly roasted character."
  (styles/build-style :scottish-light
                      {cbf/category        "Scottish Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.013
                       cbf/og-min          1.03
                       cbf/name            "Scottish Light"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.025
                       cbf/fg-min          1.01
                       cbf/category-number "14"
                       cbf/carb-max        3.0
                       cbf/ibu-max         20
                       cbf/ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the 'roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                       cbf/examples        "McEwan's 60"
                       cbf/notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character. Traditionally the darkest of the Scottish ales, sometimes nearly black but lacking any burnt, overtly roasted character."
                       cbf/og-max          1.035
                       cbf/color-min       17.0
                       cbf/abv-max         0.032
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                       cbf/ibu-min         10}))


(def scottish-heavy
  "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. 
   
   Hops only to balance and support the malt. 
   The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
  (styles/build-style :scottish-heavy
                      {cbf/category        "Scottish Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.015
                       cbf/og-min          1.035
                       cbf/name            "Scottish Heavy"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.032
                       cbf/fg-min          1.01
                       cbf/category-number "14"
                       cbf/carb-max        3.0
                       cbf/ibu-max         20
                       cbf/ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the 'roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                       cbf/examples        "Broughton Greenmantle Ale, Caledonia Smooth, McEwan's 70, Orkney Raven Ale, Tennent's Special Ale"
                       cbf/notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
                       cbf/og-max          1.04
                       cbf/color-min       13.0
                       cbf/abv-max         0.039
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                       cbf/ibu-min         10}))


(def scottish-export
  "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. 
   
   Hops only to balance and support the malt. 
   The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
  (styles/build-style :scottish-export
                      {cbf/category        "Scottish Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.04
                       cbf/name            "Scottish Export"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.039
                       cbf/fg-min          1.01
                       cbf/category-number "14"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the 'roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                       cbf/examples        "Belhaven Scottish Ale, Broughton Exciseman's Ale, Orkney Dark Island, Pelican MacPelican's Scottish Style Ale, Weasel Boy Plaid Ferret Scottish Ale"
                       cbf/notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
                       cbf/og-max          1.06
                       cbf/color-min       13.0
                       cbf/abv-max         0.06
                       cbf/color-max       22.0
                       cbf/profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                       cbf/ibu-min         15}))


(def scottish-ale
  "2015 BJCP guidelines on Scottish Ales."
  (merge scottish-light
         scottish-heavy
         scottish-export))
