(defproject com.wallbrew/common-beer-data "1.6.1"
  :description "A repository of common-beer-format data."
  :url "https://github.com/Wall-Brew-Co/common-beer-data"
  :license {:name         "MIT"
            :url          "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments     "Same-as all Wall-Brew projects"}
  :scm {:name "git"
        :url  "https://github.com/Wall-Brew-Co/common-beer-data"}
  :global-vars {*warn-on-reflection* true}
  :pom-addition [:organization
                 [:name "Wall Brew Co."]
                 [:url "https://wallbrew.com"]]
  :dependencies [[com.wallbrew/common-beer-format "2.6.0"]
                 [org.clojure/clojure "1.12.4"]
                 [org.clojure/clojurescript "1.12.134" :scope "provided"]]
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2025.12.23"]
            [com.wallbrew/bouncer "1.2.0"]
            [com.wallbrew/lein-sealog "1.9.0"]
            [lein-cljsbuild/lein-cljsbuild "1.1.8"]
            [mvxcvi/cljstyle "0.17.642"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[com.wallbrew/spoon "1.5.0"]
                                      [doo/doo "0.1.11"]
                                      [org.clojure/spec.alpha "0.6.249"]]
                       :plugins      [[lein-doo/lein-doo "0.1.11"]]}
             :export  {:source-paths ["src" "dev"]
                       :dependencies [[cheshire/cheshire "6.1.0"]
                                      [com.wallbrew/clj-xml "1.13.0"]]}}

  :min-lein-version "2.5.3"
  :deploy-branches ["master"]
  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]]
  :aliases {"test-build" ["do" "clean" ["cljsbuild" "once" "test"] ["doo" "once"] ["test"]]
            "build-json" ["with-profile" "export" "run" "-m" "common-beer-data.export/->json"]
            "build-xml"  ["with-profile" "export" "run" "-m" "common-beer-data.export/->xml"]}

  :cljsbuild {:builds [{:id           "test"
                        :source-paths ["src" "test"]
                        :compiler     {:main           "common-beer-data.runner"
                                       :output-to      "target/test/app.js"
                                       :output-dir     "target/test/js/compiled/out"
                                       :optimizations  :none
                                       :parallel-build true}}]}

  :doo {:build "test"
        :alias {:default [:chrome-headless-no-sandbox]}
        :paths {:karma "./node_modules/karma/bin/karma"}
        :karma {:launchers {:chrome-headless-no-sandbox {:plugin "karma-chrome-launcher"
                                                         :name   "ChromeHeadlessNoSandbox"}}
                :config    {"captureTimeout"             210000
                            "browserDisconnectTolerance" 3
                            "browserDisconnectTimeout"   210000
                            "browserNoActivityTimeout"   210000
                            "customLaunchers"            {"ChromeHeadlessNoSandbox" {"base"  "ChromeHeadless"
                                                                                     "flags" ["--no-sandbox" "--disable-dev-shm-usage"]}}}}})
