(ns common-beer-data.styles.bjcp-2015.amber-bitter-european-beer
  "2015 BJCP guidelines on Amber Bitter European Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def vienna-lager
  "A moderate-strength amber lager with a soft, smooth maltiness and moderate bitterness, yet finishing relatively dry. 
   
   The malt flavor is clean, bready-rich, and somewhat toasty, with an elegant impression derived from quality base malts and process, not specialty malts and adjuncts."
  (styles/build-style :vienna-lager
                      {cbf/category        "Amber Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.048
                       cbf/name            "Vienna Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.047
                       cbf/fg-min          1.01
                       cbf/category-number "7"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Vienna malt provides a lightly toasty and complex, Maillard-rich malt profile. As with Märzens, only the finest quality malt should be used, along with Continental hops (preferably Saazer types or Styrians). Can use some caramel malts and/or darker malts to add color and sweetness, but caramel malts shouldn't add significant aroma and flavor and dark malts shouldn't provide any roasted character."
                       cbf/examples        "Cuauhtémoc Noche Buena, Chuckanut Vienna Lager, Devils Backbone Vienna Lager, Figueroa Mountain Danish-style Red Lager, Heavy Seas Cutlass Amber Lager, Schell's Firebrick"
                       cbf/notes           "A moderate-strength amber lager with a soft, smooth maltiness and moderate bitterness, yet finishing relatively dry. The malt flavor is clean, bready-rich, and somewhat toasty, with an elegant impression derived from quality base malts and process, not specialty malts and adjuncts."
                       cbf/og-max          1.055
                       cbf/color-min       9.0
                       cbf/abv-max         0.055
                       cbf/color-max       15.0
                       cbf/profile         "Aroma: Moderately-intense malt aroma, with toasty and malty-rich aromatics. Clean lager character. Floral, spicy hop aroma may be low to none. A significant caramel or roasted aroma is inappropriate. Appearance: Light reddish amber to copper color. Bright clarity. Large, off-white, persistent head. Flavor: Soft, elegant malt complexity is in the forefront, with a firm enough hop bitterness to provide a balanced finish. The malt flavor tends towards a rich, toasty character, without significant caramel or roast flavors. Fairly dry, crisp finish, with both rich malt and hop bitterness present in the aftertaste. Floral, spicy hop flavor may be low to none. Clean lager fermentation character. Mouthfeel: Medium-light to medium body, with a gentle creaminess. Moderate carbonation. Smooth."
                       cbf/ibu-min         18}))


(def altbier
  "A well-balanced, well-attenuated, bitter yet malty, clean, and smooth, amber- to copper-colored German beer. 
   
   The bitterness is balanced by the malt richness, but the malt intensity and character can range from moderate to high (the bitterness increases with the malt richness)."
  (styles/build-style :altbier
                      {cbf/category        "Amber Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.044
                       cbf/name            "Altbier"
                       cbf/type            "Lager"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.043
                       cbf/fg-min          1.008
                       cbf/category-number "7"
                       cbf/carb-max        3.0
                       cbf/ibu-max         50
                       cbf/ingredients     "Grists vary, but usually consist of German base malts (usually Pils, sometimes Munich) with small amounts of crystal, chocolate, and/or black malts used to adjust color. Occasionally will include some wheat, including roasted wheat. Spalt hops are traditional, but other Saazer-type hops can also be used. Clean, highly attenuative ale yeast. A step mash or decoction mash program is traditional."
                       cbf/examples        "Bolten Alt, Diebels Alt, Füchschen Alt, Original Schlüssel Alt, Schlösser Alt, Schumacher Alt, Uerige Altbier"
                       cbf/notes           "A well-balanced, well-attenuated, bitter yet malty, clean, and smooth, amber- to copper-colored German beer. The bitterness is balanced by the malt richness, but the malt intensity and character can range from moderate to high (the bitterness increases with the malt richness)."
                       cbf/og-max          1.052
                       cbf/color-min       11.0
                       cbf/abv-max         0.055
                       cbf/color-max       17.0
                       cbf/profile         "Aroma: Clean yet robust and complex aroma of grainy-rich malt and spicy hops with restrained (low to medium-low) fruity esters. The malt character reflects German base malt varieties, with rich baked bread and nutty-toasty bread crust notes. The hop aroma may vary from moderate to low, and can have a peppery, spicy, floral, herbal or perfumy character associated with Saazer-type hops. Appearance: The color ranges from light amber to deep copper color, stopping short of brown; bronze-orange is most common. Brilliant clarity. Thick, creamy, long-lasting off-white head. Flavor: Assertive hop bitterness well balanced by a sturdy yet clean and crisp malt character. The malt presence is moderated by medium-high to high attenuation, but considerable rich, complex, and somewhat grainy malt flavors can remain. Some fruity esters (especially cherry-like) may survive the lagering period. A long-lasting, medium-dry to dry, bittersweet or nutty finish reflects both the hop bitterness and malt complexity. Spicy, peppery or floral hop flavor can be moderate to low. No roasted malt flavors or harshness. The apparent bitterness level is sometimes masked by the malt character; the bitterness can seem as low as moderate if the finish is not very dry. Light sulfury or minerally character optional. Mouthfeel: Medium-bodied. Smooth. Medium to medium-high carbonation, although can be lower when served from the cask. Astringency low to none. Despite being very full of flavor, is light-bodied enough to be consumed as a gravity-fed session beer in its home brewpubs in Düsseldorf."
                       cbf/ibu-min         25}))


