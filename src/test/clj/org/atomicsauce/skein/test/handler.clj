(ns org.atomicsauce.skein.test.handler
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [org.atomicsauce.skein.handler :refer :all]
            [mount.core :as mount]))

(use-fixtures
  :once
  (fn [f]
    (mount/start #'org.atomicsauce.skein.config/env
                 #'org.atomicsauce.skein.handler/app)
    (f)))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= 200 (:status response)))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= 404 (:status response))))))
