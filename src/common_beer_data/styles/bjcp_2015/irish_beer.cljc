(ns common-beer-data.styles.bjcp-2015.irish-beer
  "2015 BJCP guidelines on Irish Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def irish-red-ale
  "An easy-drinking pint, often with subtle flavors. 
   
   Slightly malty in the balance sometimes with an initial soft toffee/caramel sweetness, a slightly grainy-biscuity palate, and a touch of roasted dryness in the finish. 
   Some versions can emphasize the caramel and sweetness more, while others will favor the grainy palate and roasted dryness."
  (styles/build-style :irish-red-ale
                      {cbf/category        "Irish Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.036
                       cbf/name            "Irish Red Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.038
                       cbf/fg-min          1.01
                       cbf/category-number "15"
                       cbf/carb-max        3.0
                       cbf/ibu-max         28
                       cbf/ingredients     "Generally has a bit of roasted barley or black malt to provide reddish color and dry roasted finish. Pale base malt. Caramel malts were historically imported and more expensive, so not all brewers would use them."
                       cbf/examples        "Caffrey's Irish Ale, Franciscan Well Rebel Red, Kilkenny Irish Beer, O'Hara's Irish Red Ale, Porterhouse Red Ale, Samuel Adams Irish Red, Smithwick's Irish Ale"
                       cbf/notes           "An easy-drinking pint, often with subtle flavors. Slightly malty in the balance sometimes with an initial soft toffee/caramel sweetness, a slightly grainy-biscuity palate, and a touch of roasted dryness in the finish. Some versions can emphasize the caramel and sweetness more, while others will favor the grainy palate and roasted dryness."
                       cbf/og-max          1.046
                       cbf/color-min       9.0
                       cbf/abv-max         0.05
                       cbf/color-max       14.0
                       cbf/profile         "Aroma: Low to moderate malt aroma, either neutral-grainy or with a lightly caramelly-toasty-toffee character. May have a very light buttery character (although this is not required). Hop aroma is low earthy or floral to none (usually not present). Quite clean. Appearance: Medium amber to medium reddish-copper color. Clear. Low off-white to tan colored head, average persistence. Flavor: Moderate to very little caramel malt flavor and sweetness, rarely with a light buttered toast or toffee-like quality. The palate often is fairly neutral and grainy, or can take on a lightly toasty or biscuity note as it finishes with a light taste of roasted grain, which lends a characteristic dryness to the finish. A light earthy or floral hop flavor is optional. Medium to medium-low hop bitterness. Medium-dry to dry finish. Clean and smooth. Little to no esters. The balance tends to be slightly towards the malt, although light use of roasted grains may increase the perception of bitterness slightly. Mouthfeel: Medium-light to medium body, although examples containing low levels of diacetyl may have a slightly slick mouthfeel (not required). Moderate carbonation. Smooth. Moderately attenuated."
                       cbf/ibu-min         18}))


