(ns org.atomicsauce.skein.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [org.atomicsauce.skein.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[skein develoment started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[skein shut down successfully]=-"))
   :middleware wrap-dev})
