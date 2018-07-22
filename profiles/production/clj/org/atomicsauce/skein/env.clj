(ns org.atomicsauce.skein.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [org.atomicsauce.skein.prd-middleware :refer [wrap-prd]]))

(def defaults
  {:init
   (fn []
     (parser/cache-on!)
     (log/info "\n-=[skein production started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[skein shut down successfully]=-"))
   :middleware wrap-prd})
