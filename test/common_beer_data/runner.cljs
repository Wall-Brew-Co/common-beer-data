(ns common-beer-data.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [common-beer-data.core-test]))


(doo-tests 'common-beer-data.core-test)
