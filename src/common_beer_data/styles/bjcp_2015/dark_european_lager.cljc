(ns common-beer-data.styles.bjcp-2015.dark-european-lager
  "2015 BJCP guidelines on Dark European Lagers."
  (:require [common-beer-data.styles.bjcp-2015.styles :as styles]
            [common-beer-format.styles :as cbf]))


(def munich-dunkel
  "Characterized by depth, richness and complexity typical of darker Munich malts with the accompanying Maillard products.
   
   Deeply bready-toasty, often with chocolate-like flavors in the freshest examples, but never harsh, roasty, or astringent; a decidedly malt-balanced beer, yet still easily drinkable."
  (styles/build-style :munich-dunkel
                      {cbf/category        "Dark European Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.048
                       cbf/name            "Munich Dunkel"
                       cbf/type            "Lager"
                       cbf/style-letter    "A"
                       cbf/abv-min         0.045
                       cbf/fg-min          1.01
                       cbf/category-number "8"
                       cbf/carb-max        3.0
                       cbf/ibu-max         28
                       cbf/ingredients     "Grist is traditionally made up of German Munich malt (up to 100% in some cases) with the remainder German Pilsner malt. Small amounts of crystal malt can add dextrins and color but should not introduce excessive residual sweetness. Slight additions of roasted malts (such as Carafa or chocolate) may be used to improve color but should not add strong flavors. Traditional German hop varieties and German lager yeast strains should be used. Often decoction mashed (up to a triple decoction) to enhance the malt flavors and create the depth of color."
                       cbf/examples        "Ayinger Altbairisch Dunkel, Chuckanut Dunkel Lager, Ettaler Kloster Dunkel, Hacker-Pschorr Alt Munich Dark, Weltenburger Kloster Barock-Dunkel"
                       cbf/notes           "Characterized by depth, richness and complexity typical of darker Munich malts with the accompanying Maillard products. Deeply bready-toasty, often with chocolate-like flavors in the freshest examples, but never harsh, roasty, or astringent; a decidedly malt-balanced beer, yet still easily drinkable."
                       cbf/og-max          1.056
                       cbf/color-min       14.0
                       cbf/abv-max         0.056
                       cbf/color-max       28.0
                       cbf/profile         "Aroma: Rich, elegant, deep malt sweetness, typically like bread crusts (often toasted bread crusts). Hints of chocolate, nuts, caramel, and/or toffee are also acceptable, with fresh traditional versions often showing higher levels of chocolate. Clean fermentation profile. A slight spicy, floral, or herbal hop aroma is acceptable. Appearance: Deep copper to dark brown, often with a red or garnet tint. Creamy, light to medium tan head. Usually clear, although murky unfiltered versions exist. Flavor: Dominated by the soft, rich, and complex flavor of darker Munich malts, usually with overtones reminiscent of toasted bread crusts, but without a burnt-harsh-grainy toastiness. The palate can be moderately malty, although it should not be overwhelming or cloyingly sweet. Mild caramel, toast or nuttiness may be present. Very fresh examples often have a pleasant malty-chocolate character that isn't roasty or sweet. Burnt or bitter flavors from roasted malts are inappropriate, as are pronounced caramel flavors from crystal malt. Hop bitterness is moderately low but perceptible, with the balance tipped firmly towards maltiness. Hop flavor is low to none; if noted, should reflect floral, spicy, or herbal German-type varieties. Aftertaste remains malty, although the hop bitterness may become more apparent in the medium-dry finish. Clean fermentation profile and lager character. Mouthfeel: Medium to medium-full body, providing a soft and dextrinous mouthfeel without being heavy or cloying. Moderate carbonation. The use of continental Munich-type malts should provide a richness, not a harsh or biting astringency."
                       cbf/ibu-min         18}))


(def schwarzbier
  "A dark German lager that balances roasted yet smooth malt flavors with moderate hop bitterness.
   
   The lighter body, dryness, and lack of a harsh, burnt, or heavy aftertaste helps make this beer quite drinkable."
  (styles/build-style :schwarzbier
                      {cbf/category        "Dark European Lager"
                       cbf/carb-min        1.5
                       cbf/fg-max          1.016
                       cbf/og-min          1.046
                       cbf/name            "Schwarzbier"
                       cbf/type            "Lager"
                       cbf/style-letter    "B"
                       cbf/abv-min         0.044
                       cbf/fg-min          1.01
                       cbf/category-number "8"
                       cbf/carb-max        3.0
                       cbf/ibu-max         30
                       cbf/ingredients     "German Munich malt and/or Pilsner malts for the base, supplemented by a judicious use of roasted malts (such as Carafa types) for the dark color and subtle roast flavors. Huskless dark roasted malts can add roast flavors without burnt flavors. German hop varieties and clean German lager yeasts are traditional."
                       cbf/examples        "Devils Backbone Schwartz Bier, Einbecker Schwarzbier, Eisenbahn Dunkel, Köstritzer Schwarzbier, Mönchshof Schwarzbier, Nuezeller Original Badebier"
                       cbf/notes           "A dark German lager that balances roasted yet smooth malt flavors with moderate hop bitterness. The lighter body, dryness, and lack of a harsh, burnt, or heavy aftertaste helps make this beer quite drinkable."
                       cbf/og-max          1.052
                       cbf/color-min       17.0
                       cbf/abv-max         0.054
                       cbf/color-max       30.0
                       cbf/profile         "Aroma: Low to moderate malt, with low aromatic malty sweetness and/or hints of roast malt often apparent. The malt can be clean and neutral or moderately rich and bready, and may have a hint of dark caramel. The roast character can be somewhat dark chocolate- or coffee-like but should never be burnt. A low spicy, floral, or herbal hop aroma is optional. Clean lager yeast character, although a light sulfur is possible. Appearance: Medium to very dark brown in color, often with deep ruby to garnet highlights, yet almost never truly black. Very clear. Large, persistent, tan-colored head. Flavor: Light to moderate malt flavor, which can have a clean, neutral character to a moderately rich, bread-malty quality. Light to moderate roasted malt flavors can give a bitter-chocolate palate that lasts into the finish, but which are never burnt. Medium-low to medium bitterness, which can last into the finish. Light to moderate spicy, floral, or herbal hop flavor. Clean lager character. Aftertaste tends to dry out slowly and linger, featuring hop bitterness with a complementary but subtle roastiness in the background. Some residual sweetness is acceptable but not required. Mouthfeel: Medium-light to medium body. Moderate to moderately-high carbonation. Smooth. No harshness or astringency, despite the use of dark, roasted malts."
                       cbf/ibu-min         20}))


(def dark-european-lager
  "2015 BJCP guidelines on Dark European Lagers."
  (merge munich-dunkel
         schwarzbier))
