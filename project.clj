(defproject tasker "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.4"]
                 [mbriggs/ring-json-params "0.1.6"]
                 [clj-json "0.5.0"]]
  :plugins [[lein-ring "0.7.0"]]
  :ring {:handler tasker.core/app})
