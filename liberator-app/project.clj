(defproject liberator-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler liberator-app.core/handler}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [liberator "0.15.3"]
                 [compojure "1.6.2"]
                 [ring/ring-core "1.9.2"]]
  :repl-options {:init-ns liberator-app.core})
