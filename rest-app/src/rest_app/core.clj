(ns rest-app.core (:require [liberator.core :refer [resource defresource]]
                                 [liberator.dev :refer [wrap-trace]]
                                 [ring.middleware.params :refer [wrap-params]]
                                 [compojure.core :refer [defroutes ANY]]
                                 [clojure-csv.core :as csv]))

;; (def customer-ref (ref {:siva {:name "Siva" :city "Bangalore"} 
;;                         :vijay {:name "Vijay" :city "Bangalore"}}))

;; (defresource customers
;;   :allowed-methods [:get]
;;   :available-media-types ["application/json"]
;;   :exists? (fn [_] (let [result @customer-ref]
;;                      (if-not (nil? result) {::entry result})))
;;   :handle-ok ::entry
;;   :handle-not-found {:error "ID is not found"}
;; )

(def employees (atom []))

(defn addemployee [empid name]
  (swap! employees conj {:empid empid :empname name}))

(addemployee "Q123" "Rakesh Sharma")

(defn getemployees [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body  @employees})


(defn addemployeetoatom [empid empname]
  (swap! employees conj {:empid empid :empname empname}))

(defroutes app
   (ANY "/employees" []
     (resource
      :allowed-methods [:post :get]
      :available-media-types ["application/json"]
      :handle-ok @employees
      
      ;; :post! (fn [ctx]
      ;;          (dosync
      ;;           (let [body (slurp (get-in ctx [:request :body]))
      ;;                 id   (count (alter posts conj body))]
      ;;             {::id id})))
        ;; actually http requires absolute urls for redirect but let's
        ;; keep things simple.
      ;;:post-redirect? (fn [ctx] {:location (format "/postbox/%s" (::id ctx))})
      ))
  )

(def handler
  (-> app
      wrap-params))