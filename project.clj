(defproject com.wallbrew/common-beer-data "1.5.0"
  :description "A repository of common-beer-format data."
  :url "https://github.com/Wall-Brew-Co/common-beer-data"
  :license {:name         "MIT"
            :url          "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments     "Same-as all Wall-Brew projects"}
  :scm {:name "git"
        :url  "https://github.com/Wall-Brew-Co/common-beer-data"}
  :dependencies [[com.wallbrew/common-beer-format "2.3.0"]
                 [org.clojure/clojure "1.11.3"]
                 [org.clojure/clojurescript "1.11.132" :scope "provided"]]
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2024.05.24"]
            [com.wallbrew/lein-sealog "1.6.0"]
            [lein-cljsbuild "1.1.8"]
            [lein-project-version "0.1.0"]
            [mvxcvi/cljstyle "0.16.630"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[com.wallbrew/spoon "1.2.3"]
                                      [doo "0.1.11"]
                                      [org.clojure/spec.alpha "0.5.238"]]
                       :plugins      [[lein-doo "0.1.11"]]}
             :export  {:source-paths ["src" "dev"]
                       :dependencies [[cheshire "5.13.0"]
                                      [com.wallbrew/clj-xml "1.9.1"]]}}

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
