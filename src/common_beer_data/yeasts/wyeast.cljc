(ns common-beer-data.yeasts.wyeast
  "Data for yeasts cultivated by Wyeast.
   
   https://wyeastlab.com/"
  {:added "1.0"}
  (:require [common-beer-data.yeasts.yeasts :as yeasts]
            [common-beer-format.yeasts :as cbf]))


(def german-ale-1007
  "Crisp, dry finish with a mild flavor."
  (yeasts/build-yeasts :german-ale-1007
                       {cbf/min-temperature 12.78
                        cbf/name            "1007 German Ale"
                        cbf/max-temperature 18.89
                        cbf/type            "Ale"
                        cbf/best-for        "German Ales, Alts, Kolsch, Dry Stout"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Crisp, dry finish with a mild flavor."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "1007"}))


(def american-wheat-ale-1010
  "Dry, Crisp, tart beer in the American Hefeweizen style. 
   
   Low flocculation aids in producing desired chill haze."
  (yeasts/build-yeasts :american-wheat-ale-1010
                       {cbf/min-temperature 14.44
                        cbf/name            "1010 American Wheat Ale"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "American Wheat, Berlin Weiss, Hefeweizen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry, Crisp, tart beer in the American Hefeweizen style. Low flocculation aids in producing desired chill haze."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "1010"}))


(def british-cask-ale-1026
  "A great choice for any cask conditioned British Ale. 
   
   Produces nice malt profile with a hint of fruit. 
   Finishes dry and slightly tart."
  (yeasts/build-yeasts :british-cask-ale-1026
                       {cbf/min-temperature 17.22
                        cbf/name            "1026 British Cask Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "British Ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "A great choice for any cask conditioned British Ale. Produces nice malt profile with a hint of fruit. Finishes dry and slightly tart."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1026"}))


(def london-ale-yeast-1028
  "Dry finish, bold, rich flavor, some fruit profile and a crisp finish."
  (yeasts/build-yeasts :london-ale-yeast-1028
                       {cbf/min-temperature 15.56
                        cbf/name            "1028 London Ale Yeast"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "English Ales, Bitters, IPAs, Brown Ale"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry finish, bold, rich flavor, some fruit profile and a crisp finish."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1028"}))


(def american-ale-1056
  "Soft, smooth, clean finish. 
   
   Very well balanced. 
   Very versitile - works well with many ale styles."
  (yeasts/build-yeasts :american-ale-1056
                       {cbf/min-temperature 15.56
                        cbf/name            "1056 American Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "American Pale Ale, Scottish Ale, Porters, Sweet Stout, Barley Wine, Alt"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Soft, smooth, clean finish. Very well balanced. Very versitile - works well with many ale styles."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1056"}))


(def irish-ale-1084
  "Dry diacetyl, fruity flavor characteristic of stouts. 
   
   Full bodied, dry, clean flavor."
  (yeasts/build-yeasts :irish-ale-1084
                       {cbf/min-temperature 16.67
                        cbf/name            "1084 Irish Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "Irish Dry Stouts, Porter, Scottish Ale, Brown Ale, Imperial Stout, Barley Wine"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry diacetyl, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1084"}))


(def wyeast-ale-blend-1087
  "Blend of ale strains designed to provide quick starts, good flavor, balance and flocculation. 
   
   Balanced finish suitable for most American and British ale styles."
  (yeasts/build-yeasts :wyeast-ale-blend-1087
                       {cbf/min-temperature 17.78
                        cbf/name            "1087 Wyeast Ale Blend"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "American and British Ale Styles."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Blend of ale strains designed to provide quick starts, good flavor, balance and flocculation. Balanced finish suitable for most American and British ale styles."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1087"}))


(def british-ale-yeast-1098
  "Fruity, tart, dry crisp finish. 
   
   Very well balanced."
  (yeasts/build-yeasts :british-ale-yeast-1098
                       {cbf/min-temperature 17.78
                        cbf/name            "1098 British Ale Yeast"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "All British Ales, Pales, Bitters, English Strong Ale"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Fruity, tart, dry crisp finish. Very well balanced."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1098"}))


(def whitbread-ale-1099
  "Slightly more fruity and malty than Wyeast's British Ale. 
   
   Clear and highly flocculant."
  (yeasts/build-yeasts :whitbread-ale-1099
                       {cbf/min-temperature 17.78
                        cbf/name            "1099 Whitbread Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Whitbread Ale, British Ales, Pales, Bitters"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Slightly more fruity and malty than Wyeast's British Ale. Clear and highly flocculant."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1099"}))


(def ringwood-ale-1187
  "European ale yeast. 
   
   Highly flocculant with complex, clear, but malty profile. 
   Slightly fruity ester."
  (yeasts/build-yeasts :ringwood-ale-1187
                       {cbf/min-temperature 17.78
                        cbf/name            "1187 Ringwood Ale"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "Ringwood Ale, Brown Ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "European ale yeast. Highly flocculant with complex, clear, but malty profile. Slightly fruity ester."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1187"}))


(def belgian-ale-yeast-1214
  "Trappist style ale yeast. 
   
   Complex estery flavor."
  (yeasts/build-yeasts :belgian-ale-yeast-1214
                       {cbf/min-temperature 14.44
                        cbf/name            "1214 Belgian Ale Yeast"
                        cbf/max-temperature 20.0
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Ales, Abbey Ales, Trappist Ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Trappist style ale yeast. Complex estery flavor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1214"}))


(def american-ale-ii-1272
  "Clean, tart, nutty flavor. 
   
   More fruity than Wyeast American Ale yeast."
  (yeasts/build-yeasts :american-ale-ii-1272
                       {cbf/min-temperature 15.56
                        cbf/name            "1272 American Ale II"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "All American Ales, Brown Ales, Barley Wine"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, tart, nutty flavor. More fruity than Wyeast American Ale yeast."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1272"}))


(def gf-all-american-ale-1272
  "Popular all purpose American ale style now in a Gluten Free strain. 
   
   Produces beers that are nutty, clean with a slight tart finish. 
   Ferment warmer to accentuate hops and add fruitiness or ferment cold for clean light citrus character."
  (yeasts/build-yeasts :gf-all-american-ale-1272
                       {cbf/min-temperature 15.56
                        cbf/name            "1272 GF All American Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "American Amber, Brown, IPA, Pale ales and stouts. Blondes and fruit beers."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Popular all purpose American ale style now in a Gluten Free strain. Produces beers that are nutty, clean with a slight tart finish. Ferment warmer to accentuate hops and add fruitiness or ferment cold for clean light citrus character."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1272"}))


(def thames-valley-ale-1275
  "Clean, complex flavor. 
   
   Low in fruit, low in esters, rich in flavor. 
   Hops come through well."
  (yeasts/build-yeasts :thames-valley-ale-1275
                       {cbf/min-temperature 16.67
                        cbf/name            "1275 Thames Valley Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "British Bitters, ESB, India Pale Ale, English Strong Ale"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, complex flavor. Low in fruit, low in esters, rich in flavor. Hops come through well."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1275"}))


(def london-ale-iii-1318
  "Light, fruity flavor. 
   
   Balanced flavor with hint of sweetness."
  (yeasts/build-yeasts :london-ale-iii-1318
                       {cbf/min-temperature 17.78
                        cbf/name            "1318 London Ale III"
                        cbf/max-temperature 23.33
                        cbf/type            "Ale"
                        cbf/best-for        "British Ales, Bitters"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Light, fruity flavor. Balanced flavor with hint of sweetness."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1318"}))


(def northwest-ale-1332
  "Classic Northwest US ale yeast. 
   
   Slight fruit flavor, malty ale with good body and balance."
  (yeasts/build-yeasts :northwest-ale-1332
                       {cbf/min-temperature 18.33
                        cbf/name            "1332 Northwest Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Oregon Ales, All American Ale styles"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic Northwest US ale yeast. Slight fruit flavor, malty ale with good body and balance."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1332"}))


(def british-ale-ii-1335
  "Malty, clean, crisp finish. 
   
   Dry flavor."
  (yeasts/build-yeasts :british-ale-ii-1335
                       {cbf/min-temperature 17.22
                        cbf/name            "1335 British Ale II"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "British and Canadian Ales, English Bitters"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Malty, clean, crisp finish. Dry flavor."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1335"}))


(def european-ale-yeast-1338
  "Very malty flavor characteristic of Bavarian/Munich Ales. 
   
   Complex character."
  (yeasts/build-yeasts :european-ale-yeast-1338
                       {cbf/min-temperature 16.67
                        cbf/name            "1338 European Ale Yeast"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "European Ales, German Ales, Alts, Pale Ale, Brown Ale, Kolsch"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Very malty flavor characteristic of Bavarian/Munich Ales. Complex character."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1338"}))


(def belgian-strong-ale-1388
  "Dry, tart, fruity flavor. 
   
   High alcohol tolerance."
  (yeasts/build-yeasts :belgian-strong-ale-1388
                       {cbf/min-temperature 18.33
                        cbf/name            "1388 Belgian Strong Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Ales, Scottish Strong Ale,Trappist Ales, Dubbels, Trippels"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry, tart, fruity flavor. High alcohol tolerance."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "1388"}))


(def denny-s-favorite-50-1450
  "This terrific all-round yeast can be used for almost any beer style, and is a mainstay of one of our local homebrewers, Mr. Denny Conn.
   
   It is unique in that it produces a big mouthfeel and accentuates the malt, caramel, or fruit character of a beer without being sweet or under-attenuated."
  (yeasts/build-yeasts :denny-s-favorite-50-1450
                       {cbf/min-temperature 15.56
                        cbf/name            "1450 Denny's Favorite 50"
                        cbf/max-temperature 21.11
                        cbf/type            "Ale"
                        cbf/best-for        "almost any style"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "This terrific all-round yeast can be used for almost any beer style, and is a mainstay of one of our local homebrewers, Mr. Denny Conn. It is unique in that it produces a big mouthfeel and accentuates the malt, caramel, or fruit character of a beer without being sweet or under-attenuated."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "1450"}))


(def scottish-ale-1728
  "High alcohol tolerance."
  (yeasts/build-yeasts :scottish-ale-1728
                       {cbf/min-temperature 12.78
                        cbf/name            "1728 Scottish Ale"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Scottish Ale, Scottish Strong Ales, Sweet Stout, Imperial Stout, Barley Wine"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "High alcohol tolerance."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1728"}))


(def belgian-abbey-ii-1762
  "Dry flavor with slight fruitiness. 
   
   High alcohol tolerance."
  (yeasts/build-yeasts :belgian-abbey-ii-1762
                       {cbf/min-temperature 18.33
                        cbf/name            "1762 Belgian Abbey II"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Ales, Trappist Ales, Abbey Ales, Grand Cru"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Dry flavor with slight fruitiness. High alcohol tolerance."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "1762"}))


(def london-esb-ale-1968
  "Malty, balanced flavor. 
   
   Fruity, rich finish. 
   Excellent for cask conditioned ales and bitters."
  (yeasts/build-yeasts :london-esb-ale-1968
                       {cbf/min-temperature 17.78
                        cbf/name            "1968 London ESB Ale"
                        cbf/max-temperature 22.22
                        cbf/type            "Ale"
                        cbf/best-for        "English Bitters, IPA, Brown Ales, Mild Ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Malty, balanced flavor. Fruity, rich finish. Excellent for cask conditioned ales and bitters."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "1968"}))


(def budvar-lager-2000
  "Classic pilsner lager yeast. 
   
   Malty nose and subtle fruit. 
   Rich malt profile, but dry crisp finish. 
   Hop character accentuated by dry finish."
  (yeasts/build-yeasts :budvar-lager-2000
                       {cbf/min-temperature 7.78
                        cbf/name            "2000 Budvar Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian Pilsner, Classic Pilsners, Dortmunder and Light Lagers"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic pilsner lager yeast. Malty nose and subtle fruit. Rich malt profile, but dry crisp finish. Hop character accentuated by dry finish."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "2000"}))


(def urquell-lager-2001
  "Pilsner Urquell yeast with mild fruit/floral aroma. 
   
   Very dry and clean on palate with full mouth feel. 
   Subtle malt character. 
   Clean and neutral finish."
  (yeasts/build-yeasts :urquell-lager-2001
                       {cbf/min-temperature 8.89
                        cbf/name            "2001 Urquell Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian Pilsner"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Pilsner Urquell yeast with mild fruit/floral aroma. Very dry and clean on palate with full mouth feel. Subtle malt character. Clean and neutral finish."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2001"}))


(def pilsen-lager-2007
  "Classic American pilsner strain. 
   
   Smooth with a malty flavor. 
   Dry and crisp fermentation."
  (yeasts/build-yeasts :pilsen-lager-2007
                       {cbf/min-temperature 8.89
                        cbf/name            "2007 Pilsen Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "American Pilsner, Bohemian Pilsner, Light Lagers"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic American pilsner strain. Smooth with a malty flavor. Dry and crisp fermentation."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2007"}))


(def american-lager-2035
  "Bold, with a complex aroma. 
   
   Good flavor depth characteristics for a wide variety of lager beers."
  (yeasts/build-yeasts :american-lager-2035
                       {cbf/min-temperature 8.89
                        cbf/name            "2035 American Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "American Lagers and Pilsners"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Bold, with a complex aroma. Good flavor depth characteristics for a wide variety of lager beers."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2035"}))


(def danish-lager-2042
  "Rich, Dortmund style, with a crisp, dry finish. 
   
   Soft profile accentuates hop flavor."
  (yeasts/build-yeasts :danish-lager-2042
                       {cbf/min-temperature 7.78
                        cbf/name            "2042 Danish Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "Dortmund/Export Lagers"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Rich, Dortmund style, with a crisp, dry finish. Soft profile accentuates hop flavor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2042"}))


(def california-lager-2112
  "Suited for 19th century California style beers. 
   
   Lagers at high temperature and produces malty, clear beers."
  (yeasts/build-yeasts :california-lager-2112
                       {cbf/min-temperature 14.44
                        cbf/name            "2112 California Lager"
                        cbf/max-temperature 20.0
                        cbf/type            "Lager"
                        cbf/best-for        "California common beers, Steam Beer"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Suited for 19th century California style beers. Lagers at high temperature and produces malty, clear beers."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "2112"}))


(def bohemian-lager-2124
  "Ferments clean and malty, with rich malty flavor for full gravity pilsners."
  (yeasts/build-yeasts :bohemian-lager-2124
                       {cbf/min-temperature 8.89
                        cbf/name            "2124 Bohemian Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian Pilsners, Pilsners, German Helles, Bocks"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Ferments clean and malty, with rich malty flavor for full gravity pilsners."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2124"}))


(def wyeast-lager-blend-2178
  "Blend of lager strains to produce a complex but clean lager flavor profile. 
   
   Suitable for many common lager styles."
  (yeasts/build-yeasts :wyeast-lager-blend-2178
                       {cbf/min-temperature 8.89
                        cbf/name            "2178 Wyeast Lager Blend"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Classic Pilsners, Lagers, Bocks."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Blend of lager strains to produce a complex but clean lager flavor profile. Suitable for many common lager styles."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2178"}))


(def bavarian-lager-2206
  "Use by many German breweries. 
   
   Produces a full-bodied, rich, malty beer."
  (yeasts/build-yeasts :bavarian-lager-2206
                       {cbf/min-temperature 7.78
                        cbf/name            "2206 Bavarian Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "German Bocks, Vienna, Oktoberfest, Hells, Marzens, Dunkel"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Use by many German breweries. Produces a full-bodied, rich, malty beer."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2206"}))


(def european-lager-ii-2247
  "Clean, dry flavor profile for aggressively hopped pilsners. 
   
   Dry finish, mild aroma, slight sulfur production."
  (yeasts/build-yeasts :european-lager-ii-2247
                       {cbf/min-temperature 7.78
                        cbf/name            "2247 European Lager II"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian Pilsner, American Pilsner, Helles, Dunkel"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Clean, dry flavor profile for aggressively hopped pilsners. Dry finish, mild aroma, slight sulfur production."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "2247"}))


(def north-american-lager-2272
  "American and Canadian lager yeast. 
   
   Malty finish makes it suitable for Marzens/Oktoberfest as well."
  (yeasts/build-yeasts :north-american-lager-2272
                       {cbf/min-temperature 8.89
                        cbf/name            "2272 North American Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "American Pilsner, California Common, Canadian Lager, Oktoberfest, Marzen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "American and Canadian lager yeast. Malty finish makes it suitable for Marzens/Oktoberfest as well."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "2272"}))


(def czech-pilsner-lager-2278
  "Classic Pilsner strain. 
   
   Creates a dry but malty finish. 
   Perfect for Pilsners and bocks. Some sulfur produced, but will fade with time."
  (yeasts/build-yeasts :czech-pilsner-lager-2278
                       {cbf/min-temperature 10.0
                        cbf/name            "2278 Czech Pilsner Lager"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Bohemian and American Pilsner, Bocks, Oktoberfest, Marzen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic Pilsner strain. Creates a dry but malty finish. Perfect for Pilsners and bocks. Some sulfur produced, but will fade with time."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2278"}))


(def munich-lager-2308
  "Unique Pilsner strain. 
   
   Very smooth, well-rounded and full bodied. 
   Benefits from a diacetyl rest."
  (yeasts/build-yeasts :munich-lager-2308
                       {cbf/min-temperature 8.89
                        cbf/name            "2308 Munich Lager"
                        cbf/max-temperature 13.33
                        cbf/type            "Lager"
                        cbf/best-for        "Pilsners, Light Lagers, Dortmond/Export, Marzen/Oktoberfest, Dunkel"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Unique Pilsner strain. Very smooth, well-rounded and full bodied. Benefits from a diacetyl rest."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "2308"}))


(def kolsch-yeast-2565
  "Very malty flavor with mix of lager and ale character. 
   
   Crisp, clean finish."
  (yeasts/build-yeasts :kolsch-yeast-2565
                       {cbf/min-temperature 13.33
                        cbf/name            "2565 Kolsch Yeast"
                        cbf/max-temperature 17.78
                        cbf/type            "Ale"
                        cbf/best-for        "Kolsch, European Ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Very malty flavor with mix of lager and ale character. Crisp, clean finish."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "2565"}))


(def octoberfest-lager-blend-2633
  "This blend of lager strains is designed to produce a rich, malty, complex and full bodied Octoberfest style beer. 
   
   It attenuates well while leaving plenty of malt character and mouthfeel. 
   This strain is low in sulfur production."
  (yeasts/build-yeasts :octoberfest-lager-blend-2633
                       {cbf/min-temperature 8.89
                        cbf/name            "2633 Octoberfest Lager Blend"
                        cbf/max-temperature 14.44
                        cbf/type            "Lager"
                        cbf/best-for        "Octoberfest, Marzen, Bavarian lagers"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "This blend of lager strains is designed to produce a rich, malty, complex and full bodied Octoberfest style beer. It attenuates well while leaving plenty of malt character and mouthfeel. This strain is low in sulfur production."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "2633"}))


(def bavarian-wheat-yeast-3056
  "Blend of top-fermenting ale and wheat yeasts providing a mild ester and phenolic profile."
  (yeasts/build-yeasts :bavarian-wheat-yeast-3056
                       {cbf/min-temperature 17.78
                        cbf/name            "3056 Bavarian Wheat Yeast"
                        cbf/max-temperature 23.33
                        cbf/type            "Wheat"
                        cbf/best-for        "Bavarian style wheat beers."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Blend of top-fermenting ale and wheat yeasts providing a mild ester and phenolic profile."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3056"}))


(def weihenstephan-weizen-3068
  "Unique Bavarian wheat yeast that produces the spicy weizen clove and banana flavor. 
   
   Best when fermented at around 68 deg F."
  (yeasts/build-yeasts :weihenstephan-weizen-3068
                       {cbf/min-temperature 17.78
                        cbf/name            "3068 Weihenstephan Weizen"
                        cbf/max-temperature 23.89
                        cbf/type            "Wheat"
                        cbf/best-for        "Bavarian Weizen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Unique Bavarian wheat yeast that produces the spicy weizen clove and banana flavor. Best when fermented at around 68 deg F."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "3068"}))


(def brettanomyces-bruxellensis-3112
  "Wild yeast strain isolated from Brussels region of Belgium. 
   
   Adds classic sweaty horse hair flavor as well as sourness and cherry-pie like flavor. 
   Generally used in conjunction with S. Cerevisiae after the primary fermentation has begun."
  (yeasts/build-yeasts :brettanomyces-bruxellensis-3112
                       {cbf/min-temperature 15.56
                        cbf/name            "3112 Brettanomyces Bruxellensis"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Lambic, Gueze Lambic, and Sour Browns"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Wild yeast strain isolated from Brussels region of Belgium. Adds classic sweaty horse hair flavor as well as sourness and cherry-pie like flavor. Generally used in conjunction with S. Cerevisiae after the primary fermentation has begun."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3112"}))


(def belgian-lambic-blend-3278
  "Lambic culture of Saccharomyces Cerevisiar and a mixture of yeasts and bacterias. 
   
   Blend of organisms helps create lactic flavor of Belgian Lambics."
  (yeasts/build-yeasts :belgian-lambic-blend-3278
                       {cbf/min-temperature 17.22
                        cbf/name            "3278 Belgian Lambic Blend"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Lambic"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Lambic culture of Saccharomyces Cerevisiar and a mixture of yeasts and bacterias. Blend of organisms helps create lactic flavor of Belgian Lambics."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "3278"}))


(def german-wheat-3333
  "Subtle flavor profile. 
   
   Sharp, fruity, crisp, sherry like flavor."
  (yeasts/build-yeasts :german-wheat-3333
                       {cbf/min-temperature 17.22
                        cbf/name            "3333 German Wheat"
                        cbf/max-temperature 23.89
                        cbf/type            "Wheat"
                        cbf/best-for        "Bavarian Weizen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Subtle flavor profile. Sharp, fruity, crisp, sherry like flavor."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "3333"}))


(def forbidden-fruit-3463
  "Phenolic profile with subdued fruitiness. 
   
   Available seasonally."
  (yeasts/build-yeasts :forbidden-fruit-3463
                       {cbf/min-temperature 17.22
                        cbf/name            "3463 Forbidden Fruit"
                        cbf/max-temperature 24.44
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Wit, Grand Cru"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Phenolic profile with subdued fruitiness. Available seasonally."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "3463"}))


(def belgian-ardennes-3522
  "Phenolics develop at increased temperature.
   
   Mild fruitiness and complex spicy flavor."
  (yeasts/build-yeasts :belgian-ardennes-3522
                       {cbf/min-temperature 18.33
                        cbf/name            "3522 Belgian Ardennes"
                        cbf/max-temperature 29.44
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Ale"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Phenolics develop at increased temperature. Mild fruitiness and complex spicy flavor."
                        cbf/flocculation    "High"
                        cbf/form            "Liquid"
                        cbf/product-id      "3522"}))


(def bavarian-wheat-3638
  "Hefeweizen yeast with complex flavor and aroma. 
   
   Bubble gum, banana flavors with apple/plum ester profile. 
   Malty flavor."
  (yeasts/build-yeasts :bavarian-wheat-3638
                       {cbf/min-temperature 17.78
                        cbf/name            "3638 Bavarian Wheat"
                        cbf/max-temperature 23.89
                        cbf/type            "Wheat"
                        cbf/best-for        "Bavarian Weizen, Hefeweizen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Hefeweizen yeast with complex flavor and aroma. Bubble gum, banana flavors with apple/plum ester profile. Malty flavor."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "3638"}))


(def french-saison-3711
  "A very versatile strain that produces Saison or farmhouse style biers as well as other Belgian style beers that are highly aromatic (estery), peppery, spicy and citrusy. 
   
   This strain enhances the use of spices and aroma hops, and is extremely attenuative."
  (yeasts/build-yeasts :french-saison-3711
                       {cbf/min-temperature 18.33
                        cbf/name            "3711 French Saison"
                        cbf/max-temperature 25.0
                        cbf/type            "Ale"
                        cbf/best-for        "French and Belgian Saison or Farmhouse ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "A very versatile strain that produces Saison or farmhouse style biers as well as other Belgian style beers that are highly aromatic (estery), peppery, spicy and citrusy. This strain enhances the use of spices and aroma hops, and is extremely attenuative."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3711"}))


(def belgian-saison-3724
  "Classic farmhouse ale yeast. 
   
   Spicy, complex aromatics including bubble gum. 
   Tart and dry on the palate with mild fruitiness. 
   Finishes crisp and mildly acidic. 
   Ferment at warm temperature. 
   May have vigorous fermentation start."
  (yeasts/build-yeasts :belgian-saison-3724
                       {cbf/min-temperature 21.11
                        cbf/name            "3724 Belgian Saison"
                        cbf/max-temperature 35.0
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian Saison beer"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Classic farmhouse ale yeast. Spicy, complex aromatics including bubble gum. Tart and dry on the palate with mild fruitiness. Finishes crisp and mildly acidic. Ferment at warm temperature. May have vigorous fermentation start."
                        cbf/flocculation    "Low"
                        cbf/form            "Liquid"
                        cbf/product-id      "3724"}))


(def roselare-belgian-blend-3763
  "Culture of Saccharomyces, Brettonomyces and Lactic Acid Bacteria. 
   
   Complex aromas and flavors. 
   May be used for primary fermentation. 
   Primarily for sour brown and red Belgian styles."
  (yeasts/build-yeasts :roselare-belgian-blend-3763
                       {cbf/min-temperature 12.78
                        cbf/name            "3763 Roselare Belgian Blend"
                        cbf/max-temperature 26.67
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian sour brown and red beers."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Culture of Saccharomyces, Brettonomyces and Lactic Acid Bacteria. Complex aromas and flavors. May be used for primary fermentation. Primarily for sour brown and red Belgian styles."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3763"}))


(def trappist-high-gravity-3787
  "Robust top cropping yeast. 
   
   Phenolic character and alcohol tolerance up to 12%. 
   Rich ester profile and malty flavor."
  (yeasts/build-yeasts :trappist-high-gravity-3787
                       {cbf/min-temperature 17.78
                        cbf/name            "3787 Trappist High Gravity"
                        cbf/max-temperature 25.56
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Wit, Trappist Ale, High gravity ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Robust top cropping yeast. Phenolic character and alcohol tolerance up to 12%. Rich ester profile and malty flavor."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3787"}))


(def belgian-wheat-yeast-3942
  "Estery lor phenol yeast. 
   
   lum and apple aroma with a dry finish."
  (yeasts/build-yeasts :belgian-wheat-yeast-3942
                       {cbf/min-temperature 17.78
                        cbf/name            "3942 Belgian Wheat Yeast"
                        cbf/max-temperature 23.33
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Wheat, Bavarian Weizen"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Estery lor phenol yeast. Plum and apple aroma with a dry finish."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3942"}))


(def belgian-witbier-3944
  "Tart, slightly phenolic character. 
   
   For Wits and Grand Cru. 
   Tolerates high gravity beers well."
  (yeasts/build-yeasts :belgian-witbier-3944
                       {cbf/min-temperature 16.67
                        cbf/name            "3944 Belgian Witbier"
                        cbf/max-temperature 23.89
                        cbf/type            "Wheat"
                        cbf/best-for        "Belgian Wit, Grand Cru"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Tart, slightly phenolic character. For Wits and Grand Cru. Tolerates high gravity beers well."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "3944"}))


(def lactobacillus-delbrueckii-4335
  "Lactic acid bacteria isolated from Belgium. 
   
   Produces mild acidity and sourness found in many types of Belgian beers. 
   Always used in conjunction with S. Cerevisiae and wild yeasts."
  (yeasts/build-yeasts :lactobacillus-delbrueckii-4335
                       {cbf/min-temperature 15.56
                        cbf/name            "4335 Lactobacillus Delbrueckii"
                        cbf/max-temperature 35.0
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian gueze, lambic, sour brown ales, and Berliner Weisse."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Lactic acid bacteria isolated from Belgium. Produces mild acidity and sourness found in many types of Belgian beers. Always used in conjunction with S. Cerevisiae and wild yeasts."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "4335"}))


(def pediococcus-cerevisiae-4733
  "Lactic acid bacteria isolated from Belgium. 
   
   Creates a high level of lactic acidity over a long time. 
   Often used with other yeasts, and it may take several months for flavor to fully develop."
  (yeasts/build-yeasts :pediococcus-cerevisiae-4733
                       {cbf/min-temperature 15.56
                        cbf/name            "4733 Pediococcus Cerevisiae"
                        cbf/max-temperature 35.0
                        cbf/type            "Ale"
                        cbf/best-for        "Gueze and other Belgian styles."
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Lactic acid bacteria isolated from Belgium. Creates a high level of lactic acidity over a long time. Often used with other yeasts, and it may take several months for flavor to fully develop."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "4733"}))


(def brettanomyces-bruxellensis-5112
  "This strain of wild yeast was isolated from brewery cultures in the Brussels region of Belgium. 
   
   It produces the classic sweaty horse blanket character and may form a pellicle in bottles or casks."
  (yeasts/build-yeasts :brettanomyces-bruxellensis-5112
                       {cbf/min-temperature 15.56
                        cbf/name            "5112 Brettanomyces Bruxellensis"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Gueuze, Lambics and Sour Browns"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "This strain of wild yeast was isolated from brewery cultures in the Brussels region of Belgium. It produces the classic sweaty horse blanket character and may form a pellicle in bottles or casks."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "5112"}))


(def lactobacillus-5335
  "Lactic acid bacteria isolated from a Belgian brewery. 
   This culture produces moderate levels of acidity and is commonly found in many types of beers including gueuze, lambics, sour brown ales and Berliner Weisse."
  (yeasts/build-yeasts :lactobacillus-5335
                       {cbf/min-temperature 15.56
                        cbf/name            "5335 Lactobacillus"
                        cbf/max-temperature 35.0
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian sout beers (secondary)"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Lactic acid bacteria isolated from a Belgian brewery. This culture produces moderate levels of acidity and is commonly found in many types of beers including gueuze, lambics, sour brown ales and Berliner Weisse."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "5335"}))


(def brettanomyces-lambucus-5526
  "This is a wild yeast strain isolated from Belgian lambic beers. 
   
   It produces a pie cherry-like flavor and sourness with a distinct Brett character. 
   A pellicle may form in bottles or casks. 
   This strain works best in conjunction with other yeasts."
  (yeasts/build-yeasts :brettanomyces-lambucus-5526
                       {cbf/min-temperature 15.56
                        cbf/name            "5526 Brettanomyces Lambucus"
                        cbf/max-temperature 23.89
                        cbf/type            "Ale"
                        cbf/best-for        "Lambic"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "This is a wild yeast strain isolated from Belgian lambic beers. It produces a pie cherry-like flavor and sourness with a distinct Brett character. A pellicle may form in bottles or casks. This strain works best in conjunction with other yeasts."
                        cbf/flocculation    "Very High"
                        cbf/form            "Liquid"
                        cbf/product-id      "5526"}))


(def pediococcus-5733
  "Lactic acid bacteria used in the production of Belgian style beers where additional acidity is desirable. 
   
   Often found in gueuze and other Belgian style beer. 
   Acid production will increase with storage time. 
   It may also cause ropiness and produce low level."
  (yeasts/build-yeasts :pediococcus-5733
                       {cbf/min-temperature 18.33
                        cbf/name            "5733 Pediococcus"
                        cbf/max-temperature 35.0
                        cbf/type            "Ale"
                        cbf/best-for        "Belgian sour ales"
                        cbf/laboratory      "Wyeast"
                        cbf/attenuation     0.765
                        cbf/notes           "Lactic acid bacteria used in the production of Belgian style beers where additional acidity is desirable. Often found in gueuze and other Belgian style beer. Acid production will increase with storage time. It may also cause ropiness and produce low level."
                        cbf/flocculation    "Medium"
                        cbf/form            "Liquid"
                        cbf/product-id      "5733"}))


(def wyeast
  "Data for yeasts cultivated by Wyeast.
   
   https://wyeastlab.com/"
  (merge german-ale-1007
         american-wheat-ale-1010
         british-cask-ale-1026
         london-ale-yeast-1028
         american-ale-1056
         irish-ale-1084
         wyeast-ale-blend-1087
         british-ale-yeast-1098
         whitbread-ale-1099
         ringwood-ale-1187
         belgian-ale-yeast-1214
         american-ale-ii-1272
         gf-all-american-ale-1272
         thames-valley-ale-1275
         london-ale-iii-1318
         northwest-ale-1332
         british-ale-ii-1335
         european-ale-yeast-1338
         belgian-strong-ale-1388
         denny-s-favorite-50-1450
         scottish-ale-1728
         belgian-abbey-ii-1762
         london-esb-ale-1968
         budvar-lager-2000
         urquell-lager-2001
         pilsen-lager-2007
         american-lager-2035
         danish-lager-2042
         california-lager-2112
         bohemian-lager-2124
         wyeast-lager-blend-2178
         bavarian-lager-2206
         european-lager-ii-2247
         north-american-lager-2272
         czech-pilsner-lager-2278
         munich-lager-2308
         kolsch-yeast-2565
         octoberfest-lager-blend-2633
         bavarian-wheat-yeast-3056
         weihenstephan-weizen-3068
         brettanomyces-bruxellensis-3112
         belgian-lambic-blend-3278
         german-wheat-3333
         forbidden-fruit-3463
         belgian-ardennes-3522
         bavarian-wheat-3638
         french-saison-3711
         belgian-saison-3724
         roselare-belgian-blend-3763
         trappist-high-gravity-3787
         belgian-wheat-yeast-3942
         belgian-witbier-3944
         lactobacillus-delbrueckii-4335
         pediococcus-cerevisiae-4733
         brettanomyces-bruxellensis-5112
         lactobacillus-5335
         brettanomyces-lambucus-5526
         pediococcus-5733))
