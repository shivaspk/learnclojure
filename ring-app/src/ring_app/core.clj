(ns ring-app.core
  (:require [ring.adapter.jetty :as jetty] 
            [ring.middleware.params :as ringparams]
            [ring.util.response :as ringresponse]
            )
  (:gen-class))

;; (defn handler [request]
;;   {:status 200
;;    :headers {"Content-Type" "text/html"}
;;    :body (str "<h1>Hello Ring!</h1> to: "  (:query-string request))})

(defn page [name]
  (str "<html><body>"
       (if name
         (str "Nice to meet you, " name "!")
         (str "<form>"
              "Name: <input name='name' type='text'>"
              "<input type='submit'>"
              "</form>"))
       "</body></html>"))

(defn handler [{{name "name"} :params}]
  (-> (ringresponse/response (page name))
      (ringresponse/content-type "text/html")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Ring Starting....")
  (jetty/run-jetty  (-> handler ringparams/wrap-params) {:port  3000}))
