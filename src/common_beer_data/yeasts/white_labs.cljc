(ns common-beer-data.yeasts.white-labs
  "Data for yeasts cultivated by White Labs.

   https://www.whitelabs.com/product-landing?id=1"
  {:added "1.0"}
  (:require [common-beer-data.yeasts.yeasts :as yeasts]
            [common-beer-format.yeasts :as cbf]))


(def wlp001-california-ale
  "Very clean flavor, balance and stability.

   Accentuates hop flavor versatile - can be used to make any style ale."
  (yeasts/build-yeasts :wlp001-california-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP001 California Ale"
                        cbf/max-temperature 22.78
                        cbf/type            "Ale"
                        cbf/best-for        "American Style Ales, Ambers, Pale Ales, Brown Ale, Strong Ale"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Very clean flavor, balance and stability. Accentuates hop flavor versatile - can be used to make any style ale."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP001"}))


(def wlp002-english-ale
  "Classic ESB strain best for English style milds, bitters, porters and English style stouts.

   Leaves a clear beer with some residual sweetness."
  (yeasts/build-yeasts :wlp002-english-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP002 English Ale"
                        cbf/max-temperature 20.0
                        cbf/type            "Ale"
                        cbf/best-for        "English Pale Ale, ESB, India Pale Ale, Brown Ale, Porter, Sweet Stouts and Strong Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic ESB strain best for English style milds, bitters, porters and English style stouts. Leaves a clear beer with some residual sweetness."
                        cbf/flocculation    "Very High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP002"}))


