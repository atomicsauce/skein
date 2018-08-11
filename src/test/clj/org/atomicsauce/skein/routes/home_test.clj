(ns org.atomicsauce.skein.routes.home-test
  (:use midje.sweet)
  (:require [org.atomicsauce.skein.routes.home :as home]))

;;;(facts "about routes"
;;;       (fact "there is a home page"
;;;             (:status (home-routes {:request-method :get :uri "/home"}))
;;;             => 200))
