(ns common-beer-data.yeasts.brewtek
  "Data for yeasts cultivated by Brewtek.
   https://brewtek.se/sv/"
  (:require [common-beer-data.yeasts.yeasts :as yeasts]))


(def cl-0010-american-microbrewery-ale-1
  "Smooth, clean, strong fermenting ale yeast that works well at cold temperature.
   
   Clean malt flavor is ideal for cream ales."
  (yeasts/build-yeasts :cl-0010-american-microbrewery-ale-1
                       {:min-temperature 13.33
                        :name            "CL-0010 American Microbrewery Ale #1"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "American Ales, Cream Ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Smooth, clean, strong fermenting ale yeast that works well at cold temperature. Clean malt flavor is ideal for cream ales."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0010"}))


(def cl-0020-american-microbrewery-ale-2
  "Accentuated, rich, creamy malt profile. 
   
   Generous amounts of diacytl. 
   Use for low gravity beers where malt character is needed or stronger beers for a robust character."
  (yeasts/build-yeasts :cl-0020-american-microbrewery-ale-2
                       {:min-temperature 13.33
                        :name            "CL-0020 American Microbrewery Ale #2"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "American ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Accentuated, rich, creamy malt profile. Generous amounts of diacytl. Use for low gravity beers where malt character is needed or stronger beers for a robust character."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0020"}))


(def cl-0050-california-pub-ale
  "For that classic U.S. small brewery flavor. 
   
   CL-50 produces terrific American red & pale ale styles. 
   While attenuation is normal, this yeast produces a big, soft, well rounded malt flavor that really lets caramel malt flavors shine."
  (yeasts/build-yeasts :cl-0050-california-pub-ale
                       {:min-temperature 15.56
                        :name            "CL-0050 California Pub Ale"
                        :max-temperature 21.11
                        :type            "Ale"
                        :best-for        "California and other American ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "For that classic U.S. small brewery flavor. CL-50 produces terrific American red & pale ale styles. While attenuation is normal, this yeast produces a big, soft, well rounded malt flavor that really lets caramel malt flavors shine."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0050"}))


(def cl-0060-north-eastern-micro-ale
  "Malty, bready, yet clean malt character. 
   
   Leaves hops flavor and aroma intact. 
   Versitile yeast for many American styles."
  (yeasts/build-yeasts :cl-0060-north-eastern-micro-ale
                       {:min-temperature 13.33
                        :name            "CL-0060 North-Eastern Micro Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "American Ales, Reds, Ambers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Malty, bready, yet clean malt character. Leaves hops flavor and aroma intact. Versitile yeast for many American styles."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0060"}))


(def cl-0110-british-microbrewery-ale
  "Complex oakey, and fruity ester profile. 
   
   Slightly under-attenuated finish leaves some residual malt flavor. 
   Suitable for low to medium gravity bitters and ales."
  (yeasts/build-yeasts :cl-0110-british-microbrewery-ale
                       {:min-temperature 16.67
                        :name            "CL-0110 British Microbrewery Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "English Bitters and Milds"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Complex oakey, and fruity ester profile. Slightly under-attenuated finish leaves some residual malt flavor. Suitable for low to medium gravity bitters and ales."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0110"}))


(def cl-0120-british-pale-ale-1
  "Bold, citrusy character which accentuates mineral and hop flavors.
   
   Distinct character of a classic Pale Ale."
  (yeasts/build-yeasts :cl-0120-british-pale-ale-1
                       {:min-temperature 16.67
                        :name            "CL-0120 British Pale Ale #1"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "British Pale Ales and Bitters."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Bold, citrusy character which accentuates mineral and hop flavors. Distinct character of a classic Pale Ale."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0120"}))


(def cl-0130-british-pale-ale-2
  "Smooth, full bodied, well roundd ale yeast. 
   
   Mild esters. 
   Strong ferementer suitable for strong or spiced ales. 
   Accentuates caramel and malt flavors."
  (yeasts/build-yeasts :cl-0130-british-pale-ale-2
                       {:min-temperature 16.67
                        :name            "CL-0130 British Pale Ale #2"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "British Pale Ale, other British Ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Smooth, full bodied, well roundd ale yeast. Mild esters. Strong ferementer suitable for strong or spiced ales. Accentuates caramel and malt flavors."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0130"}))


(def cl-0150-british-real-ale
  "Great for real pub bitters. 
   
   Has a complex, woody flavor and musty ester profile that characterizes real ale. 
   Underattenuating to leave mild sweetness to the finish."
  (yeasts/build-yeasts :cl-0150-british-real-ale
                       {:min-temperature 16.67
                        :name            "CL-0150 British Real Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Bitters and other English Ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Great for real pub bitters. Has a complex, woody flavor and musty ester profile that characterizes real ale. Underattenuating to leave mild sweetness to the finish."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0150"}))


(def cl-0160-british-draft-ale
  "Full bodied, well rounded ale yeast with a touch of diacytl. 
   
   Emphasizes malt character. 
   Great for porters and bitters."
  (yeasts/build-yeasts :cl-0160-british-draft-ale
                       {:min-temperature 16.67
                        :name            "CL-0160 British Draft Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Porters and Bitters."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Full bodied, well rounded ale yeast with a touch of diacytl. Emphasizes malt character. Great for porters and bitters."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0160"}))


(def cl-0170-classic-british-ale
  "Complex ale with British tones and fruit like esters. 
   
   Works well in high gravity ales such as scottish heavy as well."
  (yeasts/build-yeasts :cl-0170-classic-british-ale
                       {:min-temperature 16.67
                        :name            "CL-0170 Classic British Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Bitters, Porters, Scottish Heavy Ales."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Complex ale with British tones and fruit like esters. Works well in high gravity ales such as scottish heavy as well."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0170"}))


(def cl-0200-scottish-ale
  "Use for classic Scottish heavys, 90's- or strong ales. 
   
   This yeast produces a soft, fruity malt profile with a subtle woody, oakey ester profile. 
   A mild, mineral like dryness in the finish makes this a very complex strain."
  (yeasts/build-yeasts :cl-0200-scottish-ale
                       {:min-temperature 15.56
                        :name            "CL-0200 Scottish Ale"
                        :max-temperature 20.0
                        :type            "Ale"
                        :best-for        "Scottish ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Use for classic Scottish heavys, 90's- or strong ales. This yeast produces a soft, fruity malt profile with a subtle woody, oakey ester profile. A mild, mineral like dryness in the finish makes this a very complex strain."
                        :flocculation    "High"
                        :form            "Liquid"
                        :product-id      "CL-0200"}))


(def cl-0240-irish-dry-stout
  "Top fermenting yeast which leaves a recognizable slightly woody character to Dry Stouts. 
   
   Vinous almost lactic character that blends well with roast malts. 
   High attenuation."
  (yeasts/build-yeasts :cl-0240-irish-dry-stout
                       {:min-temperature 16.67
                        :name            "CL-0240 Irish Dry Stout"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Dry Stouts"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Top fermenting yeast which leaves a recognizable slightly woody character to Dry Stouts. Vinous almost lactic character that blends well with roast malts. High attenuation."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0240"}))


(def cl-0260-canadian-ale
  "Clean, strong fermenting, well attenuated ale yeast that leaves a pleasant, fruity, complex finish."
  (yeasts/build-yeasts :cl-0260-canadian-ale
                       {:min-temperature 16.67
                        :name            "CL-0260 Canadian Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Light Canadian Ales, Bitish Bitter, Pale Ale, Porters"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Clean, strong fermenting, well attenuated ale yeast that leaves a pleasant, fruity, complex finish."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0260"}))


(def cl-0270-australian-ale
  "Produces a malty, bready, nutty character with a pleasant honey like finish. 
   
   This yeast emphasizes malt nuances and is very forgiving in warmer fermentations for those who cannot ferment under controlled conditions."
  (yeasts/build-yeasts :cl-0270-australian-ale
                       {:min-temperature 18.89
                        :name            "CL-0270 Australian Ale"
                        :max-temperature 24.44
                        :type            "Ale"
                        :best-for        "Australian styles"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Produces a malty, bready, nutty character with a pleasant honey like finish. This yeast emphasizes malt nuances and is very forgiving in warmer fermentations for those who cannot ferment under controlled conditions."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0270"}))


(def cl-0300-belgian-ale-1
  "Produces classic Belgian ale flavor. 
   
   Robust, estery with notes of clove and fruit. 
   Ferments well in high gravity worts."
  (yeasts/build-yeasts :cl-0300-belgian-ale-1
                       {:min-temperature 16.67
                        :name            "CL-0300 Belgian Ale #1"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Belgian Ales, High gravity ales."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Produces classic Belgian ale flavor. Robust, estery with notes of clove and fruit. Ferments well in high gravity worts."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0300"}))


(def cl-0320-belgian-ale-2
  "Flanders style yeast. 
   
   Strong fermenting yeast attenuates well and produces fruity, malty, estery malt profile. 
   Slow to flocculate."
  (yeasts/build-yeasts :cl-0320-belgian-ale-2
                       {:min-temperature 16.67
                        :name            "CL-0320 Belgian Ale #2"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Flanders style Belgian Ales, Belgian Brown, Fruit beers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Flanders style yeast. Strong fermenting yeast attenuates well and produces fruity, malty, estery malt profile. Slow to flocculate."
                        :flocculation    "Low"
                        :form            "Liquid"
                        :product-id      "CL-0320"}))


(def cl-0340-belgian-ale-3
  "Slightly more refined than CL-300. 
   
   Produces the classic Trappist ale character with esters of spice and fruit. 
   Mildly phenolic. 
   Strong fermenting yeast."
  (yeasts/build-yeasts :cl-0340-belgian-ale-3
                       {:min-temperature 16.67
                        :name            "CL-0340 Belgian Ale #3"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Belgian ales, Trappist Ales"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Slightly more refined than CL-300. Produces the classic Trappist ale character with esters of spice and fruit. Mildly phenolic. Strong fermenting yeast."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0340"}))


(def cl-0380-saison
  "Pleasant yeast blend. 
   
   Leaves a smooth full character to the malt with mild, but pleasant esters and some apple pie spices."
  (yeasts/build-yeasts :cl-0380-saison
                       {:min-temperature 16.67
                        :name            "CL-0380 Saison"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "French or Belgian Ales and Grand Cru styles."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Pleasant yeast blend. Leaves a smooth full character to the malt with mild, but pleasant esters and some apple pie spices."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0380"}))


(def cl-0400-old-german-ale
  "Traditional Alt Bier flavor. 
   
   Strong fermenter with a smooth, attenuated, mild flavor. 
   Slightly dry, clean, quenching finish."
  (yeasts/build-yeasts :cl-0400-old-german-ale
                       {:min-temperature 16.67
                        :name            "CL-0400 Old German Ale"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "Altbier, German ales, some Wheat beers."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Traditional Alt Bier flavor. Strong fermenter with a smooth, attenuated, mild flavor. Slightly dry, clean, quenching finish."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0400"}))


(def cl-0450-kolsch
  "Produces mild sulfer flavor which smooths with time to a clean attenuated flavor. 
   
   Mineral and malt characters come through well. 
   Clean, lightly yeasty flavor and aroma in the finish."
  (yeasts/build-yeasts :cl-0450-kolsch
                       {:min-temperature 16.67
                        :name            "CL-0450 Kolsch"
                        :max-temperature 22.22
                        :type            "Ale"
                        :best-for        "German Kolsch"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Produces mild sulfer flavor which smooths with time to a clean attenuated flavor. Mineral and malt characters come through well. Clean, lightly yeasty flavor and aroma in the finish."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0450"}))


(def cl-0600-original-pilsner
  "Full bodied lager yeast with sweet, underattenuated finish. 
   
   Subdued diacetyl character. 
   Big malty palatte. 
   Classic Pilsner finish and style."
  (yeasts/build-yeasts :cl-0600-original-pilsner
                       {:min-temperature 8.89
                        :name            "CL-0600 Original Pilsner"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "Classic Czech Pilsners"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Full bodied lager yeast with sweet, underattenuated finish. Subdued diacetyl character. Big malty palatte. Classic Pilsner finish and style."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0600"}))


(def cl-0620-american-megabrewery
  "Smooth yeast with a slight fruity flavor. 
   
   Lagers into a smooth, clean tasting beer. 
   Use for light, clean lager styles with unobtrusive yeast character."
  (yeasts/build-yeasts :cl-0620-american-megabrewery
                       {:min-temperature 8.89
                        :name            "CL-0620 American Megabrewery"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "Light, Clean American style lagers."
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Smooth yeast with a slight fruity flavor. Lagers into a smooth, clean tasting beer. Use for light, clean lager styles with unobtrusive yeast character."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0620"}))


(def cl-0630-american-microbrewery-lager
  "Strong fermenter. 
   
   Leaves a clean, full flavored, malty finish. 
   Slightly attenuative.
   Versatile for most lager styles with a clean full flavor."
  (yeasts/build-yeasts :cl-0630-american-microbrewery-lager
                       {:min-temperature 8.89
                        :name            "CL-0630 American Microbrewery Lager"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "All lager styles"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Strong fermenter. Leaves a clean, full flavored, malty finish. Slightly attenuative. Versatile for most lager styles with a clean full flavor."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0630"}))


(def cl-0650-old-bavarian-lager
  "Well rounded, malty with a subtle ester complex and citrus flavors. 
   
   Distinct, flavorful yeast is great for Southern German lager styles."
  (yeasts/build-yeasts :cl-0650-old-bavarian-lager
                       {:min-temperature 8.89
                        :name            "CL-0650 Old Bavarian Lager"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "German lagers, Bock, Dunkel, Helles"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Well rounded, malty with a subtle ester complex and citrus flavors. Distinct, flavorful yeast is great for Southern German lager styles."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0650"}))


(def cl-0660-northern-german-lager
  "Clean, crisp, traditional lager character.
   
   Strong fermenting and forgiving yeast. 
   Excellent general purpose lager yeast."
  (yeasts/build-yeasts :cl-0660-northern-german-lager
                       {:min-temperature 8.89
                        :name            "CL-0660 Northern German Lager"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "German pilsners, Mexican and Canadian Lagers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Clean, crisp, traditional lager character. Strong fermenting and forgiving yeast. Excellent general purpose lager yeast."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0660"}))


(def cl-0670-swiss-lager
  "A unique strain that has both a clean, crisp lager flavor and a soft, smooth maltiness. 
   
   Perfect for European Pilsners. 
   Like our CL-660 strain, this is an excellent all purpose Lager yeast for those wanting a fuller, rounder palate."
  (yeasts/build-yeasts :cl-0670-swiss-lager
                       {:min-temperature 8.89
                        :name            "CL-0670 Swiss Lager"
                        :max-temperature 12.22
                        :type            "Lager"
                        :best-for        "European pilsners and lagers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "A unique strain that has both a clean, crisp lager flavor and a soft, smooth maltiness. Perfect for European Pilsners. Like our CL-660 strain, this is an excellent all purpose Lager yeast for those wanting a fuller, rounder palate."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0670"}))


(def cl-0680-east-european-lager
  "Smooth, rich, creamy character. 
   
   Emphasizes big malt flavor and clean finish. 
   Full but smooth malt character."
  (yeasts/build-yeasts :cl-0680-east-european-lager
                       {:min-temperature 8.89
                        :name            "CL-0680 East European Lager"
                        :max-temperature 14.44
                        :type            "Lager"
                        :best-for        "Marzens, Oktoberfest"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Smooth, rich, creamy character. Emphasizes big malt flavor and clean finish. Full but smooth malt character."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0680"}))


(def cl-0690-california-esteem-gold
  "Use for California Common Beers (aka Steam Beer). 
   
   Leaves a slightly estery, well attenuated finish. 
   Quite distinct in flavor. 
   Can also be used for complex porters."
  (yeasts/build-yeasts :cl-0690-california-esteem-gold
                       {:min-temperature 8.89
                        :name            "CL-0690 California Esteem (Gold)"
                        :max-temperature 18.33
                        :type            "Lager"
                        :best-for        "California Common Beer, American or Robust porters"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Use for California Common Beers (aka Steam Beer). Leaves a slightly estery, well attenuated finish. Quite distinct in flavor. Can also be used for complex porters."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0690"}))


(def cl-0900-belgian-wheat
  "Top fermenting yeast with a soft bread-like character. 
   
   Leaves a sweet, mildly estery finish. 
   Delicious Belgian character to any beer. 
   Great in Wit style with coriander and bitter orange peel."
  (yeasts/build-yeasts :cl-0900-belgian-wheat
                       {:min-temperature 12.78
                        :name            "CL-0900 Belgian Wheat"
                        :max-temperature 20.0
                        :type            "Wheat"
                        :best-for        "Belgian Pils, Belgian Wit"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Top fermenting yeast with a soft bread-like character. Leaves a sweet, mildly estery finish. Delicious Belgian character to any beer. Great in Wit style with coriander and bitter orange peel."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0900"}))


(def cl-0920-german-wheat-bt
  "Top fermenting Weizenbier yeast. 
   
   Intensely spicy, clovey and phenolic. 
   High attenuation."
  (yeasts/build-yeasts :cl-0920-german-wheat-bt
                       {:min-temperature 12.78
                        :name            "CL-0920 German Wheat BT"
                        :max-temperature 20.0
                        :type            "Wheat"
                        :best-for        "Weizen, Weizenbocks"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Top fermenting Weizenbier yeast. Intensely spicy, clovey and phenolic. High attenuation."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0920"}))


(def cl-0930-german-weiss
  "Milder than German Wheat #1, this strain still produces the desired clove and phenol character, but to a lesser degree. 
   
   Full, earthy character."
  (yeasts/build-yeasts :cl-0930-german-weiss
                       {:min-temperature 12.78
                        :name            "CL-0930 German Weiss"
                        :max-temperature 20.0
                        :type            "Wheat"
                        :best-for        "Weiss, Weizen, other Southern German Wheat styles"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Milder than German Wheat #1, this strain still produces the desired clove and phenol character, but to a lesser degree. Full, earthy character."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-0930"}))


(def cl-0980-american-white-ale
  "Smooth wheat yeast with a round, clean, malt flavor. 
   
   Low flocculation leaves cloudy Hefe-Weizen finish. 
   Smooth flavor makes a great unfiltered wheat beer."
  (yeasts/build-yeasts :cl-0980-american-white-ale
                       {:min-temperature 12.78
                        :name            "CL-0980 American White Ale"
                        :max-temperature 20.0
                        :type            "Wheat"
                        :best-for        "Hefe-Weizen, American Wheat"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Smooth wheat yeast with a round, clean, malt flavor. Low flocculation leaves cloudy Hefe-Weizen finish. Smooth flavor makes a great unfiltered wheat beer."
                        :flocculation    "Low"
                        :form            "Liquid"
                        :product-id      "CL-0980"}))


(def cl-5200-brettanomyces-lambicus
  "Wild yeast strain associated with Belgian breweries. 
   
   Contributes horsey, old leather flavor complex to Belgian lambics. 
   Slow growing yeast that takes weeks to ferment and months to develop fully."
  (yeasts/build-yeasts :cl-5200-brettanomyces-lambicus
                       {:min-temperature 8.89
                        :name            "CL-5200 Brettanomyces Lambicus"
                        :max-temperature 20.0
                        :type            "Ale"
                        :best-for        "Belgian Lambic beers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Wild yeast strain associated with Belgian breweries. Contributes horsey, old leather flavor complex to Belgian lambics. Slow growing yeast that takes weeks to ferment and months to develop fully."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-5200"}))


(def cl-5600-pediococcus-damnosus
  "Slow growing bacteria used in secondary to create lactic acid flavor in Belgian lambics. 
   
   Produces large amounts of lactic acid and diacytl. 
   Prefers anaerobic conditions."
  (yeasts/build-yeasts :cl-5600-pediococcus-damnosus
                       {:min-temperature 8.89
                        :name            "CL-5600 Pediococcus Damnosus"
                        :max-temperature 20.0
                        :type            "Ale"
                        :best-for        "Belgian Lambic beers"
                        :laboratory      "Brewtek"
                        :attenuation     0.765
                        :notes           "Slow growing bacteria used in secondary to create lactic acid flavor in Belgian lambics. Produces large amounts of lactic acid and diacytl. Prefers anaerobic conditions."
                        :flocculation    "Medium"
                        :form            "Liquid"
                        :product-id      "CL-5600"}))


(def brewtek
  "Data for yeasts cultivated by Brewtek.
   https://brewtek.se/sv/"
  (merge cl-0010-american-microbrewery-ale-1
         cl-0020-american-microbrewery-ale-2
         cl-0050-california-pub-ale
         cl-0060-north-eastern-micro-ale
         cl-0110-british-microbrewery-ale
         cl-0120-british-pale-ale-1
         cl-0130-british-pale-ale-2
         cl-0150-british-real-ale
         cl-0160-british-draft-ale
         cl-0170-classic-british-ale
         cl-0200-scottish-ale
         cl-0240-irish-dry-stout
         cl-0260-canadian-ale
         cl-0270-australian-ale
         cl-0300-belgian-ale-1
         cl-0320-belgian-ale-2
         cl-0340-belgian-ale-3
         cl-0380-saison
         cl-0400-old-german-ale
         cl-0450-kolsch
         cl-0600-original-pilsner
         cl-0620-american-megabrewery
         cl-0630-american-microbrewery-lager
         cl-0650-old-bavarian-lager
         cl-0660-northern-german-lager
         cl-0670-swiss-lager
         cl-0680-east-european-lager
         cl-0690-california-esteem-gold
         cl-0900-belgian-wheat
         cl-0920-german-wheat-bt
         cl-0930-german-weiss
         cl-0980-american-white-ale
         cl-5200-brettanomyces-lambicus
         cl-5600-pediococcus-damnosus))