(def wlp003-german-ale-ii
  "Strong sulfer component will reduce with aging.

   Clean flavor, but with more ester production than regular German Ale Yeast."
  (yeasts/build-yeasts :wlp003-german-ale-ii
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP003 German Ale II"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Kolsch, Alt and German Pale Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Strong sulfer component will reduce with aging. Clean flavor, but with more ester production than regular German Ale Yeast."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP003"}))


(def wlp004-irish-ale-yeast
  "Excellent for Irish Stouts.

   Produces slight hint of diacetyl balanced by a light fruitiness and a slightly dry crispness."
  (yeasts/build-yeasts :wlp004-irish-ale-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP004 Irish Ale Yeast"
                        cbf/max-temperature 20.0
                        cbf/type            "Ale"
                        cbf/best-for        "Irish Ales, Stouts, Porters, Browns, Reds and Pale Ale"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Excellent for Irish Stouts. Produces slight hint of diacetyl balanced by a light fruitiness and a slightly dry crispness."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP004"}))


(def wlp005-british-ale
  "This yeast has higher attenuation than the White Labs English Ale yeast strains.

   Produces a malty flavored beer."
  (yeasts/build-yeasts :wlp005-british-ale
                       {cbf/min-temperature 19.44
                        cbf/name            "WLP005 British Ale"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "Excellent for all English style ales including bitters, pale ale, porters and brown ale."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "This yeast has higher attenuation than the White Labs English Ale yeast strains. Produces a malty flavored beer."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP005"}))


(def wlp006-bedford-british-ale
  "High attenuation.

   Ferments dry with high flocculation.
   Distinctive ester profile.
   Good for most English ale styles."
  (yeasts/build-yeasts :wlp006-bedford-british-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP006 Bedford British Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "English style ales - bitter, pale, porter and brown ale"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "High attenuation. Ferments dry with high flocculation. Distinctive ester profile. Good for most English ale styles."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP006"}))


(def wlp007-dry-english-ale
  "Clean, highly flocculant, and highly attentive yeast.

   Similar to White labs English Ale yeast, but more attentive.
   Suitable for high gravity ales."
  (yeasts/build-yeasts :wlp007-dry-english-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP007 Dry English Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Pale Ales, Amber, ESB, Brown Ales, Strong Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, Highly flocculant, and highly attentive yeast. Similar to White labs English Ale yeast, but more attentive. Suitable for high gravity ales."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP007"}))


(def wlp008-east-coast-ale
  "White labs \"Brewer Patriot\" strain can be used to reproduce many of the American versions of classic beer styles.

   Very clean with low esters."
  (yeasts/build-yeasts :wlp008-east-coast-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP008 East Coast Ale"
                        cbf/max-temperature 22.78
                        cbf/type            "Ale"
                        cbf/best-for        "American Ales, Golden ales, Blonde Ale, Pale Ale and German Alt styles"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "White labs \"Brewer Patriot\" strain can be used to reproduce many of the American versions of classic beer styles. Very clean with low esters."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP008"}))


(def wlp009-australian-ale-yeast
  "White Labs entry for Australian Ales.

   Produces a clean, malty finish with pleasant ester character.
   Bready character.
   Can ferment clean at high temperatures."
  (yeasts/build-yeasts :wlp009-australian-ale-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP009 Australian Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Australian Ales, English Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "White Labs entry for Australian Ales. Produces a clean, malty finish with pleasant ester character. Bready character. Can ferment clean at high temperatures."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP009"}))


(def wlp011-european-ale
  "Malty, Northern European ale yeast.

   Low ester production, low sulfer, gives a clean profile.
   Low attenuation contributes to malty taste."
  (yeasts/build-yeasts :wlp011-european-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP011 European Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Alt, Kolsch, malty English Ales, Fruit beers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Malty, Northern European ale yeast. Low ester production, low sulfer, gives a clean profile. Low attenuation contributes to malty taste."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP011"}))


(def wlp013-london-ale
  "Dry, malty ale yeast.

   Produces a complex, oak flavored ester character.
   Hop bitterness comes through well."
  (yeasts/build-yeasts :wlp013-london-ale
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP013 London Ale"
                        cbf/max-temperature 21.67
                        cbf/type            "Ale"
                        cbf/best-for        "Classic British Pale Ales, Bitters and Stouts"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry, malty ale yeast. Produces a complex, oak flavored ester character. Hop bitterness comes through well."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP013"}))


(def wlp022-essex-ale-yeast
  "Flavorful British yeast with a drier finish than many ale yeasts.

   Bready and fruity in character.
   Well suited for top cropping (collecting).
   Does not flocculate as much as WLP005 or WLP002."
  (yeasts/build-yeasts :wlp022-essex-ale-yeast
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP022 Essex Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "British milds, pale ales, bitters, stouts."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Flavorful British yeast with a drier finish than many ale yeasts. Bready and fruity in character. Well suited for top cropping (collecting). Does not flocculate as much as WLP005 or WLP002."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP022"}))


(def wlp023-burton-ale
  "Burton-on-trent yeast produces a complex character.

   Flavors include apple, pear, and clover honey."
  (yeasts/build-yeasts :wlp023-burton-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP023 Burton Ale"
                        cbf/max-temperature 22.78
                        cbf/type            "Ale"
                        cbf/best-for        "All English styles including Pale Ale, IPA, Porter, Stout and Bitters."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Burton-on-trent yeast produces a complex character. Flavors include apple, pear, and clover honey."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP023"}))


(def wlp025-southwold-ale
  "From Suffolk county.

   Products complex fruity and citrus flavors.
   Slight sulfer production, but this will fade with aging."
  (yeasts/build-yeasts :wlp025-southwold-ale
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP025 Southwold Ale"
                        cbf/max-temperature 20.56
                        cbf/type            "Ale"
                        cbf/best-for        "British bitters and pale ales."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "From Suffolk county. Products complex fruity and citrus flavors. Slight sulfer production, but this will fade with aging."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP025"}))


(def wlp026-premium-bitter-ale
  "From Staffordshire England.

   Mild, but complex estery flavor.
   High attenuation - ferments strong and dry.
   Suitable for high gravity beers."
  (yeasts/build-yeasts :wlp026-premium-bitter-ale
                       {cbf/min-temperature 19.44
                        cbf/name            "WLP026 Premium Bitter Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "All English ales including bitters, milds, ESB, Porter, Stout and Barley Wine"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "From Staffordshire England. Mild, but complex estery flavor. High attenuation - ferments strong and dry. Suitable for high gravity beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP026"}))


(def wlp028-edinburgh-ale
  "Malty strong ale yeast. Reproduces complex, malty, flavorful schottish ales. Hop character comes through well."
  (yeasts/build-yeasts :wlp028-edinburgh-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP028 Edinburgh Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Strong Scottish style ales, ESB, Irish Reds"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Malty strong ale yeast. Reproduces complex, malty, flavorful schottish ales. Hop character comes through well."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP028"}))


(def wlp029-german-ale-kolsch
  "Great for light beers.

   Accentuates hop flavors.
   Slight sulfer flavor will fade with age and leave a clean, lager like ale."
  (yeasts/build-yeasts :wlp029-german-ale-kolsch
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP029 German Ale/Kolsch"
                        cbf/max-temperature 20.56
                        cbf/type            "Ale"
                        cbf/best-for        "Kolsch, Altbiers, Pale Ales, Blonde and Honey Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Great for light beers. Accentuates hop flavors. Slight sulfer flavor will fade with age and leave a clean, lager like ale."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP029"}))


(def wlp033-klassic-ale-yeast
  "Traditional English Ale style yeast.

   Produces ester character, and allows hop flavor through.
   Leaves a slightly sweet malt character in ales."
  (yeasts/build-yeasts :wlp033-klassic-ale-yeast
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP033 Klassic Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Bitters, milds, porters stouts and scottish ale styles."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Traditional English Ale style yeast. Produces ester character, and allows hop flavor through. Leaves a slightly sweet malt character in ales."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP033"}))


(def wlp036-dusseldorf-alt-yeast
  "Traditional alternative yeast from Dusseldorf, Germany.

   Produces clean, slightly sweet alt beers.
   Does not accentuate hop flavor like WLP029 does."
  (yeasts/build-yeasts :wlp036-dusseldorf-alt-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP036 Dusseldorf Alt Yeast"
                        cbf/max-temperature 20.56
                        cbf/type            "Ale"
                        cbf/best-for        "Alt biers, Dusseldorf Alts, German Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Traditional alternative yeast from Dusseldorf, Germany. Produces clean, slightly sweet alt beers. Does not accentuate hop flavor like WLP029 does."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP036"}))


(def wlp037-yorkshire-square-ale-yeast
  "This yeast produces a malty but well balanced profile.

   Expect toasty flavors with malt driven esters.
   Highly flocculent and a good choice for many English ales."
  (yeasts/build-yeasts :wlp037-yorkshire-square-ale-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP037 Yorkshire Square Ale Yeast"
                        cbf/max-temperature 20.56
                        cbf/type            "Ale"
                        cbf/best-for        "English pale ales, English brown ales and Mild ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "This yeast produces a malty but well balanced profile. Expect toasty flavors with malt driven esters. Highly flocculent and a good choice for many English ales."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP037"}))


(def wlp038-manchester-ale-yeast
  "Top fermenting strain that is good for top-cropping.

   Moderately flocculent with a clean, dry finish.
   Low ester profile for producing a balanced English ale."
  (yeasts/build-yeasts :wlp038-manchester-ale-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP038 Manchester Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "English style ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Top fermenting strain that is good for top-cropping. Moderately flocculent with a clean, dry finish. Low ester profile for producing a balanced English ale."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP038"}))


(def wlp039-nottingham-ale-yeast
  "British style of ale yeast with a very dry finish and high attenuation.

   Medium to low fruit and fusel alcohol production.
   Good top fermenting yeast for cropping."
  (yeasts/build-yeasts :wlp039-nottingham-ale-yeast
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP039 Nottingham Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "British ales, pale ales, ambers, porters and stouts."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "British style of ale yeast with a very dry finish and high attenuation. Medium to low fruit and fusel alcohol production. Good top fermenting yeast for cropping."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP039"}))


(def wlp041-pacific-ale
  "Popular yeast from the Pacific Northwest.

   Leaves a clear and malty profile.
   More fruity than WLP002.
   Suitable for many English and American styles."
  (yeasts/build-yeasts :wlp041-pacific-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP041 Pacific Ale"
                        cbf/max-temperature 20.0
                        cbf/type            "Ale"
                        cbf/best-for        "English & American ales including milds, bitters, IPA, porters and English stouts."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Popular yeast from the Pacific Northwest. Leaves a clear and malty profile. More fruity than WLP002. Suitable for many English and American styles."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP041"}))


(def wlp051-california-ale-v
  "Similar to White Labs California Ale Yeast, but slightly lower attenuation leaves a fuller bodied beer."
  (yeasts/build-yeasts :wlp051-california-ale-v
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP051 California Ale V"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "American style Pales, Ambers, Browns, IPAs, American Strong Ale"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Similar to White Labs California Ale Yeast, but slightly lower attenuation leaves a fuller bodied beer."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP051"}))


(def wlp060-american-ale-yeast-blend
  "A blend that celebrates WLP001 (California Ale Yeast's) clean, neutral fermentation.

   This strain is versatile and adds two other yeast strains that are also clean/neutral in flavor to add a bit of complexity - almost a lager like finish."
  (yeasts/build-yeasts :wlp060-american-ale-yeast-blend
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP060 American Ale Yeast Blend"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "American ales with clean finish"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "A blend that celebrates WLP001 (California Ale Yeast's) clean, neutral fermentation. This strain is versatile and adds two other yeast strains that are also clean/neutral in flavor to add a bit of complexity - almost a lager like finish."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP060"}))


(def wlp080-cream-ale-yeast-blend
  "A blend of ale and lager yeast strains that work together to create a clean, light American lager style ale.

   A pleasing estery aroma may be perceived.
   Hop flavors and bitterness are slightly subdued."
  (yeasts/build-yeasts :wlp080-cream-ale-yeast-blend
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP080 Cream Ale Yeast Blend"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Cream Ale, Hybrids"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "A blend of ale and lager yeast strains that work together to create a clean, light American lager style ale. A pleasing estery aroma may be perceived. Hop flavors and bitterness are slightly subdued."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP080"}))


(def wlp090-san-diego-super-yeast
  "A super clean, super-fast fermenting strain.

   A low ester-producing strain that results in a balanced, neutral flavor and aroma profile.
   Alcohol-tolerant and very versatile for a wide variety of styles.
   Similar to California Ale Yeast WLP001 but it generally ferments faster."
  (yeasts/build-yeasts :wlp090-san-diego-super-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP090 San Diego Super Yeast"
                        cbf/max-temperature 20.0
                        cbf/type            "Ale"
                        cbf/best-for        "IPAs, American ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "A super clean, super-fast fermenting strain. A low ester-producing strain that results in a balanced, neutral flavor and aroma profile. Alcohol-tolerant and very versatile for a wide variety of styles. Similar to California Ale Yeast WLP001 but it generally ferments faster."
                        cbf/flocculation    "Very High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP090"}))


(def wlp099-super-high-gravity-ale
  "Ferments up to 25% alcohol content.

   Flavor may vary greatly depending on beer alcohol.
   English like esters at low gravity, but will become more wine-like as alcohol exceeds 16% ABV.
   Refer to White Labs web page for tips on fermenting high gravity ales.
   Colloquially known as \"Turbo Yeast\"."
  (yeasts/build-yeasts :wlp099-super-high-gravity-ale
                       {cbf/min-temperature 20.56
                        cbf/name            "WLP099 Super High Gravity Ale"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "Very high gravity beers and barley wine up to 25% alcohol."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Ferments up to 25% alcohol content. Flavor may vary greatly depending on beer alcohol. English like esters at low gravity, but will become more wine-like as alcohol exceeds 16% ABV. Refer to White Labs web page for tips on fermenting high gravity ales."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP099"}))


(def wlp300-hefeweizen-ale
  "Produces the banana and clove nose traditionally associated with German Wheat beers.

   Also produces desired cloudy look."
  (yeasts/build-yeasts :wlp300-hefeweizen-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP300 Hefeweizen Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Wheat"
                        cbf/best-for        "German style wheat beers. Weiss, Weizen, Hefeweizen"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Produces the banana and clove nose traditionally associated with German Wheat beers. Also produces desired cloudy look."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP300"}))


(def wlp320-american-hefeweizen-ale
  "Produces a much smaller amount of clove and banana flavor than the German Hefeweizen White Labs yeast.

   Some sulfur, and creates desired cloudy look."
  (yeasts/build-yeasts :wlp320-american-hefeweizen-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP320 American Hefeweizen Ale"
                        cbf/max-temperature 20.56
                        cbf/type            "Wheat"
                        cbf/best-for        "Oregon style American Hefeweizen"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Produces a much smaller amount of clove and banana flavor than the German Hefeweizen White Labs yeast. Some sulfur, and creates desired cloudy look."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP320"}))


(def wlp351-bavarian-weizen-yeast
  "Former yeast lab W51 strain.

   Produces a classic German style wheat beer with moderately high, spicy, phenolic overtones reminiscent of cloves."
  (yeasts/build-yeasts :wlp351-bavarian-weizen-yeast
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP351 Bavarian Weizen Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Wheat"
                        cbf/best-for        "Bavarian Weizen and wheat beers."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Former yeast lab W51 strain. Produces a classic German style wheat beer with moderately high, spicy, phenolic overtones reminiscent of cloves."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP351"}))


(def wlp380-hefeweizen-iv-ale
  "Large clove and phenolic aroma, but with minimal banana flavor.

   Citrus and apricot notes.
   Crisp and drinkable, with some sulfur production."
  (yeasts/build-yeasts :wlp380-hefeweizen-iv-ale
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP380 Hefeweizen IV Ale"
                        cbf/max-temperature 21.11
                        cbf/type            "Wheat"
                        cbf/best-for        "German style Hefeweizen"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Large clove and phenolic aroma, but with minimal banana flavor. Citrus and apricot notes. Crisp and drinkable, with some sulfur production."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP380"}))


(def wlp400-belgian-wit-ale
  "Phenolic and tart.

   The original yeast used to produce Wit in Belgium."
  (yeasts/build-yeasts :wlp400-belgian-wit-ale
                       {cbf/min-temperature 19.44
                        cbf/name            "WLP400 Belgian Wit Ale"
                        cbf/max-temperature 23.33
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Wit"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Phenolic and tart. The original yeast used to produce Wit in Belgium."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP400"}))


(def wlp410-belgian-wit-ii
  "Less phenolic than WLP400 (Belgian Wit Ale) but more spicy.

   Leaves a little more sweetness and flocculation is higher than WLP400."
  (yeasts/build-yeasts :wlp410-belgian-wit-ii
                       {cbf/min-temperature 19.44
                        cbf/name            "WLP410 Belgian Wit II"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Wit, Spiced Ale, Wheat Ales and Specialty Beers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Less phenolic than WLP400 (Belgian Wit Ale) but more spicy. Leaves a little more sweetness and flocculation is higher than WLP400."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP410"}))


(def wlp500-trappist-ale
  "Distinctive fruitiness and plum characteristics.

   Excellent for high gravity beers."
  (yeasts/build-yeasts :wlp500-trappist-ale
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP500 Trappist Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Trappist Ale, Dubbel, Trippel, Belgian Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Distinctive fruitiness and plum characteristics. Excellent for high gravity beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP500"}))


(def wlp510-bastogne-belgian-ale
  "High gravity Trappist ale yeast.

   Creates a dry beer with a slightly acidic finish.
   Cleaner finish and slightly less spicy than WLP500 or WLP530."
  (yeasts/build-yeasts :wlp510-bastogne-belgian-ale
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP510 Bastogne Belgian Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "High gravity beers, Belgian ales, Dubbels, Trippels."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "High gravity Trappist ale yeast. Creates a dry beer with a slightly acidic finish. Cleaner finish and slightly less spicy than WLP500 or WLP530."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP510"}))


(def wlp515-antwerp-ale-yeast
  "Clean, almost lager like Belgian ale yeast.

   Good for Belgian pale and amber ales or with other Belgian yeasts in a blend.
   Biscuity, ale like aroma present.
   Hop flavors are accentuated.
   Slight sulfur during fermentation, and a lager like flavor profile."
  (yeasts/build-yeasts :wlp515-antwerp-ale-yeast
                       {cbf/min-temperature 19.44
                        cbf/name            "WLP515 Antwerp Ale Yeast"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian pale and amber ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, almost lager like Belgian ale yeast. Good for Belgian pale and amber ales or with other Belgian yeasts in a blend. Biscuity, ale like aroma present. Hop flavors are accentuated. Slight sulfur during fermentation, and a lager like flavor profile."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP515"}))


(def wlp530-abbey-ale
  "Used in two of six remaining Trappist breweries.

   Distinctive plum and fruitiness.
   Good for high gravity beers."
  (yeasts/build-yeasts :wlp530-abbey-ale
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP530 Abbey Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Trappist Ale, Spiced Ale, Trippel, Dubbel, Grand Cru"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Used in two of six remaining Trappist breweries. Distinctive plum and fruitiness. Good for high gravity beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP530"}))


(def wlp540-abbey-iv-ale-yeast
  "An authentic Trappist style ale yeast.

   Use for Belgian ales including abbey ales (dubbels, tripels).
   Fruit character is medium - between WLP500 (high) and WLP530 (low)."
  (yeasts/build-yeasts :wlp540-abbey-iv-ale-yeast
                       {cbf/min-temperature 18.89
                        cbf/name            "WLP540 Abbey IV Ale Yeast"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Trappist Belgian Ales, Dubbels, Tripels and Specialty ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "An authentic Trappist style ale yeast. Use for Belgian ales including abbey ales (dubbels, tripels). Fruit character is medium - between WLP500 (high) and WLP530 (low)."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP540"}))


(def wlp545-belgian-strong-ale-yeast
  "From the Ardennes region of Belgium, this classic strain produces moderate esters and spicy phenolic character.

   Results in a dry but balanced finish.
   Use for dark or strong abbey ales."
  (yeasts/build-yeasts :wlp545-belgian-strong-ale-yeast
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP545 Belgian Strong Ale Yeast"
                        cbf/max-temperature 22.78
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian dark strongs, Abbey ales and Christmas beers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "From the Ardennes region of Belgium, this classic strain produces moderate esters and spicy phenolic character. Results in a dry but balanced finish. Use for dark or strong abbey ales."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP545"}))


(def wlp550-belgian-ale
  "Phenolic and spicy flavors.

   Complex profile, with less fruitiness than White's Trappist Ale strain."
  (yeasts/build-yeasts :wlp550-belgian-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP550 Belgian Ale"
                        cbf/max-temperature 25.56
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Ales, Saisons, Belgian Reds, Belgian Browns, White beers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Phenolic and spicy flavors. Complex profile, with less fruitiness than White's Trappist Ale strain."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP550"}))


(def wlp565-belgian-saison-i-ale
  "Saison yeast from Wallonia.

   Earthy, spicy and peppery notes.
   Slightly sweet."
  (yeasts/build-yeasts :wlp565-belgian-saison-i-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP565 Belgian Saison I Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Saison Ale, Belgian Ale, Dubbel, Trippel"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Saison yeast from Wallonia. Earthy, spicy and peppery notes. Slightly sweet."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP565"}))


(def wlp566-belgian-saison-ii-yeast
  "Saison strain with a more fruity ester profile than WLP565 (Belgian Saison I Yeast).

   Moderately phenolic with a clove-like characteristic in finished beer flavor and aroma.
   Ferments quickly."
  (yeasts/build-yeasts :wlp566-belgian-saison-ii-yeast
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP566 Belgian Saison II Yeast"
                        cbf/max-temperature 25.56
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian or French Saison"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Saison strain with a more fruity ester profile than WLP565 (Belgian Saison I Yeast). Moderately phenolic with a clove-like characteristic in finished beer flavor and aroma. Ferments quickly."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP566"}))


(def wlp568-belgian-style-saison-ale-yeast-blend
  "This blend melds Belgian style ale and Saison strains.

   The strains work in harmony to create complex, fruity aromas and flavors.
   The blend of yeast strains encourages complete fermentation in a timely manner.
   Phenolic, spicy, earthy, and clove like flavor."
  (yeasts/build-yeasts :wlp568-belgian-style-saison-ale-yeast-blend
                       {cbf/min-temperature 21.11
                        cbf/name            "WLP568 Belgian Style Saison Ale Yeast Blend"
                        cbf/max-temperature 26.67
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian and French Saison"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "This blend melds Belgian style ale and Saison strains. The strains work in harmony to create complex, fruity aromas and flavors. The blend of yeast strains encourages complete fermentation in a timely manner. Phenolic, spicy, earthy, and clove like flavor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP568"}))


(def wlp570-belgian-golden-ale
  "Combination of fruitiness and phenolic characters dominate the profile.

   Some sulfur which will dissipate following fermentation."
  (yeasts/build-yeasts :wlp570-belgian-golden-ale
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP570 Belgian Golden Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Ales, Dubbel, Grand Cru, Belgian Holiday Ale"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Combination of fruitiness and phenolic characters dominate the profile. Some sulfur which will dissipate following fermentation."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP570"}))


(def wlp575-belgian-style-ale-yeast-blend
  "Blend of two trappist ale yeasts and one Belgian ale yeast.

   Creates a versatile blend to be used for Trappist and other Belgian style ales."
  (yeasts/build-yeasts :wlp575-belgian-style-ale-yeast-blend
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP575 Belgian Style Ale Yeast Blend"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Trappist and other Belgian ales."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Blend of two trappist ale yeasts and one Belgian ale yeast. Creates a versatile blend to be used for Trappist and other Belgian style ales."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP575"}))


(def wlp630-berliner-weisse-blend
  "A blend of a traditional German Weizen yeast and Lactobacillus to create a subtle, tart, drinkable beer.

   Can take several months to develop tart character.
   Perfect for traditional Berliner Weisse."
  (yeasts/build-yeasts :wlp630-berliner-weisse-blend
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP630 Berliner Weisse Blend"
                        cbf/max-temperature 22.22
                        cbf/type            "Wheat"
                        cbf/best-for        "Berliner Weisse"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "A blend of a traditional German Weizen yeast and Lactobacillus to create a subtle, tart, drinkable beer. Can take several months to develop tart character. Perfect for traditional Berliner Weisse."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP630"}))


(def wlp645-brettanomyces-claussenii
  "Low intensity Brett character.

   Originally isolated from strong English stock beer, in the early 20th century.
   The Brett flavors produced are more subtle than WLP650 and WLP653.
   More aroma than flavor contribution.
   Fruity, pineapple like aroma."
  (yeasts/build-yeasts :wlp645-brettanomyces-claussenii
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP645 Brettanomyces Claussenii"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Sour ales (in secondary)"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Low intensity Brett character. Originally isolated from strong English stock beer, in the early 20th century. The Brett flavors produced are more subtle than WLP650 and WLP653. More aroma than flavor contribution. Fruity, pineapple like aroma."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP645"}))


(def wlp650-brettanomyces-bruxellensis
  "Medium intensity Brett character.

   Classic strain used in secondary fermentation for Belgian style beers and lambics.
   One Trappist brewery uses this strain in secondary fermentation."
  (yeasts/build-yeasts :wlp650-brettanomyces-bruxellensis
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP650 Brettanomyces Bruxellensis"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian sour ales and lambics (in secondary)"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Medium intensity Brett character. Classic strain used in secondary fermentation for Belgian style beers and lambics. One Trappist brewery uses this strain in secondary fermentation."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP650"}))


(def wlp653-brettanomyces-lambicus
  "Use in secondary.

   High intensity Brett character.
   Defines the \"Brett character\": Horsey, smoky and spicy flavors.
   As the name suggests, this strain is found most often in Lambic style beers, which are spontaneously fermented beers."
  (yeasts/build-yeasts :wlp653-brettanomyces-lambicus
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP653 Brettanomyces Lambicus"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Lambics and Flanders/Sour Brown ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Use in secondary. High intensity Brett character. Defines the \"Brett character\": Horsey, smoky and spicy flavors. As the name suggests, this strain is found most often in Lambic style beers, which are spontaneously fermented beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP653"}))


(def wlp655-belgian-sour-mix-1
  "Note: Bacteria to use in secondary only.

   A unique blend perfect for Belgian style beers.
   Includes Brettanomyces, Saccharomyces, and the bacterial strains Lactobacillus and Pediococcus."
  (yeasts/build-yeasts :wlp655-belgian-sour-mix-1
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP655 Belgian Sour Mix 1"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian sour beers (in secondary)"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Note: Bacteria to use in secondary only. A unique blend perfect for Belgian style beers. Includes Brettanomyces, Saccharomyces, and the bacterial strains Lactobacillus and Pediococcus."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP655"}))


(def wlp670-american-farmhouse-blend
  "Inspired by local American brewers crafting semi-traditional Belgian-style ales.

   This blend creates a complex flavor profile with a moderate level of sourness.
   It consists of a traditional farmhouse yeast strain and Brettanomyces.
   Great yeast for farmhouse styles."
  (yeasts/build-yeasts :wlp670-american-farmhouse-blend
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP670 American Farmhouse Blend"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Saisons, Farmhouse Ales"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Inspired by local American brewers crafting semi- traditional Belgian-style ales. This blend creates a complex flavor profile with a moderate level of sourness. It consists of a traditional farmhouse yeast strain and Brettanomyces. Great yeast for farmhouse styles."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP670"}))


(def wlp675-malolactic-bacteria
  "Bacteria for use in secondary.

   Malolactic fermentation is the conversion of malic acid to lactic acid by bacteria from the lactic acid bacteria family.
   Lactic acid is less acidic than malic acid, which in turn decreases acidity and helps to soften."
  (yeasts/build-yeasts :wlp675-malolactic-bacteria
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP675 Malolactic Bacteria"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Primarily wine"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Bacteria for use in secondary. Malolactic fermentation is the conversion of malic acid to lactic acid by bacteria from the lactic acid bacteria family. Lactic acid is less acidic than malic acid, which in turn decreases acidity and helps to soften."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP675"}))


(def wlp677-lactobacillus-bacteria
  "Bacteria for use in secondary.

   This lactic acid bacteria produces moderate levels of acidity and sour flavors found in lambics, Berliner Weiss, sour brown ale and gueze."
  (yeasts/build-yeasts :wlp677-lactobacillus-bacteria
                       {cbf/min-temperature 18.33
                        cbf/name            "WLP677 Lactobacillus Bacteria"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Lambic, Berliner Weiss, Sour Brown and Gueze (secondary)"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Bacteria for use in secondary. This lactic acid bacteria produces moderate levels of acidity and sour flavors found in lambics, Berliner Weiss, sour brown ale and gueze."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP677"}))


(def wlp700-flor-sherry-yeast
  "This yeast develops a film (flor) on the surface of the wine.

   Creates green almond, granny smith and nougat characteristics found in sherry.
   Can also be used for Port, Madeira and other sweet styles.
   For use in secondary fermentation.
   Slow fermentor."
  (yeasts/build-yeasts :wlp700-flor-sherry-yeast
                       {cbf/min-temperature 21.11
                        cbf/name            "WLP700 Flor Sherry Yeast"
                        cbf/max-temperature 24.44
                        cbf/type            "Wine"
                        cbf/best-for        "Sherry wine yeast"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "This yeast develops a film (flor) on the surface of the wine. Creates green almond, granny smith and nougat characteristics found in sherry. Can also be used for Port, Madeira and other sweet styles. For use in secondary fermentation. Slow fermentor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP700"}))


(def wlp705-sake-yeast
  "For use in rice based fermentations.

   For sake, use this yeast in conjunction with Koji (to produce fermentable sugar).
   WLP705 produces full body sake character, and subtle fragrance.
   Alcohol tolerance to 16%."
  (yeasts/build-yeasts :wlp705-sake-yeast
                       {cbf/min-temperature 21.11
                        cbf/name            "WLP705 Sake Yeast"
                        cbf/max-temperature 24.44
                        cbf/type            "Wine"
                        cbf/best-for        "Sake wine yeast"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "For use in rice based fermentations. For sake, use this yeast in conjunction with Koji (to produce fermentable sugar). WLP705 produces full body sake character, and subtle fragrance. Alcohol tolerance to 16%."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP705"}))


(def wlp715-champagne-yeast
  "Can tolerate alcohol up to 17%.

   For Barley Wine or Meads."
  (yeasts/build-yeasts :wlp715-champagne-yeast
                       {cbf/min-temperature 21.11
                        cbf/name            "WLP715 Champagne Yeast"
                        cbf/max-temperature 23.89
                        cbf/type            "Champagne"
                        cbf/best-for        "Wine, Mead and Cider"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Can tolerate alcohol up to 17%. For Barley Wine or Meads."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP715"}))


(def wlp718-avize-wine-yeast
  "Champagne isolate used for complexity in whites.

   Contributes elegance, especially in barrel fermented Chardonnays.
   Alcohol tolerance to 15%."
  (yeasts/build-yeasts :wlp718-avize-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP718 Avize Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Chardonnay"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Champagne isolate used for complexity in whites. Contributes elegance, especially in barrel fermented Chardonnays. Alcohol tolerance to 15%."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP718"}))


(def wlp720-sweet-mead-wine
  "Lower attenuation than White Labs Champagne Yeast.

   Leaves some residual sweetness as well as fruity flavor.
   Alcohol concentration up to 15%."
  (yeasts/build-yeasts :wlp720-sweet-mead-wine
                       {cbf/min-temperature 21.11
                        cbf/name            "WLP720 Sweet Mead/Wine"
                        cbf/max-temperature 23.89
                        cbf/type            "Wine"
                        cbf/best-for        "Sweet Mead, Wine and Cider"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Lower attenuation than White Labs Champagne Yeast. Leaves some residual sweetness as well as fruity flavor. Alcohol concentration up to 15%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP720"}))


(def wlp727-steinberg-geisenheim-wine
  "German origin wine yeast.

   High fruit/ester production.
   Moderate fermentation characteristics and cold tolerant."
  (yeasts/build-yeasts :wlp727-steinberg-geisenheim-wine
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP727 Steinberg-Geisenheim Wine"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Riesling wines."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "German origin wine yeast. High fruit/ester production. Moderate fermentation characteristics and cold tolerant."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP727"}))


(def wlp730-chardonnay-white-wine-yeast
  "Dry wine yeast.

   Slight ester production, low sulfur dioxide production.
   Enhances varietal character.
   WLP730 is a good choice for all white and blush wines, including Chablis, Chenin Blanc, Semillon, and Sauvignon Blanc.
   Fermentation speed is moderate."
  (yeasts/build-yeasts :wlp730-chardonnay-white-wine-yeast
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP730 Chardonnay White Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Chardonnay Wine"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry wine yeast. Slight ester production, low sulfur dioxide production. Enhances varietal character. WLP730 is a good choice for all white and blush wines, including Chablis, Chenin Blanc, Semillon, and Sauvignon Blanc. Fermentation speed is moderate."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP730"}))


(def wlp735-french-white-wine-yeast
  "Classic yeast for white wine fermentation.

   Slow to moderate fermenter and foam producer.
   Gives an enhanced creamy texture.
   Alcohol Tolerance: 16%"
  (yeasts/build-yeasts :wlp735-french-white-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP735 French White Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "French white wines"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic yeast for white wine fermentation. Slow to moderate fermenter and foam producer. Gives an enhanced creamy texture. Alcohol Tolerance: 16%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP735"}))


(def wlp740-merlot-red-wine-yeast
  "Neutral, low fusel alcohol production.

   Will ferment to dryness.
   Vigorous fermenter.
   WLP740 is well suited for Merlot, Shiraz, Pinot Noir, Chardonnay, Cabernet, Sauvignon Blanc, and Semillon.
   Alcohol Tolerance: 18%"
  (yeasts/build-yeasts :wlp740-merlot-red-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP740 Merlot Red Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Merlot, Shiraz, Pinot Noir, Chardonnay, Cabernet, Sauvignon Blanc, and Semillon"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Neutral, low fusel alcohol production. Will ferment to dryness, alcohol tolerance to 18%. Vigorous fermenter. WLP740 is well suited for Merlot, Shiraz, Pinot Noir, Chardonnay, Cabernet, Sauvignon Blanc, and Semillon. Alcohol Tolerance: 18%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP740"}))


(def wlp749-assmanshausen-wine-yeast
  "German red wine yeast, which results in spicy, fruit aromas.

   Perfect for Pinot Noir and Zinfandel.
   Slow to moderate fermenter which is cold tolerant.
   Alcohol Tolerance: 16%"
  (yeasts/build-yeasts :wlp749-assmanshausen-wine-yeast
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP749 Assmanshausen Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Pinot Noir and Zinfandel"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "German red wine yeast, which results in spicy, fruit aromas. Perfect for Pinot Noir and Zinfandel. Slow to moderate fermenter which is cold tolerant. Alcohol Tolerance: 16%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP749"}))


(def wlp750-french-red-wine-yeast
  "Classic Bordeaux yeast for red wine fermentations.

   Moderate fermentation characteristics.
   Tolerates lower fermentation temperatures.
   Rich, smooth flavor profile.
   Alcohol Tolerance: 17%."
  (yeasts/build-yeasts :wlp750-french-red-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP750 French Red Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Bordeaux"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic Bordeaux yeast for red wine fermentations. Moderate fermentation characteristics. Tolerates lower fermentation temperatures. Rich, smooth flavor profile. Alcohol Tolerance: 17%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP750"}))


(def wlp760-cabernet-red-wine-yeast
  "High temperature tolerance.

   Moderate fermentation speed.
   Excellent for full-bodied red wines, ester production complements flavor.
   WLP760 is also suitable for Merlot, Chardonnay, Chianti, Chenin Blanc, and Sauvignon Blanc.
   Alcohol Tolerance: 16%"
  (yeasts/build-yeasts :wlp760-cabernet-red-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP760 Cabernet Red Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Merlot, Chardonnay, Chianti, Chenin Blanc, and Sauvignon Blanc"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "High temperature tolerance. Moderate fermentation speed. Excellent for full-bodied red wines, ester production complements flavor. WLP760 is also suitable for Merlot, Chardonnay, Chianti, Chenin Blanc, and Sauvignon Blanc. Alcohol Tolerance: 16%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP760"}))


(def wlp770-suremain-burgundy-wine-yeast
  "Emphasizes fruit aromas in barrel fermentations.

   High nutrient requirement to avoid volatile acidity production.
   Alcohol Tolerance: 16%."
  (yeasts/build-yeasts :wlp770-suremain-burgundy-wine-yeast
                       {cbf/min-temperature 15.56
                        cbf/name            "WLP770 Suremain Burgundy Wine Yeast"
                        cbf/max-temperature 32.22
                        cbf/type            "Wine"
                        cbf/best-for        "Burgundy"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Emphasizes fruit aromas in barrel fermentations. High nutrient requirement to avoid volatile acidity production. Alcohol Tolerance: 16%."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP770"}))


(def wlp775-english-cider-yeast
  "Classic Cider yeast.

   Ferments dry, but retains apple flavor.
   Some sulfer produced during fermentation will fade with age."
  (yeasts/build-yeasts :wlp775-english-cider-yeast
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP775 English Cider Yeast"
                        cbf/max-temperature 23.89
                        cbf/type            "Wine"
                        cbf/best-for        "Cider, Wine and High Gravity Beer"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic Cider yeast. Ferments dry, but retains apple flavor. Some sulfer produced during fermentation will fade with age."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP775"}))


(def wlp800-pilsner-lager
  "Classic pilsner strain from Czech Republic.

   Dry with a malty finish."
  (yeasts/build-yeasts :wlp800-pilsner-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP800 Pilsner Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "European Pilsners, Bohemian Pilsner"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic pilsner strain from Czech Republic. Dry with a malty finish."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP800"}))


(def wlp802-czech-budejovice-lager
  "Dry and crisp with low diacetyl production.

   From Southern Czech Republic."
  (yeasts/build-yeasts :wlp802-czech-budejovice-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP802 Czech Budejovice Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian Style Pilsner"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry and crisp with low diacetyl production. From Southern Czech Republic."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP802"}))


(def wlp810-san-francisco-lager
  "Produces \"California Common\" style beer."
  (yeasts/build-yeasts :wlp810-san-francisco-lager
                       {cbf/min-temperature 14.44
                        cbf/name            "WLP810 San Francisco Lager"
                        cbf/max-temperature 18.33
                        cbf/type            "Lager"
                        cbf/best-for        "California and Premium Lagers, all American Lagers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Produces \"California Common\" style beer."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP810"}))


(def wlp815-belgian-lager-yeast
  "Clean, crisp European lager yeast with low sulfur production.

   The strain originates from a very old brewery in West Belgium.
   Great for European style pilsners, dark lagers, Vienna lager, and American style lagers."
  (yeasts/build-yeasts :wlp815-belgian-lager-yeast
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP815 Belgian Lager Yeast"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "European style pilsners, dark lagers, Vienna lager, and American style lagers"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, crisp European lager yeast with low sulfur production. The strain originates from a very old brewery in West Belgium. Great for European style pilsners, dark lagers, Vienna lager, and American style lagers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP815"}))


(def wlp820-octoberfest-marzen-lager
  "Produces a malty, bock style beer.

   Does not finish as dry or as fast as White's German Lager yeast.
   Longer lagering or starter recommended."
  (yeasts/build-yeasts :wlp820-octoberfest-marzen-lager
                       {cbf/min-temperature 11.11
                        cbf/name            "WLP820 Octoberfest/Marzen Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Marzen, Oktoberfest, European Lagers, Bocks, Munich Helles"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Produces a malty, bock style beer. Does not finish as dry or as fast as White's German Lager yeast. Longer lagering or starter recommended."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP820"}))


(def wlp830-german-lager
  "Very malty and clean.

   One of the world's most popular lager yeasts."
  (yeasts/build-yeasts :wlp830-german-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP830 German Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "German Marzen, Pilsner, Lagers, Oktoberfest beers."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Very malty and clean. One of the world's most popular lager yeasts."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP830"}))


(def wlp833-german-bock-lager
  "Produces beer that has balanced malt and hop character.

   From Southern Bavaria."
  (yeasts/build-yeasts :wlp833-german-bock-lager
                       {cbf/min-temperature 8.89
                        cbf/name            "WLP833 German Bock Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "Bocks, Doppelbocks, Oktoberfest, Vienna, Helles, some American Pilsners"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Produces beer that has balanced malt and hop character. From Southern Bavaria."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP833"}))


(def wlp838-southern-german-lager
  "Malty finish and balanced aroma.

   Strong fermenter, slight sulfur and low diacetyl."
  (yeasts/build-yeasts :wlp838-southern-german-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP838 Southern German Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "German Pilsner, Helles, Oktoberfest, Marzen, Bocks"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Malty finish and balanced aroma. Strong fermenter, slight sulfur and low diacetyl."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP838"}))


(def wlp840-american-lager-yeast
  "Dry and clean with very slight apple fruitiness.

   Minimal sulfer and diacetyl."
  (yeasts/build-yeasts :wlp840-american-lager-yeast
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP840 American Lager Yeast"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "All American Style Lagers -- both light and dark."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry and clean with very slight apple fruitiness. Minimal sulfer and diacetyl."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP840"}))


(def wlp860-munich-helles
  "Possible Augustiner Strain.

   This yeast helps to produce a malty, but balanced traditional Munich-style lager.
   Clean and strong fermenter, it's great for a variety of lager styles ranging from Helles to Rauchbier."
  (yeasts/build-yeasts :wlp860-munich-helles
                       {cbf/min-temperature 8.89
                        cbf/name            "WLP860 Munich Helles"
                        cbf/max-temperature 11.11
                        cbf/type            "Ale"
                        cbf/best-for        "Munich Helles, Oktoberfest"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Possible Augustiner Strain. This yeast helps to produce a malty, but balanced traditional Munich-style lager. Clean and strong fermenter, it's great for a variety of lager styles ranging from Helles to Rauchbier."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP860"}))


(def wlp862-cry-havoc
  "Licensed by White Labs from Charlie Papazian, author of \"The Complete Joy of Home Brewing\".

   This yeast was used to brew many of his original recipes.
   Diverse strain can ferment at ale and lager temps."
  (yeasts/build-yeasts :wlp862-cry-havoc
                       {cbf/min-temperature 20.0
                        cbf/name            "WLP862 Cry Havoc"
                        cbf/max-temperature 23.33
                        cbf/type            "Lager"
                        cbf/best-for        "All American Style Lagers -- both light and dark."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Licensed by White Labs from Charlie Papazian, author of \"The Complete Joy of Home Brewing\". This yeast was used to brew many of his original recipes. Diverse strain can ferment at ale and lager temps."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP862"}))


(def wlp885-zurich-lager
  "Swiss style lager yeast.

   Sulfer and diacetyl production is minimal.
   May be used for high gravity lagers with proper care."
  (yeasts/build-yeasts :wlp885-zurich-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP885 Zurich Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "Swiss style lager, and high gravity lagers (over 11% ABV)"
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Swiss style lager yeast. Sulfer and diacetyl production is minimal. May be used for high gravity lagers with proper care."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP885"}))


(def wlp920-old-bavarian-lager
  "Southern Germany/Bavarian lager yeast.

   Finishes malty with a slight ester profile."
  (yeasts/build-yeasts :wlp920-old-bavarian-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP920 Old Bavarian Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "Oktoberfest, Marzen, Bock and Dark Lagers."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "Southern Germany/Bavarian lager yeast. Finishes malty with a slight ester profile."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP920"}))


(def wlp940-mexican-lager
  "From Mexico City - produces a clean lager beer with a crisp finish.

   Good for mexican style beers."
  (yeasts/build-yeasts :wlp940-mexican-lager
                       {cbf/min-temperature 10.0
                        cbf/name            "WLP940 Mexican Lager"
                        cbf/max-temperature 12.78
                        cbf/type            "Lager"
                        cbf/best-for        "Mexican style light and dark lagers."
                        cbf/laboratory      "White Labs"
                        cbf/attenuation     0.765
                        cbf/notes           "From Mexico City - produces a clean lager beer with a crisp finish. Good for mexican style beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "WLP940"}))


(def white-labs
  "Data for yeasts cultivated by White Labs.

   https://www.whitelabs.com/product-landing?id=1"
  (merge wlp001-california-ale
         wlp002-english-ale
         wlp003-german-ale-ii
         wlp004-irish-ale-yeast
         wlp005-british-ale
         wlp006-bedford-british-ale
         wlp007-dry-english-ale
         wlp008-east-coast-ale
         wlp009-australian-ale-yeast
         wlp011-european-ale
         wlp013-london-ale
         wlp022-essex-ale-yeast
         wlp023-burton-ale
         wlp025-southwold-ale
         wlp026-premium-bitter-ale
         wlp028-edinburgh-ale
         wlp029-german-ale-kolsch
         wlp033-klassic-ale-yeast
         wlp036-dusseldorf-alt-yeast
         wlp037-yorkshire-square-ale-yeast
         wlp038-manchester-ale-yeast
         wlp039-nottingham-ale-yeast
         wlp041-pacific-ale
         wlp051-california-ale-v
         wlp060-american-ale-yeast-blend
         wlp080-cream-ale-yeast-blend
         wlp090-san-diego-super-yeast
         wlp099-super-high-gravity-ale
         wlp300-hefeweizen-ale
         wlp320-american-hefeweizen-ale
         wlp351-bavarian-weizen-yeast
         wlp380-hefeweizen-iv-ale
         wlp400-belgian-wit-ale
         wlp410-belgian-wit-ii
         wlp500-trappist-ale
         wlp510-bastogne-belgian-ale
         wlp515-antwerp-ale-yeast
         wlp530-abbey-ale
         wlp540-abbey-iv-ale-yeast
         wlp545-belgian-strong-ale-yeast
         wlp550-belgian-ale
         wlp565-belgian-saison-i-ale
         wlp566-belgian-saison-ii-yeast
         wlp568-belgian-style-saison-ale-yeast-blend
         wlp570-belgian-golden-ale
         wlp575-belgian-style-ale-yeast-blend
         wlp630-berliner-weisse-blend
         wlp645-brettanomyces-claussenii
         wlp650-brettanomyces-bruxellensis
         wlp653-brettanomyces-lambicus
         wlp655-belgian-sour-mix-1
         wlp670-american-farmhouse-blend
         wlp675-malolactic-bacteria
         wlp677-lactobacillus-bacteria
         wlp700-flor-sherry-yeast
         wlp705-sake-yeast
         wlp715-champagne-yeast
         wlp718-avize-wine-yeast
         wlp720-sweet-mead-wine
         wlp727-steinberg-geisenheim-wine
         wlp730-chardonnay-white-wine-yeast
         wlp735-french-white-wine-yeast
         wlp740-merlot-red-wine-yeast
         wlp749-assmanshausen-wine-yeast
         wlp750-french-red-wine-yeast
         wlp760-cabernet-red-wine-yeast
         wlp770-suremain-burgundy-wine-yeast
         wlp775-english-cider-yeast
         wlp800-pilsner-lager
         wlp802-czech-budejovice-lager
         wlp810-san-francisco-lager
         wlp815-belgian-lager-yeast
         wlp820-octoberfest-marzen-lager
         wlp830-german-lager
         wlp833-german-bock-lager
         wlp838-southern-german-lager
         wlp840-american-lager-yeast
         wlp860-munich-helles
         wlp862-cry-havoc
         wlp885-zurich-lager
         wlp920-old-bavarian-lager
         wlp940-mexican-lager))
