(ns org.atomicsauce.skein.routes.home-test
  (:use midje.sweet)
  (:require [org.atomicsauce.skein.routes.home :as home]))

;;;(fact "Homepage Test"
;;;      (:status (main-routes {:request-method :get :uri "/user/Michael")) => 200)

;;;(facts "about routes"
;;;       
;;;  (fact "there is a home page"
;;;    (first-element [1 2 3] :default) => 1
;;;    (first-element '(1 2 3) :default) => 1)

(facts "about routes"

       (fact "there is a home page"
             (:status (home-routes {:request-method :get :uri "/home"})) => 200)

       


       )

