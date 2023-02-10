(ns common-beer-data.runner
  "The test runner behind `doo`.
   This namespace executes tests in a ClojureScript environment."
  (:require [common-beer-data.core-test]
            [common-beer-data.fermentables.adjuncts-test]
            [common-beer-data.fermentables.dry-extracts-test]
            [common-beer-data.fermentables.extracts-test]
            [common-beer-data.fermentables.grains-test]
            [common-beer-data.fermentables.sugars-test]
            [doo.runner :refer-macros [doo-tests]]))


(doo-tests 'common-beer-data.core-test
           'common-beer-data.fermentables.adjuncts-test
           'common-beer-data.fermentables.dry-extracts-test
           'common-beer-data.fermentables.extracts-test
           'common-beer-data.fermentables.grains-test
           'common-beer-data.fermentables.sugars-test)
