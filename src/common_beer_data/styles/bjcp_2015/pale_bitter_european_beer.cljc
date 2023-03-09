(ns common-beer-data.styles.bjcp-2015.pale-bitter-european-beer
  "2015 BJCP guidelines on Pale Bitter European Beers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def german-leichtbier
  "A pale, highly-attenuated, light-bodied German lager with lower alcohol and calories than normal-strength beers.
   
   Moderately bitter with noticeable malt and hop flavors, the beer is still interesting to drink."
  (styles/build-style :german-leichtbier
                      {cbf/category        "Pale Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.01
                       cbf/og-min          1.026
                       cbf/name            "German Leichtbier"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.024
                       cbf/fg-min          1.006
                       cbf/category-number "5"
                       cbf/carb-max        3.0
                       cbf/ibu-max         28
                       cbf/ingredients     "Similar to a German Pils or Helles, continental Pils malt, German lager yeast, Saazer-type hops."
                       cbf/examples        "Beck's Light, Bitburger Light, Mahr's Leicht, Paulaner Münchner Hell Leicht, Paulaner Premium Leicht"
                       cbf/notes           "A pale, highly-attenuated, light-bodied German lager with lower alcohol and calories than normal-strength beers. Moderately bitter with noticeable malt and hop flavors, the beer is still interesting to drink."
                       cbf/og-max          1.034
                       cbf/color-min       2.0
                       cbf/abv-max         0.036
                       cbf/color-max       5.0
                       cbf/profile         "Aroma: Low to medium hop aroma, with a spicy, herbal, or floral character. Low to medium-low grainy-sweet or slightly crackery malt aroma. Clean fermentation profile. Appearance: Straw to pale gold in color. Brilliant clarity. Moderate white head with average to below average persistence. Flavor: Low to medium grainy-sweet malt flavor initially. Medium hop bitterness. Low to medium hop flavor, with a spicy, herbal, or floral quality. Clean fermentation character, well-lagered. Dry finish with a light malty and hoppy aftertaste. Mouthfeel: Light to very light body. Medium to high carbonation. Smooth, well-attenuated."
                       cbf/ibu-min         15}))


(def kölsch
  "A clean, crisp, delicately-balanced beer usually with a very subtle fruit and hop character. 
   
   Subdued maltiness throughout leads into a pleasantly well-attenuated and refreshing finish. 
   Freshness makes a huge difference with this beer, as the delicate character can fade quickly with age. 
   Brilliant clarity is characteristic."
  (styles/build-style :kölsch
                      {cbf/category        "Pale Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.011
                       cbf/og-min          1.044
                       cbf/name            "Kölsch"
                       cbf/type            "Ale"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.044
                       cbf/fg-min          1.007
                       cbf/category-number "5"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Traditional German hops (Hallertau, Tettnang, Spalt or Hersbrucker). German Pils or pale malt. Attenuative, clean ale yeast. Up to 20% wheat malt may be used, but this is quite rare in authentic versions. Current commercial practice is to ferment warm, cold condition for a short period of time, and serve young."
                       cbf/examples        "Früh Kölsch, Gaffel Kölsch, Mühlen Kölsch, Reissdorf Kölsch, Sion Kölsch, Sünner Kölsch"
                       cbf/notes           "A clean, crisp, delicately-balanced beer usually with a very subtle fruit and hop character. Subdued maltiness throughout leads into a pleasantly well-attenuated and refreshing finish. Freshness makes a huge difference with this beer, as the delicate character can fade quickly with age. Brilliant clarity is characteristic."
                       cbf/og-max          1.05
                       cbf/color-min       3.5
                       cbf/abv-max         0.052
                       cbf/color-max       5.0
                       cbf/profile         "Aroma: Low to very low malt aroma, with a grainy-sweet character. A pleasant, subtle fruit aroma from fermentation (apple, cherry or pear) is acceptable, but not always present. A low floral, spicy or herbal hop aroma is optional but not out of style. Some yeast strains may give a slight winy or sulfury character (this characteristic is also optional, but not a fault). Overall, the intensity of aromatics is fairly subtle but generally balanced, clean, and fresh. Appearance: Very pale gold to light gold. Very clear (authentic commercial versions are filtered to a brilliant clarity). Has a delicate white head that may not persist. Flavor: Soft, rounded palate comprised of a delicate flavor balance between soft yet attenuated malt, an almost imperceptible fruity sweetness from fermentation, and a medium-low to medium bitterness with a delicate dryness and slight crispness in the finish (but no harsh aftertaste). The malt tends to be grainy-sweet, possibly with a very light bready or honey quality. The hop flavor is variable, and can range from low to moderately-high; most are medium-low to medium intensity and have a floral, spicy, or herbal character. May have a malty-sweet impression at the start, but this is not required. No noticeable residual sweetness. May have a slightly winy, minerally, or sulfury accent that accentuates the dryness and flavor balance. A slight wheat taste is rare but not a fault. Otherwise, very clean. Mouthfeel: Medium-light to medium body (most are medium-light). Medium to medium-high carbonation. Smooth and generally crisp and well-attenuated."
                       cbf/ibu-min         18}))


