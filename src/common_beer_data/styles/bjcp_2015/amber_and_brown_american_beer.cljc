(ns common-beer-data.styles.bjcp-2015.amber-and-brown-american-beer
  "2015 BJCP guidelines on American Amber and Brown Beers"
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def american-amber-ale
  "An amber, hoppy, moderate-strength American craft beer with a caramel malty flavor.
   
   The balance can vary quite a bit, with some versions being fairly malty and others being aggressively hoppy.
   Hoppy and bitter versions should not have clashing flavors with the caramel malt profile."
  (styles/build-style :american-amber-ale
                      {cbf/category        "Amber And Brown American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.015
                       cbf/og-min          1.045
                       cbf/name            "American Amber Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.045
                       cbf/fg-min          1.01
                       cbf/category-number "19"
                       cbf/carb-max        3.0
                       cbf/ibu-max         40
                       cbf/ingredients     "Pale ale malt, typically North American two-row. Medium to dark crystal malts. May also contain specialty grains which add additional character and uniqueness. American or New World hops, often with citrusy flavors, are common but others may also be used."
                       cbf/examples        "Deschutes Cinder Cone Red, Full Sail Amber, Kona Lavaman Red Ale, North Coast Ruedrich's Red Seal Ale, Rogue American Amber Ale, Tröegs HopBack Amber Ale"
                       cbf/notes           "An amber, hoppy, moderate-strength American craft beer with a caramel malty flavor. The balance can vary quite a bit, with some versions being fairly malty and others being aggressively hoppy. Hoppy and bitter versions should not have clashing flavors with the caramel malt profile."
                       cbf/og-max          1.06
                       cbf/color-min       10.0
                       cbf/abv-max         0.062
                       cbf/color-max       17.0
                       cbf/profile         "Aroma: Low to moderate hop aroma with characteristics typical of American or New World hop varieties (citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, or melon). A citrusy hop character is common, but not required. Moderately-low to moderately-high maltiness (usually with a moderate caramel character), which can either support, balance, or sometimes mask the hop presentation. Esters vary from moderate to none. Appearance: Amber to coppery-brown in color. Moderately large off-white head with good retention. Generally quite clear, although dry-hopped versions may be slightly hazy. Flavor: Moderate to high hop flavor with characteristics typical of American or New World hop varieties (citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, or melon). A citrusy hop character is common, but not required. Malt flavors are moderate to strong, and usually show an initial malty sweetness followed by a moderate caramel flavor (and sometimes other character malts in lesser amounts). Malt and hop bitterness are usually balanced and mutually supportive, but can vary either way. Fruity esters can be moderate to none. Caramel sweetness and hop flavor/bitterness can linger somewhat into the medium to full finish. Mouthfeel: Medium to medium-full body. Medium to high carbonation. Overall smooth finish without astringency. Stronger versions may have a slight alcohol warmth."
                       cbf/ibu-min         25}))


(def california-common
  "A lightly fruity beer with firm, grainy maltiness, interesting toasty and caramel flavors, and showcasing rustic, traditional American hop characteristics."
  (styles/build-style :california-common
                      {cbf/category        "Amber And Brown American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.048
                       cbf/name            "California Common"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.045
                       cbf/fg-min          1.011
                       cbf/category-number "19"
                       cbf/carb-max        3.0
                       cbf/ibu-max         45
                       cbf/ingredients     "Pale ale malt, non-citrusy hops (often Northern Brewer), small amounts of toasted malt and/or crystal malts. Lager yeast; however, some strains (often with the mention of \"California\" in the name) work better than others at the warmer fermentation temperatures (55 to 60 °F) typically used. Note that some German yeast strains produce inappropriate sulfury character."
                       cbf/examples        "Anchor Steam, Flying Dog Old Scratch Amber Lager, Schlafly Pi Common, Steamworks Steam Engine Lager"
                       cbf/notes           "A lightly fruity beer with firm, grainy maltiness, interesting toasty and caramel flavors, and showcasing rustic, traditional American hop characteristics."
                       cbf/og-max          1.054
                       cbf/color-min       10.0
                       cbf/abv-max         0.055
                       cbf/color-max       14.0
                       cbf/profile         "Aroma: Typically showcases rustic, traditional American hops (often with woody, rustic or minty qualities) in moderate to high strength. Light fruitiness acceptable. Low to moderate caramel and/or toasty malt aromatics support the hops. Appearance: Medium amber to light copper color. Generally clear. Moderate off-white head with good retention. Flavor: Moderately malty with a pronounced hop bitterness. The malt character is usually toasty (not roasted) and caramelly. Low to moderately high hop flavor, usually showing rustic, traditional American hop qualities (often woody, rustic, minty). Finish fairly dry and crisp, with a lingering hop bitterness and a firm, grainy malt flavor. Light fruity esters are acceptable, but otherwise clean. Mouthfeel: Medium-bodied. Medium to medium-high carbonation."
                       cbf/ibu-min         30}))


(def american-brown-ale
  "A malty but hoppy beer frequently with chocolate and caramel flavors.
   
   The hop flavor and aroma complements and enhances the malt rather than clashing with it."
  (styles/build-style :american-brown-ale
                      {cbf/category        "Amber And Brown American Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.045
                       cbf/name            "American Brown Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.043
                       cbf/fg-min          1.01
                       cbf/category-number "19"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Well-modified pale malt, plus crystal and darker malts (typically chocolate). American hops are typical, but continental or New World hops can also be used."
                       cbf/examples        "Anchor Brekle's Brown, Big Sky Moose Drool Brown Ale, Brooklyn Brown Ale, Bell's Best Brown, Cigar City Maduro Brown Ale, Smuttynose Old Brown Dog Ale, Telluride Face Down Brown"
                       cbf/notes           "A malty but hoppy beer frequently with chocolate and caramel flavors. The hop flavor and aroma complements and enhances the malt rather than clashing with it."
                       cbf/og-max          1.06
                       cbf/color-min       18.0
                       cbf/abv-max         0.062
                       cbf/color-max       35.0
                       cbf/profile         "Aroma: Moderate malty-sweet to malty-rich aroma with chocolate, caramel, nutty, and/or toasty qualities. Hop aroma is typically low to moderate, of almost any variety that complements the malt. Some interpretations of the style may feature a stronger hop aroma, an American or New World hop character (citrusy, fruity, tropical, etc.), and/or a fresh dry-hopped aroma (all are optional). Fruity esters are moderate to very low. The dark malt character is more robust than other brown ales, yet stops short of being overly porter-like. The malt and hops are generally balanced. Appearance: Light to very dark brown color. Clear. Low to moderate off-white to light tan head. Flavor: Medium to moderately-high malty-sweet or malty-rich flavor with chocolate, caramel, nutty, and/or toasty malt complexity, with medium to medium-high bitterness. The medium to medium-dry finish provides an aftertaste having both malt and hops. Hop flavor can be light to moderate, and may optionally have a citrusy, fruity, or tropical character, although any hop flavor that complements the malt is acceptable. Very low to moderate fruity esters. Mouthfeel: Medium to medium-full body. More bitter versions may have a dry, resiny impression. Moderate to moderately-high carbonation."
                       cbf/ibu-min         20}))


(def amber-and-brown-american-beer
  "2015 BJCP guidelines on American Amber and Brown Beers"
  (merge american-amber-ale
         california-common
         american-brown-ale))
