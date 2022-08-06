# common-beer-data

[![Clojars Project](https://img.shields.io/clojars/v/com.wallbrew/common-beer-data.svg)](https://clojars.org/com.wallbrew/common-beer-data)
![GitHub Runner](https://github.com/Wall-Brew-Co/common-beer-data/workflows/Clojurescript%20CI/badge.svg)

A repository of [common-beer-format](https://github.com/Wall-Brew-Co/common-beer-format) data for use in Clojure brewing applications.

This repository follows the guidelines and standards of the [Wall Brew Open Source Policy.](https://github.com/Wall-Brew-Co/open-source "Our open source guidelines")

## Installation

A deployed copy of the most recent version of [common-beer-data can be found on clojars.](https://clojars.org/com.wallbrew/common-beer-data)
To use it, add the following as a dependency in your project.clj file:

[![Clojars Project](https://clojars.org/com.wallbrew/common-beer-data/latest-version.svg)](https://clojars.org/com.wallbrew/common-beer-data)

The next time you build your application, [Leiningen](https://leiningen.org/) or [deps.edn](https://clojure.org/guides/deps_and_cli) should pull it automatically.
Alternatively, you may clone or fork the repository to work with it directly.

## Usage

`common-beer-data.core` contains all of the references required to load any of the data in `common-beer-data`.
Individual data namespaces may be requied and used when convenient.

For example:

```clj
(:require [common-beer-data.core :as beer])

(beer/get-fermentable :barley-flaked)

{:amount           0.0
 :yield            0.7
 :color            2
 :potential        1.032
 :name             "Barley, Flaked"
 :moisture         0.09
 :type             "Grain"
 :add-after-boil   false
 :notes            "Adds significant body to Porters and Stouts. High haze producing protein prevents use in light beers."
 :protein          0.135
 :coarse-fine-diff 0.015
 :version          1
 :max-in-batch     0.2
 :recommend-mash   true
 :diastatic-power  0}

(-> beer/all-hops keys sort first beer/get-hop)
{:amount        0.0
 :beta          0.05
 :use           "boil"
 :name          "Ahtanum"
 :cohumulone    0.3
 :time          0.0
 :type          "aroma"
 :myrcene       0.5
 :humulene      0.18
 :hsi           0.5
 :notes         "Distinct grapefruit scent and flavor."
 :caryophyllene 0.1
 :alpha         0.057
 :form          "pellet"
 :version       1
 :substitutes   "Willamette, Centennial, Cascade"}
```

### Data Sources

This data was collected during the data scraping while making the [NormAleIzed Märzen](https://wallbrew.com/2019/11/21/mk-iv-normaleized-marzen/) recipe.
Information for ingredients was sourced from manufacturers when possible, but some common ingredients (for example, 2-Row) had multiple sources of manufacturing data.
To that end, a few sources were aggregated to closely approximate what would be available to the average homebrewer.
For this reason, you may notice differences between this repository and what is available in your part of the world.

If you believe an entry in `common-beer-data` is far out-of bounds, please [submit an issue](https://github.com/Wall-Brew-Co/common-beer-data/issues/new/choose) and link to the source of your information.

#### Missing Data

Since this data was gathered at a set moment in time, it reflects what was available and commercially available.
Homebrewing changes frequently, and new hop varieties, yeast strains, and malted sugars become available regularly.
If there is an ingredient missing in this repository that you'd like to see added, please [submit an issue](https://github.com/Wall-Brew-Co/common-beer-data/issues/new/choose) and link to the most authoritative source for that ingredient's specification that you can find.

## License

Copyright © 2022 - [Wall Brew Co](https://wallbrew.com/)

This software is provided for free, public use as outlined in the [MIT License](https://github.com/Wall-Brew-Co/common-beer-data/blob/master/LICENSE)
