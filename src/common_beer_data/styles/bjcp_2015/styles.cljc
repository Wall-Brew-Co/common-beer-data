(ns ^:no-doc common-beer-data.styles.bjcp-2015.styles
  "Function to help minimize repeated data in 2015 BJCP style guidelines"
  {:added "1.0"}
  (:require [common-beer-format.styles :as cbf]))


(def ^:private style-defaults
  {cbf/version     1
   cbf/style-guide "BJCP 2015"})


(defn build-style
  "Construct a style, including display/range values derived from core style data"
  [style-key style-data]
  (let [carb-range        (str (cbf/carb-min style-data) "-" (cbf/carb-max style-data) " Vols")
        og-range          (str (cbf/og-min style-data) "-" (cbf/og-max style-data) " SG")
        fg-range          (str (cbf/fg-min style-data) "-" (cbf/fg-max style-data) " SG")
        abv-range         (str (cbf/abv-min style-data) "% - " (cbf/abv-max style-data) "%")
        ibu-range         (str (cbf/ibu-min style-data) "-" (cbf/ibu-max style-data) " IBUs")
        color-range       (str (cbf/color-min style-data) "-" (cbf/color-max style-data) " SRM")
        display-color-min (str (cbf/color-min style-data) " SRM")
        display-color-max (str (cbf/color-max style-data) " SRM")
        display-og-min    (str (cbf/og-min style-data) " SG")
        display-og-max    (str (cbf/og-max style-data) " SG")
        display-fg-min    (str (cbf/fg-min style-data) " SG")
        display-fg-max    (str (cbf/fg-max style-data) " SG")
        base-style        (merge style-defaults style-data)
        style-def         (assoc base-style
                                 cbf/carb-range        carb-range
                                 cbf/og-range          og-range
                                 cbf/fg-range          fg-range
                                 cbf/abv-range         abv-range
                                 cbf/ibu-range         ibu-range
                                 cbf/color-range       color-range
                                 cbf/display-color-min display-color-min
                                 cbf/display-color-max display-color-max
                                 cbf/display-og-min    display-og-min
                                 cbf/display-og-max    display-og-max
                                 cbf/display-fg-min    display-fg-min
                                 cbf/display-fg-max    display-fg-max)]
    {style-key style-def}))
