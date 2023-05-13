(ns datomic-test.core
  (:require
   [datomic.client.api :as d]))

(def cfg {:server-type :dev-local
          :system "dev"})

(def client (d/client cfg))

(def dbconf {:db-name "tutorial"})

(d/create-database client dbconf)

(def conn (d/connect client dbconf))
