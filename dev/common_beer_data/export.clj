(ns common-beer-data.export
  "Development time utility to export data to JSON."
  (:require [cheshire.core :as cheshire]
            [clj-xml.core :as xml]
            [clojure.data.xml.jvm.pprint :as xml.pprint]
            [clojure.java.io :as io]
            [common-beer-data.core :as core]))


(def fermentables
  "Take common-beer-data and wrap it as a `:fermentables` map."
  (->> core/all-fermentables
       vals
       (map (fn [f] {:fermentable f}))
       (assoc {} :fermentables)))


(def hops
  "Take common-beer-data and wrap it as a `:hops` map."
  (->> core/all-hops
       vals
       (map (fn [h] {:hop h}))
       (assoc {} :hops)))


(def yeasts
  "Take common-beer-data and wrap it as a `:yeasts` map."
  (->> core/all-yeasts
       vals
       (map (fn [y] {:yeast y}))
       (assoc {} :yeasts)))


(def styles
  "Take common-beer-data and wrap it as a `:styles` map."
  (->> core/all-style-guides
       vals
       (map (fn [s] {:style s}))
       (assoc {} :styles)))


(defn ->json-file
  "Exports the data in the app into JSON files."
  [file-path data]
  (println "Exporting JSON data to" file-path)
  (io/make-parents file-path)
  (spit file-path (cheshire/generate-string data {:pretty true})))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn ->json
  "Exports the data in the app into JSON strings."
  []
  (->json-file "exports/json/fermentables.json" fermentables)
  (->json-file "exports/json/hops.json" hops)
  (->json-file "exports/json/yeasts.json" yeasts)
  (->json-file "exports/json/styles.json" styles))


(defn ->xml-file
  "Exports the data in the app into XML files."
  [file-path data]
  (println "Exporting XML data to" file-path)
  (io/make-parents file-path)
  (with-open [out (io/writer file-path)]
    (xml.pprint/indent-xml (xml/edn->xml-str data {:to-xml-case? true :stringify-values? true}) out)))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn ->xml
  "Exports the data in the app into XML strings."
  []
  (->xml-file "exports/xml/fermentables.xml" fermentables)
  (->xml-file "exports/xml/hops.xml" hops)
  (->xml-file "exports/xml/yeasts.xml" yeasts)
  (->xml-file "exports/xml/styles.xml" styles))
