(ns common-beer-data.styles.bjcp-2015.belgian-ale
  "2015 BJCP guidelines on Belgian Ales."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def witbier
  "A refreshing, elegant, tasty, moderate-strength wheat-based ale."
  (styles/build-style :witbier
                      {cbf/category        "Belgian Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.012
                       cbf/og-min          1.044
                       cbf/name            "Witbier"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.045
                       cbf/fg-min          1.008
                       cbf/category-number "24"
                       cbf/carb-max        3.0
                       cbf/ibu-max         20
                       cbf/ingredients     "About 50% unmalted wheat and 50% pale barley malt (usually Pils malt) constitute the grist. In some versions, up to 5-10% raw oats may be used. Spices of freshly-ground coriander and Curaçao or sometimes sweet orange peel complement the sweet aroma and are quite characteristic. Other spices (e.g., chamomile, cumin, cinnamon, Grains of Paradise) may be used for complexity but are much less prominent. Ale yeast prone to the production of mild, spicy flavors is very characteristic. In some instances a very limited lactic fermentation, or the actual addition of lactic acid, is done."
                       cbf/examples        "Allagash White, Blanche de Bruxelles, Celis White, Hoegaarden Wit, Ommegang Witte, St. Bernardus Witbier, Wittekerke"
                       cbf/notes           "A refreshing, elegant, tasty, moderate-strength wheat-based ale."
                       cbf/og-max          1.052
                       cbf/color-min       2.0
                       cbf/abv-max         0.055
                       cbf/color-max       4.0
                       cbf/profile         "Aroma: Moderate malty sweetness (often with light notes of honey and/or vanilla) with light, grainy, spicy wheat aromatics, often with a bit of tartness. Moderate perfumy coriander, often with a complex herbal, spicy, or peppery note in the background. Moderate zesty, citrusy-orangey fruitiness. A low spicy-herbal hop aroma is optional, but should never overpower the other characteristics. Vegetal, celery-like, or ham-like aromas are inappropriate. Spices should blend in with fruity, floral and sweet aromas and should not be overly strong. Appearance: Very pale straw to very light gold in color. The beer will be very cloudy from starch haze and/or yeast, which gives it a milky, whitish-yellow appearance. Dense, white, moussy head. Head retention should be quite good. Flavor: Pleasant malty-sweet grain flavor (often with a honey and/or vanilla character) and a zesty, orange-citrusy fruitiness. Refreshingly crisp with a dry, often tart, finish. Can have a low bready wheat flavor. Optionally has a very light lactic-tasting sourness. Herbal-spicy flavors, which may include coriander and other spices, are common should be subtle and balanced, not overpowering. A spicy-earthy hop flavor is low to none, and if noticeable, never gets in the way of the spices. Hop bitterness is low to medium-low, and doesn't interfere with refreshing flavors of fruit and spice, nor does it persist into the finish. Bitterness from orange pith should not be present. Vegetal, celery-like, ham-like, or soapy flavors are inappropriate. Mouthfeel: Medium-light to medium body, often having a smoothness and light creaminess from unmalted wheat and the occasional oats. Despite body and creaminess, finishes dry and often a bit tart. Effervescent character from high carbonation. Refreshing, from carbonation, light acidity, and lack of bitterness in finish. No harshness or astringency from orange pith. Should not be overly dry and thin, nor should it be thick and heavy."
                       cbf/ibu-min         8}))


