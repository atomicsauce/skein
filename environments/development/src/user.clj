(ns user
  (:require [skein.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [skein.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'skein.core/repl-server))

(defn stop []
  (mount/stop-except #'skein.core/repl-server))

(defn restart []
  (stop)
  (start))
