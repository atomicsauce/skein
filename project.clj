(defproject org.atomicsauce/skein "0.1.0-SNAPSHOT"

  :description "A wiki written in Clojure."
  :url "https://github.com/atomicsauce/skein"
  :license {:name "BSD 2-Clause \"Simplified\" License"
            :url "https://github.com/atomicsauce/skein/blob/master/LICENSE.txt"}
  :min-lein-version "2.0.0"

  :dependencies [[clj-time "0.14.4"]
                 [com.h2database/h2 "1.4.197"]
                 [compojure "1.6.1"]
                 [conman "0.8.2"]
                 [cprop "0.1.11"]
                 [funcool/struct "1.3.0"]
                 [luminus-immutant "0.2.4"]
                 [luminus-migrations "0.5.2"]
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
                 [org.webjars/bootstrap "4.1.2"]
                 [org.webjars/font-awesome "5.2.0"]
                 [org.webjars/jquery "3.3.1-1"]
                 [org.webjars/webjars-locator "0.34"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.2"]
                 [selmer "1.11.8"]]

  :plugins [[lein-immutant "2.1.0"]]

  :source-paths ["src/main/clj"]
  :resource-paths ["src/main/resources"]
  :test-paths ["src/test/clj"]
  :target-path "target/%s"
  :main ^:skip-aot org.atomicsauce.skein.core

  :aliases {"unit" ["test"]}
  
  :profiles {:prebuild {:jvm-opts ["-Dconf=config-prebuild.edn"]
                        :dependencies [[ring/ring-mock "0.3.2"]]
                        :plugins [[lein-ancient "0.6.15"]
                                  [lein-bikeshed "0.5.1"]
                                  [lein-cljfmt "0.5.7"]
                                  [jonase/eastwood "0.2.5"]
                                  [lein-kibit "0.1.6"]
                                  [lein-cloverage "1.0.10"]]
                        :repl-options {}
                        :injections []
                        :source-paths ["profiles/prebuild/clj"]
                        :resource-paths ["profiles/prebuild/resources"]}

             :development {:jvm-opts ["-Dconf=config-development.edn"]
                           :dependencies [[expound "0.7.1"]
                                          [pjstadig/humane-test-output "0.8.3"]
                                          [prone "1.6.0"]
                                          [ring/ring-devel "1.6.3"]
                                          [ring/ring-mock "0.3.2"]]
                           :plugins [[com.jakemccrary/lein-test-refresh "0.19.0"]]
                           :repl-options {:init-ns user}
                           :injections [(require 'pjstadig.humane-test-output)
                                        (pjstadig.humane-test-output/activate!)]
                           :source-paths ["profiles/development/clj"]
                           :resource-paths ["profiles/development/resources"]}

             :production {:jvm-opts ["-Dconf=config-production.edn"]
                          :dependencies []
                          :plugins []
                          :repl-options {}
                          :injections []
                          :source-paths ["profiles/production/clj"]
                          :resource-paths ["profiles/production/resources"]}}

             ;;; below here will need revision once we're deploying to actual environments
             ;;; :uberjar {:omit-source true
             ;;;           :aot :all
             ;;;           :uberjar-name "skein-%s.jar"
             ;;;           :source-paths ["profiles/production/clj"]
             ;;;           :resource-paths ["profiles/production/resources"]}}

  )
