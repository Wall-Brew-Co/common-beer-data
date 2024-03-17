(ns ^:no-doc common-beer-data.hops.hops
  "Function to help minimize repeated data in hop entry."
  {:added  "1.0"
   :no-doc true}
  (:require [common-beer-format.hops :as cbf]))


(def ^:private hop-defaults
  "To generate complete records that match the ::hop spec, we have defaulted the following:
   :use  - 'boil'
   cbf/form - 'pellet'
   :time - 0"
  {cbf/version 1
   cbf/amount  0.0
   cbf/time    0.0
   cbf/use     "Boil"
   cbf/form    "Pellet"})


(defn build-hop
  "Given a hop-key and hop-data, return a map that is a complete hop record.
   The hop-data is merged with the hop-defaults to ensure that the hop record is complete."
  {:no-doc true}
  [hop-key hop-data]
  {hop-key (merge hop-defaults hop-data)})