(def irish-stout
  "A black beer with a pronounced roasted flavor, often similar to coffee. 
   
   The balance can range from fairly even to quite bitter, with the more balanced versions having a little malty sweetness and the bitter versions being quite dry. 
   Draught versions typically are creamy from a nitro pour, but bottled versions will not have this dispense-derived character. 
   The roasted flavor can be dry and coffee-like to somewhat chocolaty."
  (styles/build-style :irish-stout
                      {cbf/category        "Irish Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.011
                       cbf/og-min          1.036
                       cbf/name            "Irish Stout"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.04
                       cbf/fg-min          1.007
                       cbf/category-number "15"
                       cbf/carb-max        3.0
                       cbf/ibu-max         45
                       cbf/ingredients     "Guinness is made using roasted barley, flaked barley, and pale malt, but other breweries don't necessarily use roasted barley; they can use chocolate or other dark and specialty malts. Whatever combination of malts or grains is used, the resulting product should be black. Cork-type stouts are perhaps closer to historical London-type stouts in composition with a varied grist not dominated by roasted barley."
                       cbf/examples        "Beamish Irish Stout, Guinness Draught, Harpoon Boston Irish Stout, Murphy's Irish Stout, O'Hara's Irish Stout, Porterhouse Wrasslers 4X"
                       cbf/notes           "A black beer with a pronounced roasted flavor, often similar to coffee. The balance can range from fairly even to quite bitter, with the more balanced versions having a little malty sweetness and the bitter versions being quite dry. Draught versions typically are creamy from a nitro pour, but bottled versions will not have this dispense-derived character. The roasted flavor can be dry and coffee-like to somewhat chocolaty."
                       cbf/og-max          1.044
                       cbf/color-min       25.0
                       cbf/abv-max         0.045
                       cbf/color-max       40.0
                       cbf/profile         "Aroma: Moderate coffee-like aroma typically dominates; may have slight dark chocolate, cocoa and/or roasted grain secondary notes. Esters medium-low to none. Hop aroma low to none, may be lightly earthy or floral, but is typically absent. Appearance: Jet black to very deep brown with garnet highlights in color. According to Guinness, \"Guinness beer may appear black, but it is actually a very dark shade of ruby.\" Opaque. A thick, creamy, long-lasting, tan- to brown-colored head is characteristic when served on nitro, but don't expect the tight, creamy head on a bottled beer. Flavor: Moderate roasted grain or malt flavor with a medium to high hop bitterness. The finish can be dry and coffee-like to moderately balanced with a touch of caramel or malty sweetness. Typically has coffee-like flavors, but also may have a bittersweet or unsweetened chocolate character in the palate, lasting into the finish. Balancing factors may include some creaminess, medium-low to no fruitiness, and medium to no hop flavor (often earthy). The level of bitterness is somewhat variable, as is the roasted character and the dryness of the finish; allow for interpretation by brewers. Mouthfeel: Medium-light to medium-full body, with a somewhat creamy character (particularly when served with a nitro pour). Low to moderate carbonation. For the high hop bitterness and significant proportion of dark grains present, this beer is remarkably smooth. May have a light astringency from the roasted grains, although harshness is undesirable."
                       cbf/ibu-min         25}))


(def irish-extra-stout
  "A fuller-bodied black beer with a pronounced roasted flavor, often similar to coffee and dark chocolate with some malty complexity. 
   
   The balance can range from moderately bittersweet to bitter, with the more balanced versions having up to moderate malty richness and the bitter versions being quite dry."
  (styles/build-style :irish-extra-stout
                      {cbf/category        "Irish Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.052
                       cbf/name            "Irish Extra Stout"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.055
                       cbf/fg-min          1.01
                       cbf/category-number "15"
                       cbf/carb-max        3.0
                       cbf/ibu-max         50
                       cbf/ingredients     "Similar to Irish Stout."
                       cbf/examples        "Guinness Extra Stout (US version), O'Hara's Leann Folláin, Sheaf Stout"
                       cbf/notes           "A fuller-bodied black beer with a pronounced roasted flavor, often similar to coffee and dark chocolate with some malty complexity. The balance can range from moderately bittersweet to bitter, with the more balanced versions having up to moderate malty richness and the bitter versions being quite dry."
                       cbf/og-max          1.062
                       cbf/color-min       25.0
                       cbf/abv-max         0.065
                       cbf/color-max       40.0
                       cbf/profile         "Aroma: Moderate to moderately high coffee-like aroma, often with slight dark chocolate, cocoa, biscuit, vanilla and/or roasted grain secondary notes. Esters medium-low to none. Hop aroma low to none, may be lightly earthy or spicy, but is typically absent. Malt and roast dominate the aroma. Appearance: Jet black. Opaque. A thick, creamy, tan head is characteristic. Flavor: Moderate to moderately high dark-roasted grain or malt flavor with a medium to medium-high hop bitterness. The finish can be dry and coffee-like to moderately balanced with up to moderate caramel or malty sweetness. Typically has roasted coffee-like flavors, but also often has a dark chocolate character in the palate, lasting into the finish. Background mocha, biscuit, or vanilla flavors are often present and add complexity. Medium-low to no fruitiness. Medium to no hop flavor (often earthy or spicy). The level of bitterness is somewhat variable, as is the roasted character and the dryness of the finish; allow for interpretation by brewers. Mouthfeel: Medium-full to full body, with a somewhat creamy character. Moderate carbonation. Very smooth. May have a light astringency from the roasted grains, although harshness is undesirable. A slightly warming character may be detected."
                       cbf/ibu-min         35}))


(def irish-beer
  "2015 BJCP guidelines on Irish Beers."
  (merge irish-red-ale
         irish-stout
         irish-extra-stout))
