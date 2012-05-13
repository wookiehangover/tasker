(ns tasker.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [clj-json.core :as json]))

(defroutes main-routes
  (GET "/" [] (json/generate-string {"foo" "bar"}))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site main-routes))