(def belgian-pale-ale
  "A moderately malty, somewhat fruity, easy-drinking, copper-colored Belgian ale that is somewhat less aggressive in flavor profile than many other Belgian beers.
   
   The malt character tends to be a bit biscuity with light toasty, honey-like, or caramelly components; the fruit character is noticeable and complementary to the malt. 
   The bitterness level is generally moderate, but may not seem as high due to the flavorful malt profile."
  (styles/build-style :belgian-pale-ale
                      {cbf/category        "Belgian Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.048
                       cbf/name            "Belgian Pale Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.048
                       cbf/fg-min          1.01
                       cbf/category-number "24"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Pilsner or pale ale malt contributes the bulk of the grist with (cara) Vienna and Munich malts adding color, body and complexity. Sugar is not commonly used as high gravity is not desired. Saazer-type hops, Styrian Goldings, East Kent Goldings or Fuggles are commonly used. Yeasts prone to moderate production of phenols are often used but fermentation temperatures should be kept moderate to limit this character."
                       cbf/examples        "De Koninck, De Ryck Special, Palm Dobble, Palm Speciale"
                       cbf/notes           "A moderately malty, somewhat fruity, easy-drinking, copper-colored Belgian ale that is somewhat less aggressive in flavor profile than many other Belgian beers. The malt character tends to be a bit biscuity with light toasty, honey-like, or caramelly components; the fruit character is noticeable and complementary to the malt. The bitterness level is generally moderate, but may not seem as high due to the flavorful malt profile."
                       cbf/og-max          1.054
                       cbf/color-min       8.0
                       cbf/abv-max         0.055
                       cbf/color-max       14.0
                       cbf/profile         "Aroma: Moderate malt aroma, which can be a combination of toasty, biscuity, or nutty, possibly with a touch of light caramel or honey. Moderate to moderately high fruitiness with an orange- or pear-like character. Low to moderate strength hop character (spicy, herbal, or floral) optionally blended with background level peppery, spicy phenols. The hop character is lower in balance than the malt and fruitiness. Appearance: Amber to copper in color. Clarity is very good. Creamy, rocky, white head often fades more quickly than other Belgian beers. Flavor: Has an initial soft, smooth, moderately malty flavor with a variable profile of toasty, biscuity, nutty, light caramel and/or honey notes. Moderate to moderately high fruitiness, sometimes orange- or pear-like. Relatively light (medium-low to low) spicy, herbal, or floral hop character. The hop bitterness is medium-high to medium-low, and is optionally enhanced by low to very low amounts of peppery phenols. There is a dry to balanced finish, with hops becoming more pronounced in the aftertaste of those with a drier finish. Fairly well balanced overall, with no single component being high in intensity; malt and fruitiness are more forward initially with a supportive bitterness and drying character coming on late. Mouthfeel: Medium to medium-light body. Smooth palate. Alcohol level is restrained, and any warming character should be low if present. Medium to medium-high carbonation."
                       cbf/ibu-min         20}))


(def bière-de-garde
  "A fairly strong, malt-accentuated, lagered artisanal beer with a range of malt flavors appropriate for the color. 
   
   All are malty yet dry, with clean flavors and a smooth character."
  (styles/build-style :bière-de-garde
                      {cbf/category        "Belgian Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.06
                       cbf/name            "Bière de Garde"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.06
                       cbf/fg-min          1.008
                       cbf/category-number "24"
                       cbf/carb-max        3.0
                       cbf/ibu-max         28
                       cbf/ingredients     "The \"cellar\" character commonly described in literature is more of a feature of mishandled commercial exports than fresh, authentic products. The somewhat moldy character comes from the corks and/or oxidation in commercial versions, and is incorrectly identified as \"musty\" or \"cellar-like.\" Base malts vary by beer color, but usually include pale, Vienna and Munich types. Darker versions will have richer malt complexity and sweetness from crystal-type malts. Sugar may be used to add flavor and aid in the dry finish. Lager or ale yeast fermented at cool ale temperatures, followed by long cold conditioning. Floral, herbal or spicy continental hops."
                       cbf/examples        "Ch'Ti (brown and blond), Jenlain (amber and blond), La Choulette (all 3 versions), St. Amand (brown), Russian River Perdition"
                       cbf/notes           "A fairly strong, malt-accentuated, lagered artisanal beer with a range of malt flavors appropriate for the color. All are malty yet dry, with clean flavors and a smooth character."
                       cbf/og-max          1.08
                       cbf/color-min       6.0
                       cbf/abv-max         0.085
                       cbf/color-max       19.0
                       cbf/profile         "Aroma: Prominent malty sweetness, often with a complex, light to moderate intensity toasty-bready-rich malt character. Low to moderate esters. Little to no hop aroma (may be a bit spicy, peppery, or herbal). Paler versions will still be malty but will lack richer, deeper aromatics and may have a bit more hops. Generally quite clean, although stronger versions may have a light, spicy alcohol note as it warms. Appearance: Three main variations exist (blond, amber and brown), so color can range from golden-blonde to reddish-bronze to chestnut brown. Clarity is brilliant to fair, although haze is not unexpected in this type of often unfiltered beer. Well-formed head, generally white to off-white (varies by beer color), average persistence. Flavor: Medium to high malt flavor often with a toasty-rich, biscuity, toffee-like or light caramel-sweet character. Malt flavors and complexity tend to increase with beer color. Low to moderate esters and alcohol flavors. Medium-low hop bitterness provides some support, but the balance is always tilted toward the malt. Darker versions will have more of an initial malty-sweet impression than paler versions, but all should be malty in the palate and finish. The malt flavor lasts into the finish, which is medium-dry to dry, never cloying. Low to no hop flavor (spicy, peppery, or herbal), although paler versions can have slightly higher levels of herbal or spicy hop flavor (which can also come from the yeast). Smooth, well-lagered character, even if made with ale yeast. Aftertaste of malt (character appropriate for the color) with some dryness and light alcohol. Mouthfeel: Medium to medium-light (lean) body, often with a smooth, creamy-silky character. Moderate to high carbonation. Moderate alcohol warming, but should be very smooth and never hot."
                       cbf/ibu-min         18}))


(def belgian-ale
  "2015 BJCP guidelines on Belgian Ales."
  (merge witbier
         belgian-pale-ale
         bière-de-garde))
