(defproject datomic-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.datomic/client-cloud "1.0.123"]
                 [com.datomic/dev-local "1.0.243"]]
  :repl-options {:init-ns datomic-test.core}
  :repositories [
                ["cognitect-dev-tools" {:url      "https://dev-tools.cognitect.com/maven/releases/"
                                        :username :env
                                        :password :env}]])
