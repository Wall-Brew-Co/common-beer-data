(ns common-beer-data.styles.bjcp-2015.strong-american-ale
  "2015 BJCP guidelines on Strong American Ales, and also an IPA."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def double-ipa
  "An intensely hoppy, fairly strong pale ale without the big, rich, complex maltiness and residual sweetness and body of an American barleywine. 
   
   Strongly hopped, but clean, dry, and lacking harshness. 
   Drinkability is an important characteristic; this should not be a heavy, sipping beer."
  (styles/build-style :double-ipa
                      {cbf/category        "Strong American Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.018
                       cbf/og-min          1.065
                       cbf/name            "Double IPA"
                       cbf/type            "Ale"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.075
                       cbf/fg-min          1.008
                       cbf/category-number "22"
                       cbf/carb-max        3.0
                       cbf/ibu-max         120
                       cbf/ingredients     "Clean 2-row malt is typical as a base grain; an excessively complex grist can be distracting. Crystal-type malts often muddy the hop flavors, and are generally considered undesirable in significant quantities. Sugar or other highly fermentable adjuncts are often used to increase attenuation, as are lower-temperature mash rests. Can use a complex variety of hops, typically American or New World, often with cutting-edge profiles providing distinctive differences. Modern hops with unusual characteristics are not out of style. American yeast that can give a clean or slightly fruity profile."
                       cbf/examples        "Avery Maharaja, Fat Heads Hop Juju, Firestone Walker Double Jack, Port Brewing Hop 15, Russian River Pliny the Elder, Stone Ruination IPA, Three Floyds Dreadnaught"
                       cbf/notes           "An intensely hoppy, fairly strong pale ale without the big, rich, complex maltiness and residual sweetness and body of an American barleywine. Strongly hopped, but clean, dry, and lacking harshness. Drinkability is an important characteristic; this should not be a heavy, sipping beer."
                       cbf/og-max          1.085
                       cbf/color-min       6.0
                       cbf/abv-max         0.1
                       cbf/color-max       14.0
                       cbf/profile         "Aroma: A prominent to intense hop aroma that typically showcases American or New World hop characteristics (citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, melon, etc.). Most versions are dry hopped and can have an additional resinous or grassy aroma, although this is not absolutely required. Some clean malty sweetness may be found in the background. Fruitiness, either from esters or hops, may also be detected in some versions, although a neutral fermentation character is typical. Some alcohol can usually be noted, but it should not have a \"hot\" character. Appearance: Color ranges from golden to light orange-copper; most modern versions are fairly pale. Good clarity, although unfiltered dry-hopped versions may be a bit hazy. Moderate-sized, persistent, white to off-white head. Flavor: Hop flavor is strong and complex, and can reflect the characteristics of modern American or New World hop varieties (citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, melon, etc.). High to absurdly high hop bitterness. Low to medium malt flavor, generally clean and grainy-malty although low levels of caramel or toasty flavors are acceptable. Low to medium fruitiness is acceptable but not required. A long, lingering bitterness is usually present in the aftertaste but should not be harsh. Dry to medium-dry finish; should not finish sweet or heavy. A light, clean, smooth alcohol flavor is not a fault. Oak is inappropriate in this style. May be slightly sulfury, but most examples do not exhibit this character. Mouthfeel: Medium-light to medium body, with a smooth texture. Medium to medium-high carbonation. No harsh hop-derived astringency. Restrained, smooth alcohol warming acceptable."
                       cbf/ibu-min         60}))


