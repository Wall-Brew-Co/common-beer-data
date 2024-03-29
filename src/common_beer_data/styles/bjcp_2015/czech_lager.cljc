(ns common-beer-data.styles.bjcp-2015.czech-lager
  "2015 BJCP guidelines on Czech Lagers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def czech-pale-lager
  "A lighter-bodied, rich, refreshing, hoppy, bitter pale Czech lager having the familiar flavors of the stronger Czech Premium Pale Lager (Pilsner-type) beer but in a lower alcohol, lighter-bodied, and slightly less intense format."
  (styles/build-style :czech-pale-lager
                      {cbf/category        "Czech Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.014
                       cbf/og-min          1.028
                       cbf/name            "Czech Pale Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.03
                       cbf/fg-min          1.008
                       cbf/category-number "3"
                       cbf/carb-max        3.0
                       cbf/ibu-max         35
                       cbf/ingredients     "Soft water with low sulfate and carbonate content, Saazer-type hops, Czech Pilsner malt, Czech lager yeast. Low ion water provides a distinctively soft, rounded hop profile despite high hopping rates."
                       cbf/examples        "Březňák Světlé výčepní pivo, Notch Session Pils, Pivovar Kout na Šumavě Koutská 10°, Únětické pivo 10°"
                       cbf/notes           "A lighter-bodied, rich, refreshing, hoppy, bitter pale Czech lager having the familiar flavors of the stronger Czech Premium Pale Lager (Pilsner-type) beer but in a lower alcohol, lighter-bodied, and slightly less intense format."
                       cbf/og-max          1.044
                       cbf/color-min       3.0
                       cbf/abv-max         0.041
                       cbf/color-max       6.0
                       cbf/profile         "Aroma: Light to moderate bready-rich malt combined with light to moderate spicy or herbal hop bouquet; the balance between the malt and hops may vary. Faint hint of caramel is acceptable. Light (but never intrusive) diacetyl and light, fruity hop-derived esters are acceptable, but need not be present. No sulfur. Appearance: Light gold to deep gold color. Brilliant to very clear, with a long-lasting, creamy white head. Flavor: Medium-low to medium bready-rich malt flavor with a rounded, hoppy finish. Low to medium-high spicy or herbal hop flavor. Bitterness is prominent but never harsh. Flavorful and refreshing. Diacetyl or fruity esters are acceptable at low levels, but need not be present and should never be overbearing. Mouthfeel: Medium-light to medium body. Moderate carbonation."
                       cbf/ibu-min         20}))


(def czech-premium-pale-lager
  "Rich, characterful, pale Czech lager, with considerable malt and hop character and a long, rounded finish. 
   
   Complex yet well-balanced and refreshing. 
   The malt flavors are complex for a Pilsner-type beer, and the bitterness is strong but clean and without harshness, which gives a rounded impression that enhances drinkability."
  (styles/build-style :czech-premium-pale-lager
                      {cbf/category        "Czech Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.017
                       cbf/og-min          1.044
                       cbf/name            "Czech Premium Pale Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.042
                       cbf/fg-min          1.013
                       cbf/category-number "3"
                       cbf/carb-max        3.0
                       cbf/ibu-max         45
                       cbf/ingredients     "Soft water with low sulfate and carbonate content, Saazer-type hops, Czech malt, Czech lager yeast. Low ion water provides a distinctively soft, rounded hop profile despite high hopping rates. The bitterness level of some larger commercial examples has dropped in recent years, although not as much as in many contemporary German examples."
                       cbf/examples        "Bernard Sváteční ležák, Gambrinus Premium, Kout na Šumavě Koutská 12°, Pilsner Urquell, Pivovar Jihlava Ježek 11°, Primátor Premium, Únětická 12°"
                       cbf/notes           "Rich, characterful, pale Czech lager, with considerable malt and hop character and a long, rounded finish. Complex yet well-balanced and refreshing. The malt flavors are complex for a Pilsner-type beer, and the bitterness is strong but clean and without harshness, which gives a rounded impression that enhances drinkability."
                       cbf/og-max          1.06
                       cbf/color-min       3.5
                       cbf/abv-max         0.058
                       cbf/color-max       6.0
                       cbf/profile         "Aroma: Medium to medium-high bready-rich malt and medium-low to medium-high spicy, floral, or herbal hop bouquet; though the balance between the malt and hops may vary, the interplay is rich and complex. Light diacetyl, or very low fruity hop-derived esters are acceptable, but need not be present. Appearance: Gold to deep gold color. Brilliant to very clear clarity. Dense, long-lasting, creamy white head. Flavor: Rich, complex, bready maltiness combined with a pronounced yet soft and rounded bitterness and floral and spicy hop flavor. Malt and hop flavors are medium to medium-high, and the malt may contain a slight impression of caramel. Bitterness is prominent but never harsh. The long finish can be balanced towards hops or malt but is never aggressively tilted either way. Light to moderate diacetyl and low hop-derived esters are acceptable, but need not be present. Mouthfeel: Medium body. Moderate to low carbonation."
                       cbf/ibu-min         30}))


