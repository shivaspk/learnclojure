(ns rest-app.core (:require [liberator.core :refer [resource defresource]]
                            [liberator.dev :refer [wrap-trace]]
                            [ring.middleware.params :refer [wrap-params]]
                            [compojure.core :refer [defroutes ANY]]
                            [clojure-csv.core :as csv]))


(def employees-ref (atom []))

(defn addemployee [empid name]
  (swap! employees-ref conj {:empid empid :empname name}))

(addemployee "1" "Rakesh Sharma")

(defresource employees []
  :allowed-methods [:get :post]
  :available-media-types ["application/json"]
  :post! @employees-ref
  :handle-created (fn [ctx]
                            (format (str "{body: %s a: 1 b: 4}"), "the body part"))
 ;; :post-redirect? (fn [ctx] {:location (format "/employees/1")})
  :handle-ok @employees-ref
  :handle-not-found {:error "ID is not found"})

(defresource employee [empid]
  :allowed-methods [:get :put :delete]
  :available-media-types ["application/json"]
  :exists? (fn [_] (let [result (get @employees-ref {:empid empid})]
                      (if-not (nil? result) {::entry result}) 
                      ))
  :handle-ok ::entry
  :handle-not-found {:error "ID is not found"})

(defroutes app
  (ANY "/" [] (resource))
  (ANY "/employees" [] (employees))
  (ANY "/employees/:empid" [empid] (employee empid)))


(def handler
  (-> app
      wrap-params))