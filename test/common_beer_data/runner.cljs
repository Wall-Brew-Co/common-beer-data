(ns common-beer-data.runner
  "The test runner behind `doo`.
   This namespace executes tests in a ClojureScript environment."
  (:require [common-beer-data.core-test]
            [common-beer-data.fermentables.adjuncts-test]
            [common-beer-data.fermentables.dry-extracts-test]
            [common-beer-data.fermentables.extracts-test]
            [common-beer-data.fermentables.grains-test]
            [common-beer-data.fermentables.sugars-test]
            [common-beer-data.hops.aroma-test]
            [common-beer-data.hops.bittering-test]
            [common-beer-data.hops.both-test]
            [common-beer-data.yeasts.brewtek-test]
            [common-beer-data.yeasts.dcl-fermentis-test]
            [common-beer-data.yeasts.lallemand-test]
            [common-beer-data.yeasts.white-labs-test]
            [common-beer-data.yeasts.wyeast-test]
            [doo.runner :refer-macros [doo-tests]]))


(doo-tests 'common-beer-data.core-test
           'common-beer-data.fermentables.adjuncts-test
           'common-beer-data.fermentables.dry-extracts-test
           'common-beer-data.fermentables.extracts-test
           'common-beer-data.fermentables.grains-test
           'common-beer-data.fermentables.sugars-test
           'common-beer-data.hops.aroma-test
           'common-beer-data.hops.bittering-test
           'common-beer-data.hops.both-test
           'common-beer-data.yeasts.brewtek-test
           'common-beer-data.yeasts.dcl-fermentis-test
           'common-beer-data.yeasts.lallemand-test
           'common-beer-data.yeasts.white-labs-test
           'common-beer-data.yeasts.wyeast-test)
