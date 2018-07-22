(ns org.atomicsauce.skein.prd-middleware
  (:require [ring.middleware.reload :refer [wrap-reload]]
            [selmer.middleware :refer [wrap-error-page]]
            [prone.middleware :refer [wrap-exceptions]]))

(defn wrap-prd [handler]
  (-> handler))
