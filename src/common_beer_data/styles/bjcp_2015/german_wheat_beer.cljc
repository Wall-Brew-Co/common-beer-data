(ns common-beer-data.styles.bjcp-2015.german-wheat-beer
  "2015 BJCP guidelines on German Wheat Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def weissbier
  "A pale, refreshing German wheat beer with high carbonation, dry finish, a fluffy mouthfeel, and a distinctive banana-and-clove yeast character."
  (styles/build-style :weissbier
                      {cbf/category        "German Wheat Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.044
                       cbf/name            "Weissbier"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.043
                       cbf/fg-min          1.01
                       cbf/category-number "10"
                       cbf/carb-max        3.0
                       cbf/ibu-max         15
                       cbf/ingredients     "By German brewing tradition, at least 50% of the grist must be malted wheat, although some versions use up to 70%; the remainder is typically Pilsner malt. A decoction mash is traditional, although modern brewers typically don't follow this practice. Weizen ale yeast produces the typical spicy and fruity character, although high fermentation temperatures can affect the balance and produce off-flavors."
                       cbf/examples        "Ayinger Bräu Weisse, Hacker-Pschorr Weisse, Paulaner Hefe-Weizen Naturtrüb, Schneider Weisse Unser Original, Weihenstephaner Hefeweissbier"
                       cbf/notes           "A pale, refreshing German wheat beer with high carbonation, dry finish, a fluffy mouthfeel, and a distinctive banana-and-clove yeast character."
                       cbf/og-max          1.052
                       cbf/color-min       2.0
                       cbf/abv-max         0.056
                       cbf/color-max       6.0
                       cbf/profile         "Aroma: Moderate to strong phenols (usually clove) and fruity esters (typically banana). The balance and intensity of the phenol and ester components can vary but the best examples are reasonably balanced and fairly prominent. The hop character ranges from low to none. A light to moderate wheat aroma (which might be perceived as bready or grainy) may be present but other malt characteristics should not. Optional, but acceptable, aromatics can include a light to moderate vanilla character, and/or a faint bubblegum aroma. None of these optional characteristics should be high or dominant, but often can add to the complexity and balance. Appearance: Pale straw to gold in color. A very thick, moussy, long-lasting white head is characteristic. The high protein content of wheat impairs clarity in an unfiltered beer, although the level of haze is somewhat variable. Flavor: Low to moderately strong banana and clove flavor. The balance and intensity of the phenol and ester components can vary but the best examples are reasonably balanced and fairly prominent. Optionally, a very light to moderate vanilla character and/or faint bubblegum notes can accentuate the banana flavor, sweetness and roundness; neither should be dominant if present. The soft, somewhat bready or grainy flavor of wheat is complementary, as is a slightly grainy-sweet malt character. Hop flavor is very low to none, and hop bitterness is very low to moderately low. Well-rounded, flavorful palate with a relatively dry finish. The perception of sweetness is more due to the absence of hop bitterness than actual residual sweetness; a sweet or heavy finish would significantly impair drinkability. Mouthfeel: Medium-light to medium body; never heavy. Suspended yeast may increase the perception of body. The texture of wheat imparts the sensation of a fluffy, creamy fullness that may progress to a light, spritzy finish aided by high to very high carbonation. Always effervescent."
                       cbf/ibu-min         8}))


(def dunkles-weissbier
  "A moderately dark German wheat beer with a distinctive banana-and-clove yeast character, supported by a toasted bread or caramel malt flavor. 
    
    Highly carbonated and refreshing, with a creamy, fluffy texture and light finish that encourages drinking."
  (styles/build-style :dunkles-weissbier
                      {cbf/category        "German Wheat Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.044
                       cbf/name            "Dunkles Weissbier"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.043
                       cbf/fg-min          1.01
                       cbf/category-number "10"
                       cbf/carb-max        3.0
                       cbf/ibu-max         18
                       cbf/ingredients     "By German brewing tradition, at least 50% of the grist must be malted wheat, although some versions use up to 70%; the remainder is usually Munich, Vienna, or dark or caramel wheat malts, or Pilsner malt with color malt. A decoction mash is traditional, but infrequently used today. Weizen ale yeasts produce the typical spicy and fruity character, although extreme fermentation temperatures can affect the balance and produce off-flavors."
                       cbf/examples        "Ayinger Ur-Weisse, Ettaler Weissbier Dunkel, Franziskaner Hefe-Weisse Dunkel, Hacker-Pschorr Weisse Dark, Tucher Dunkles Hefe Weizen, Weihenstephaner Hefeweissbier Dunkel"
                       cbf/notes           "A moderately dark German wheat beer with a distinctive banana-and-clove yeast character, supported by a toasted bread or caramel malt flavor. Highly carbonated and refreshing, with a creamy, fluffy texture and light finish that encourages drinking."
                       cbf/og-max          1.056
                       cbf/color-min       14.0
                       cbf/abv-max         0.056
                       cbf/color-max       23.0
                       cbf/profile         "Aroma: Moderate phenols (usually clove) and fruity esters (usually banana). The balance and intensity of the phenol and ester components can vary but the best examples are reasonably balanced. Optionally, a low to moderate vanilla character and/or faint bubblegum notes may be present, but should not dominate. Hop aroma ranges from low to none, and may be lightly floral, spicy, or herbal. A light to moderate wheat aroma (which might be perceived as bready, doughy or grainy) may be present and is often accompanied by a caramel, bread crust, or richer malt aroma. The malt aroma may moderate the phenols and esters somewhat. Appearance: Light copper to mahogany brown in color. A very thick, moussy, long-lasting off-white head is characteristic. The high protein content of wheat impairs clarity in this traditionally unfiltered style, although the level of haze is somewhat variable. Suspended yeast sediment can contribute to cloudiness. Flavor: Low to moderately strong banana and clove flavor. The balance and intensity of the phenol and ester components can vary but the best examples are reasonably balanced and fairly prominent. Optionally, a very light to moderate vanilla character and/or faint bubblegum notes can accentuate the banana flavor, sweetness and roundness; neither should be dominant if present. The soft, somewhat bready, doughy, or grainy flavor of wheat is complementary, as is a richer caramel, toast, or bread crust flavor. The malty richness can be low to medium-high, and supports the yeast character. A roasted malt character is inappropriate. A spicy, herbal, or floral hop flavor is very low to none, and hop bitterness is very low to low. Well-rounded, flavorful, often somewhat malty palate with a relatively dry finish. Mouthfeel: Medium-light to medium-full body. The texture of wheat as well as yeast in suspension imparts the sensation of a fluffy, creamy fullness that may progress to a lighter finish, aided by moderate to high carbonation. Effervescent."
                       cbf/ibu-min         10}))