(def american-strong-ale
  "A strong, full-flavored American ale that challenges and rewards the palate with full malty and hoppy flavors and substantial bitterness. 
   
   The flavors are bold but complementary, and are stronger and richer than average-strength pale and amber American ales."
  (styles/build-style :american-strong-ale
                      {cbf/category        "Strong American Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.024
                       cbf/og-min          1.062
                       cbf/name            "American Strong Ale"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.063
                       cbf/fg-min          1.014
                       cbf/category-number "22"
                       cbf/carb-max        3.0
                       cbf/ibu-max         100
                       cbf/ingredients     "Well-modified pale malt as a base; some character malts would be appropriate, medium to dark crystal malts are typical. Citrusy or piney American hops are common, although any American or New World varieties can be used in quantity, provided they do not clash with the malt character. Generally uses an attenuative American yeast."
                       cbf/examples        "Bear Republic Red Rocket Ale, Great Lakes Nosferatu, Terrapin Big Hoppy Monster, Port Brewing Shark Attack Double Red, Stone Arrogant Bastard,"
                       cbf/notes           "A strong, full-flavored American ale that challenges and rewards the palate with full malty and hoppy flavors and substantial bitterness. The flavors are bold but complementary, and are stronger and richer than average-strength pale and amber American ales."
                       cbf/og-max          1.09
                       cbf/color-min       7.0
                       cbf/abv-max         0.1
                       cbf/color-max       19.0
                       cbf/profile         "Aroma: Medium to high hop aroma, most often presenting citrusy or resiny notes although characteristics associated with other American or New World varieties may be found (tropical, stone fruit, melon, etc.). Moderate to bold maltiness supports hop profile, with medium to dark caramel a common presence, bready or toasty possible and background notes of light roast and/or chocolate noticeable in some examples. Generally exhibits clean to moderately fruity ester profile. Moderate alcohol aromatics may be noticeable, but should not be hot, harsh, or solventy. Appearance: Medium amber to deep copper or light brown. Moderate-low to medium-sized off-white to light tan head; may have low head retention. Good clarity. Alcohol level and viscosity may present \"legs\" when glass is swirled. Flavor: Medium to high dextrinous malt with a full range of caramel, toffee, dark fruit flavors. Low to medium toasty, bready, or Maillard-rich malty flavors are optional, and can add complexity. Medium-high to high hop bitterness. The malt gives a medium to high sweet impression on the palate, although the finish may be slightly sweet to somewhat dry. Moderate to high hop flavor. Low to moderate fruity esters. The hop flavors are similar to the aroma (citrusy, resiny, tropical, stone fruit, melon, etc.). Alcohol presence may be noticeable, but sharp or solventy alcohol flavors are undesirable. Roasted malt flavors are allowable but should be a background note; burnt malt flavors are inappropriate. While strongly malty on the palate, the finish should seem bitter to bittersweet. Should not be syrupy and under-attenuated. The aftertaste typically has malt, hops, and alcohol noticeable. Mouthfeel: Medium to full body. An alcohol warmth may be present, but not be excessively hot. Any astringency present should be attributable to bold hop bitterness and should not be objectionable on the palate. Medium-low to medium carbonation."
                       cbf/ibu-min         50}))


(def american-barleywine
  "A well-hopped American interpretation of the richest and strongest of the English ales. 
   
   The hop character should be evident throughout, but does not have to be unbalanced. 
   The alcohol strength and hop bitterness often combine to leave a very long finish."
  (styles/build-style :american-barleywine
                      {cbf/category        "Strong American Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.03
                       cbf/og-min          1.08
                       cbf/name            "American Barleywine"
                       cbf/type            "Ale"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.08
                       cbf/fg-min          1.016
                       cbf/category-number "22"
                       cbf/carb-max        3.0
                       cbf/ibu-max         100
                       cbf/ingredients     "Well-modified pale malt should form the backbone of the grist. Some specialty or character malts may be used. Dark malts should be used with great restraint, if at all, as most of the color arises from a lengthy boil. New World hops are common, although any varieties can be used in quantity. Generally uses an attenuative American ale yeast."
                       cbf/examples        "Avery Hog Heaven Barleywine, Anchor Old Foghorn, Great Divide Old Ruffian, Rogue Old Crustacean, Sierra Nevada Bigfoot, Victory Old Horizontal"
                       cbf/notes           "A well-hopped American interpretation of the richest and strongest of the English ales. The hop character should be evident throughout, but does not have to be unbalanced. The alcohol strength and hop bitterness often combine to leave a very long finish."
                       cbf/og-max          1.12
                       cbf/color-min       10.0
                       cbf/abv-max         0.12
                       cbf/color-max       19.0
                       cbf/profile         "Aroma: Hop character moderate to assertive and often showcases citrusy, fruity, or resiny New World varieties (although other varieties, such as floral, earthy or spicy English varieties or a blend of varieties, may be used). Rich maltiness, with a character that may be sweet, caramelly, bready, or fairly neutral. Low to moderately-strong fruity esters and alcohol aromatics. However, the intensity of aromatics often subsides with age. Hops tend to be nearly equal to malt in the aroma, with alcohol and esters far behind. Appearance: Color may range from light amber to medium copper; may rarely be as dark as light brown. Often has ruby highlights. Moderately-low to large off-white to light tan head; may have low head retention. May be cloudy with chill haze at cooler temperatures, but generally clears to good to brilliant clarity as it warms. The color may appear to have great depth, as if viewed through a thick glass lens. High alcohol and viscosity may be visible in \"legs\" when beer is swirled in a glass. Flavor: Strong, rich malt flavor with a noticeable hop flavor and bitterness in the balance. Moderately-low to moderately-high malty sweetness on the palate, although the finish may be somewhat sweet to quite dry (depending on aging). Hop bitterness may range from moderately strong to aggressive. While strongly malty, the balance should always seem bitter. Moderate to high hop flavor (any variety, but often showing a range of New World hop characteristics). Low to moderate fruity esters. Noticeable alcohol presence, but well-integrated. Flavors will smooth out and decline over time, but any oxidized character should be muted (and generally be masked by the hop character). May have some bready or caramelly malt flavors, but these should not be high; roasted or burnt malt flavors are inappropriate. Mouthfeel: Full-bodied and chewy, with a velvety, luscious texture (although the body may decline with long conditioning). Alcohol warmth should be noticeable but smooth. Should not be syrupy and under-attenuated. Carbonation may be low to moderate, depending on age and conditioning."
                       cbf/ibu-min         50}))


