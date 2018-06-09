(ns skein.env
  (:require [clojure.tools.logging :as log]))

(def defaults {:init (fn [] (log/info "\n-=[skein started successfully]=-"))
               :stop (fn p[] (log/info "\n-=[skein stopped successfully]=-"))
               :middleware identity})