(def weizenbock
  "A strong, malty, fruity, wheat-based ale combining the best malt and yeast flavors of a weissbier (pale or dark) with the malty-rich flavor, strength, and body of a Dunkles Bock or Doppelbock."
  (styles/build-style :weizenbock
                      {cbf/category        "German Wheat Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.022
                       cbf/og-min          1.064
                       cbf/name            "Weizenbock"
                       cbf/type            "Lager"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.065
                       cbf/fg-min          1.015
                       cbf/category-number "10"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "A high percentage of malted wheat is used (by German brewing tradition must be at least 50%, although it may contain up to 70%), with the remainder being Munich- and/or Vienna-type barley malts in darker versions, and more Pils malt in paler versions. Some color malts may be used sparingly. A traditional decoction mash can give the appropriate body without cloying sweetness. Weizen ale yeasts produce the typical spicy and fruity character. Too warm or too cold fermentation will cause the phenols and esters to be out of balance and may create off-flavors. Hop choice is essentially irrelevant, but German varieties are most traditional."
                       cbf/examples        "Dark-Eisenbahn Weizenbock, Plank Bavarian Dunkler Weizenbock, Penn Weizenbock, Schneider Unser Aventinus; Pale -Plank Bavarian Heller Weizenbock, Weihenstephaner Vitus"
                       cbf/notes           "A strong, malty, fruity, wheat-based ale combining the best malt and yeast flavors of a weissbier (pale or dark) with the malty-rich flavor, strength, and body of a Dunkles Bock or Doppelbock."
                       cbf/og-max          1.09
                       cbf/color-min       6.0
                       cbf/abv-max         0.09
                       cbf/color-max       25.0
                       cbf/profile         "Aroma: Medium-high to high malty-rich character with a significant bready-grainy wheat component. Paler versions will have a bready-toasty malty richness, while darker versions will have a deeper, richer malt presence with significant Maillard products. The malt component is similar to a helles bock for pale versions (grainy-sweet-rich, lightly toasted) or a dunkles bock for dark versions (bready-malty-rich, highly toasted, optional caramel). The yeast contributes a typical weizen character of banana and spice (clove, vanilla), which can be medium-low to medium-high. Darker versions can have some dark fruit aroma (plums, prunes, grapes, raisins), particularly as they age. A low to moderate alcohol aroma is acceptable, but shouldn't be hot or solventy. No hop aroma. The malt, yeast, and alcohol intertwine to produce a complex, inviting, prominent bouquet. Appearance: Pale and dark versions exist, with pale versions being light gold to light amber, and dark versions being dark amber to dark ruby-brown in color. A very thick, moussy, long-lasting white to off-white (pale versions) or light tan (dark versions) head is characteristic. The high protein content of wheat impairs clarity in this traditionally unfiltered style, although the level of haze is somewhat variable. Suspended yeast sediment can contribute to the cloudiness. Flavor: Similar to the aroma, a medium-high to high malty-rich flavor together with a significant bready-grainy wheat flavor. Paler versions will have a bready, toasty, grainy-sweet malt richness, while darker versions will have deeper, bready-rich or toasted malt flavors with significant Maillard products, optional caramel. Low to moderate banana and spice (clove, vanilla) yeast character. Darker versions can have some dark fruit flavor (plums, prunes, grapes, raisins), particularly as they age. A light chocolate character (but not roast) is optional in darker versions. No hop flavor. A low hop bitterness can give a slightly sweet palate impression, but the beer typically finishes dry (sometimes enhanced by a light alcohol character). The interplay between the malt, yeast, and alcohol adds complexity and interest, which is often enhanced with age. Mouthfeel: Medium-full to full body. A fluffy or creamy texture is typical, as is the mild warming sensation of substantial alcohol content. Moderate to high carbonation."
                       cbf/ibu-min         15}))


(def german-wheat-beer
  "2015 BJCP guidelines on German Wheat Beers."
  (merge weissbier
         dunkles-weissbier
         weizenbock))
