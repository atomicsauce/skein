(defproject skein "0.1.0-SNAPSHOT"
  :description "A wiki written in Clojure."
  :url "https://github.com/atomicsauce/skein"
  :license {:name "BSD 2-Clause \"Simplified\" License"
            :url "https://github.com/atomicsauce/skein/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot skein.core
  :target-path "target/%s"
  :aliases {"unit" ["test"]}
  :profiles {:uberjar {:aot :all}
             :prebuild {:plugins [[lein-ancient "0.6.15"]
                                 [lein-bikeshed "0.5.1"]
                                 [lein-cljfmt "0.5.7"]
                                 [jonase/eastwood "0.2.5"]
                                 [lein-kibit "0.1.6"]
                                 [lein-cloverage "1.0.10"]]}})