(def czech-amber-lager
  "Malt-driven amber Czech lager with hop character that can vary from low to quite significant.
   
   The malt flavors can vary quite a bit, leading to different interpretations ranging from drier, bready, and slightly biscuity to sweeter and somewhat caramelly."
  (styles/build-style :czech-amber-lager
                      {cbf/category        "Czech Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.017
                       cbf/og-min          1.044
                       cbf/name            "Czech Amber Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "C"
                       cbf/abv-min         0.044
                       cbf/fg-min          1.013
                       cbf/category-number "3"
                       cbf/carb-max        3.0
                       cbf/ibu-max         35
                       cbf/ingredients     "Pilsner and caramel malts, but Vienna and Munich malts may also be used. Low mineral content water, Saazer-type hops, Czech lager yeast."
                       cbf/examples        "Bernard Jantarový ležák, Pivovar Vysoký Chlumec Démon, Primátor polotmavý 13°, Strakonický Dudák Klostermann polotmavý ležák 13°"
                       cbf/notes           "Malt-driven amber Czech lager with hop character that can vary from low to quite significant. The malt flavors can vary quite a bit, leading to different interpretations ranging from drier, bready, and slightly biscuity to sweeter and somewhat caramelly."
                       cbf/og-max          1.06
                       cbf/color-min       10.0
                       cbf/abv-max         0.058
                       cbf/color-max       16.0
                       cbf/profile         "Aroma: Moderate intensity, rich malt aroma that can be either bready and Maillard product-dominant or slightly caramelly and candy-like. Spicy, floral or herbal hop character may be moderate to none. Clean lager character, though low fruity esters (stone fruit or berries) may be present. Diacetyl is optional and can range from low to none. Appearance: Deep amber to copper color. Clear to bright clarity. Large, off-white, persistent head. Flavor: Complex malt flavor is dominant (medium to medium-high), though its nature may vary from dry and Maillard product-dominant to caramelly and almost sweet. Some examples have a candy-like to graham-cracker malt character. Low to moderate spicy hop flavor. Prominent but clean hop bitterness provides a balanced finish. Subtle plum or berry esters optional. Low diacetyl optional. No roasted malt flavor. Finish may vary from dry and hoppy to relatively sweet. Mouthfeel: Medium-full to medium body. Soft and round, often with a gentle creaminess. Moderate to low carbonation."
                       cbf/ibu-min         20}))


(def czech-dark-lager
  "A rich, dark, malty Czech lager with a roast character that can vary from almost absent to quite prominent. 
   
   Malty with an interesting and complex flavor profile, with variable levels of hopping providing a range of possible interpretations."
  (styles/build-style :czech-dark-lager
                      {cbf/category        "Czech Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.017
                       cbf/og-min          1.044
                       cbf/name            "Czech Dark Lager"
                       cbf/type            "Lager"
                       cbf/style-letter    "D"
                       cbf/abv-min         0.044
                       cbf/fg-min          1.013
                       cbf/category-number "3"
                       cbf/carb-max        3.0
                       cbf/ibu-max         34
                       cbf/ingredients     "Pilsner and dark caramel malts with the addition of debittered roasted malts are most common, but additions of Vienna or Munich malt are also appropriate. Low mineral content water, Saazer-type hops, Czech lager yeast. Any fruity esters are typically from malt, not yeast."
                       cbf/examples        "Bohemian Brewery Cherny Bock 4%, Budweiser Budvar B:Dark tmavý ležák, Devils Backbone Morana, Kout na Šumavě Koutský tmavý speciál 14°, Notch Černé Pivo, Pivovar Březnice Herold, U Fleků Flekovský tmavý 13° ležák"
                       cbf/notes           "A rich, dark, malty Czech lager with a roast character that can vary from almost absent to quite prominent. Malty with an interesting and complex flavor profile, with variable levels of hopping providing a range of possible interpretations."
                       cbf/og-max          1.06
                       cbf/color-min       14.0
                       cbf/abv-max         0.058
                       cbf/color-max       35.0
                       cbf/profile         "Aroma: Medium to medium-high rich, deep, sometimes sweet maltiness, with optional qualities such as bread crusts, toast, nuts, cola, dark fruit, or caramel. Roasted malt characters such as chocolate or sweetened coffee can vary from moderate to none but should not overwhelm the base malt character. Low, spicy hop aroma is optional. Low diacetyl and low fruity esters (plums or berries) may be present. Appearance: Dark copper to almost black color, often with a red or garnet tint. Clear to bright clarity. Large, off-white to tan, persistent head. Flavor: Medium to medium-high deep, complex maltiness dominates, typically with malty-rich Maillard products and a light to moderate residual malt sweetness. Malt flavors such as caramel, toast, nuts, licorice, dried dark fruit, chocolate and coffee may also be present, with very low to moderate roast character. Spicy hop flavor can be moderately-low to none. Hop bitterness may be moderate to medium-low but should be perceptible. Balance can vary from malty to relatively well-balanced to gently hop-forward. Low to moderate diacetyl and light plum or berry esters may be present. Mouthfeel: Medium to medium-full body, considerable mouthfeel without being heavy or cloying. Moderately creamy in texture. Smooth. Moderate to low carbonation. Can have a slight alcohol warmth in stronger versions."
                       cbf/ibu-min         18}))


(def czech-lager
  "2015 BJCP guidelines on Czech Lagers."
  (merge czech-pale-lager
         czech-premium-pale-lager
         czech-amber-lager
         czech-dark-lager))
