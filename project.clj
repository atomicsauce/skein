(defproject org.atomicsauce/skein "0.1.0-SNAPSHOT"

  :description "A wiki written in Clojure."
  :url "https://github.com/atomicsauce/skein"
  :license {:name "BSD 2-Clause \"Simplified\" License"
            :url "https://github.com/atomicsauce/skein/blob/master/LICENSE.txt"}
  :min-lein-version "2.0.0"

  :dependencies [[clj-time "0.14.4"]
                 [compojure "1.6.1"]
                 [cprop "0.1.11"]
                 [funcool/struct "1.3.0"]
                 [luminus-immutant "0.2.4"]
                 [luminus-nrepl "0.1.4"]
                 [luminus/ring-ttl-session "0.3.2"]
                 [markdown-clj "1.0.2"]
                 [metosin/muuntaja "0.5.0"]
                 [metosin/ring-http-response "0.9.0"]
                 [mount "0.1.12"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "4.1.0"]
                 [org.webjars/font-awesome "5.0.13"]
                 [org.webjars/jquery "3.3.1-1"]
                 [org.webjars/webjars-locator "0.34"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.2"]
                 [selmer "1.11.7"]]

  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :resource-paths ["resources"]
  :target-path "target/%s/"
  :main ^:skip-aot skein.core

  :profiles {:uberjar {:omit-source true
                       :aot :all}

             :prebuild {:dependencies []
                        :plugins [[lein-ancient "0.6.15"]
                                 [lein-bikeshed "0.5.1"]
                                 [lein-cljfmt "0.5.7"]
                                 [jonase/eastwood "0.2.5"]
                                 [lein-kibit "0.1.6"]
                                 [lein-cloverage "1.0.10"]]
                        :source-paths ["profiles/prebuild/clj"]
                        :resource-paths ["profiles/prebuild/resources"]}

             :build {:dependencies [[prone "1.6.0"]
                                    [ring/ring-devel "1.6.3"]
                                    [ring/ring-mock "0.3.2"]]
                     :plugins []
                     :source-paths ["profiles/build/clj"]
                     :resource-paths ["profiles/build/resources"]}}

  :aliases {"unit" ["test"]})