(def wheatwine
  "A richly textured, high alcohol sipping beer with a significant grainy, bready flavor and sleek body. 
   
   The emphasis is first on the bready, wheaty flavors with interesting complexity from malt, hops, fruity yeast character and alcohol complexity."
  (styles/build-style :wheatwine
                      {cbf/category        "Strong American Ale"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.03
                       cbf/og-min          1.08
                       cbf/name            "Wheatwine"
                       cbf/type            "Ale"
                       cbf/style-letter    "D"
                       cbf/abv-min         0.08
                       cbf/fg-min          1.016
                       cbf/category-number "22"
                       cbf/carb-max        3.0
                       cbf/ibu-max         60
                       cbf/ingredients     "Typically brewed with a combination of American two-row and American wheat. Style commonly uses 50% or more wheat malt. Any variety of hops may be used. May be oak-aged."
                       cbf/examples        "Rubicon Winter Wheat Wine, Two Brothers Bare Trees Weiss Wine, Smuttynose Wheat Wine, Portsmouth Wheat Wine"
                       cbf/notes           "A richly textured, high alcohol sipping beer with a significant grainy, bready flavor and sleek body. The emphasis is first on the bready, wheaty flavors with interesting complexity from malt, hops, fruity yeast character and alcohol complexity."
                       cbf/og-max          1.12
                       cbf/color-min       8.0
                       cbf/abv-max         0.12
                       cbf/color-max       15.0
                       cbf/profile         "Aroma: Hop aroma is mild and can represent just about any late hop aromatic. Moderate to moderately-strong bready, wheaty malt character, often with additional malt complexity such as honey and caramel. A light, clean, alcohol aroma may noted. Low to medium fruity notes may be apparent. Very low levels of diacetyl are acceptable but not required. Weizen yeast character (banana/clove) is inappropriate. Appearance: Color ranges from gold to deep amber, often with garnet or ruby highlights. Low to medium off-white head. The head may have creamy texture, and good retention. Chill haze is allowable, but usually clears up as the beer gets warmer. High alcohol and viscosity may be visible in \"legs\" when beer is swirled in a glass. Flavor: Moderate to moderately-high wheaty malt flavor, dominant in the flavor balance over any hop character. Low to moderate bready, toasty, caramel, or honey malt notes are a welcome complexity note, although not required. Hop flavor is low to medium, and can reflect any variety. Moderate to moderately-high fruitiness, often with a dried-fruit character. Hop bitterness may range from low to moderate; balance therefore ranges from malty to evenly balanced. Should not be syrupy and under-attenuated. Some oxidative or vinous flavors may be present, as are light alcohol notes that are clean and smooth but complex. A complementary, supportive oak character is welcome, but not required. Mouthfeel: Medium-full to full bodied and chewy, often with a luscious, velvety texture. Low to moderate carbonation. Light to moderate smooth alcohol warming may also be present."
                       cbf/ibu-min         30}))


(def strong-american-ale
  "2015 BJCP guidelines on Strong American Ales, and also an IPA."
  (merge double-ipa
         american-strong-ale
         american-barleywine
         wheatwine))
