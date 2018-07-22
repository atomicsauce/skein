(ns user
  (:require [org.atomicsauce.skein.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [org.atomicsauce.skein.core :refer [start-app]]
            [org.atomicsauce.skein.db.core]
            [conman.core :as conman]
            [luminus-migrations.core :as migrations]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'org.atomicsauce.skein.core/repl-server))

(defn stop []
  (mount/stop-except #'org.atomicsauce.skein.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn restart-db []
  (mount/stop #'org.atomicsauce.skein.db.core/*db*)
  (mount/start #'org.atomicsauce.skein.db.core/*db*)
  (binding [*ns* 'org.atomicsauce.skein.db.core]
    (conman/bind-connection org.atomicsauce.skein.db.core/*db*
                            "sql/queries.sql")))

(defn reset-db []
  (migrations/migrate ["reset"] (select-keys env [:database-url])))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))

(defn create-migration [name]
  (migrations/create name (select-keys env [:database-url])))