(def kellerbier
  "A young, unfiltered, and unpasteurized beer that is between a Helles and Märzen in color, spicier in the hops with greater attenuation. 
   
   Interpretations range in color and balance, but remain in the drinkable 4.8% ABV neighborhood. 
   Balance ranges from the dry, spicy and pale-colored interpretations by St. Georgen and Löwenbräu of Buttenheim, to darker and maltier interpretations in the Fränkische Schweiz.
   This style is above all a method of producing simple drinkable beers for neighbors out of local ingredients to be served fresh. 
   Balance with a focus on drinkability and digestibility is important."
  (styles/build-style :kellerbier
                      {cbf/category        "Amber Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.048
                       cbf/name            "Kellerbier"
                       cbf/type            "Lager"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.048
                       cbf/fg-min          1.012
                       cbf/category-number "7"
                       cbf/carb-max        3.0
                       cbf/ibu-max         40
                       cbf/ingredients     "Grist varies, although traditional German versions emphasized Franconian pale and color malt. The notion of elegance is derived from the high-quality local ingredients, particularly the malts. Spalt or other typically spicy local hops are most common. Frugal Franconian brewers rarely used decoction brewing due to the cost of energy."
                       cbf/examples        "Eichhorn, Nederkeller, Hebendanz (bottled) Buttenheimer Kaiserdom Kellerbier, Kulmbacher Monchshof Kellerbier, Leikeim Kellerbier, Löwenbräu Kellerbier, Mahr's Kellerbier, St. Georgen Kellerbier, Tucher Kellerbier Naturtrub"
                       cbf/notes           "A young, unfiltered, and unpasteurized beer that is between a Helles and Märzen in color, spicier in the hops with greater attenuation. Interpretations range in color and balance, but remain in the drinkable 4.8% ABV neighborhood. Balance ranges from the dry, spicy and pale-colored interpretations by St. Georgen and Löwenbräu of Buttenheim, to darker and maltier interpretations in the Fränkische Schweiz. This style is above all a method of producing simple drinkable beers for neighbors out of local ingredients to be served fresh. Balance with a focus on drinkability and digestibility is important."
                       cbf/og-max          1.054
                       cbf/color-min       7.0
                       cbf/abv-max         0.054
                       cbf/color-max       17.0
                       cbf/profile         "Aroma: Moderate intensity of German malt, typically rich, bready, somewhat toasty, with light bread crust notes. Moderately-low to moderate spicy peppery hop aroma. Very low to low diacetyl, occasionally low to moderately-low sulfur and very low green apple or other yeast-derived notes. Caramel, biscuity, or roasted malt aroma is inappropriate. Appearance: Moderately cloudy to clear depending on age, but never extremely cloudy or murky. Gold to deep reddish-amber color. Off-white, creamy head. When served on cask, can have low carbonation and very low head. Flavor: Initial malt flavor may suggest sweetness, but finish is moderately dry to dry, and slightly bitter. Distinctive and complex maltiness often includes a bready-toasty aspect. Hop bitterness is moderate to moderately high, and spicy or herbal hop flavor is low to moderately high. Balance can be either on the malt or hop side, but the finish is not sweet. Noticeable caramel or roasted malt flavors are inappropriate. Very low to low diacetyl. Possible very low green apple or other yeast-derived notes. Smooth, malty aftertaste. Mouthfeel: Medium body, with a creamy texture and medium carbonation. Fully fermented, without a sweet or cloying impression."
                       cbf/ibu-min         25}))


(def amber-bitter-european-beer
  "2015 BJCP guidelines on Amber Bitter European Beers."
  (merge vienna-lager
         altbier
         kellerbier))
