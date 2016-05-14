(defproject user-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-json "0.4.0"]
                 [ring-cors "0.1.7"]
                 [crypto-password "0.2.0"]
                 [org.clojure/java.jdbc "0.6.0-rc1"]
                 [postgresql "9.3-1102.jdbc41"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler user-service.handler/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.3.0"]]}})