(def german-helles-exportbier
  "A pale, well-balanced, smooth German lager that is slightly stronger than the average beer with a moderate body and a mild, aromatic hop and malt character."
  (styles/build-style :german-helles-exportbier
                      {cbf/category        "Pale Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.015
                       cbf/og-min          1.048
                       cbf/name            "German Helles Exportbier"
                       cbf/type            "Lager"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.048
                       cbf/fg-min          1.01
                       cbf/category-number "5"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "Minerally water with high levels of sulfates, carbonates and chlorides, German or Czech noble hops, Pilsner malt, German lager yeast. Newer commercial versions can contain adjuncts and hop extract."
                       cbf/examples        "DAB Original, Dortmunder Kronen, Dortmunder Union Export, Flensburger Gold, Gordon Biersch Golden Export, Great Lakes Dortmunder Gold"
                       cbf/notes           "A pale, well-balanced, smooth German lager that is slightly stronger than the average beer with a moderate body and a mild, aromatic hop and malt character."
                       cbf/og-max          1.056
                       cbf/color-min       4.0
                       cbf/abv-max         0.06
                       cbf/color-max       7.0
                       cbf/profile         "Aroma: Low to medium hop aroma, typically floral, spicy, or herbal in character. Moderate grainy-sweet malt aroma. Clean fermentation profile. A slight sulfury note at the start that dissipates is not a fault, neither is a low background note of DMS. Appearance: Light gold to deep gold. Clear. Persistent white head. Flavor: Neither grainy-sweet malt nor floral, spicy, or herbal hops dominate, but both are in good balance with a touch of malty sweetness, providing a smooth yet crisply refreshing beer. Balance continues through the finish and the hop bitterness lingers in aftertaste (although some examples may finish slightly sweet). Clean fermentation character. Some mineral character might be noted from the water, although it usually does not come across as an overt minerally flavor. Mouthfeel: Medium body, medium carbonation. Smooth but crisp."
                       cbf/ibu-min         20}))


(def german-pils
  "A light-bodied, highly-attenuated, gold-colored, bottom-fermented bitter German beer showing excellent head retention and an elegant, floral hop aroma. 
   
   Crisp, clean, and refreshing, a German Pils showcases the finest quality German malt and hops."
  (styles/build-style :german-pils
                      {cbf/category        "Pale Bitter European Beer"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.013
                       cbf/og-min          1.044
                       cbf/name            "German Pils"
                       cbf/type            "Lager"
                       cbf/style-letter    "D"
                       cbf/abv-min         0.044
                       cbf/fg-min          1.008
                       cbf/category-number "5"
                       cbf/carb-max        3.0
                       cbf/ibu-max         40
                       cbf/ingredients     "Continental Pilsner malt, German hop varieties (especially Saazer-type varieties such as Tettnanger, Hallertauer, and Spalt for taste and aroma; Saaz is less common), German lager yeast."
                       cbf/examples        "König Pilsener, Left Hand Polestar Pils, Paulaner Premium Pils, Schönramer Pils, Stoudt Pils, Tröegs Sunshine Pils, Trumer Pils"
                       cbf/notes           "A light-bodied, highly-attenuated, gold-colored, bottom-fermented bitter German beer showing excellent head retention and an elegant, floral hop aroma. Crisp, clean, and refreshing, a German Pils showcases the finest quality German malt and hops."
                       cbf/og-max          1.05
                       cbf/color-min       2.0
                       cbf/abv-max         0.052
                       cbf/color-max       5.0
                       cbf/profile         "Aroma: Medium-low to low grainy-sweet-rich malt character (often with a light honey and slightly toasted cracker quality) and distinctive flowery, spicy, or herbal hops. Clean fermentation profile. May optionally have a very light sulfury note that comes from water as much as yeast. The hops are moderately-low to moderately-high, but should not totally dominate the malt presence. One-dimensional examples are inferior to the more complex qualities when all ingredients are sensed. May have a very low background note of DMS. Appearance: Straw to light gold, brilliant to very clear, with a creamy, long-lasting white head. Flavor: Medium to high hop bitterness dominates the palate and lingers into the aftertaste. Moderate to moderately-low grainy-sweet malt character supports the hop bitterness. Low to high floral, spicy, or herbal hop flavor. Clean fermentation profile. Dry to medium-dry, crisp, well-attenuated finish with a bitter aftertaste and light malt flavor. Examples made with water with higher sulfate levels often will have a low sulfury flavor that accentuates the dryness and lengthens the finish; this is acceptable but not mandatory. Some versions have a soft finish with more of a malt flavor, but still with noticeable hop bitterness and flavor, with the balance still towards bitterness. Mouthfeel: Medium-light body. Medium to high carbonation."
                       cbf/ibu-min         22}))


(def pale-bitter-european-beer
  "2015 BJCP guidelines on Pale Bitter European Beers."
  (merge german-leichtbier
         kölsch
         german-helles-exportbier
         german-pils))
