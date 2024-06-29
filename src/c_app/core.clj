(ns c-app.core
  (:gen-class))

(defn say-welcome [what]
  (println "Welcome to" what "!"))


;(defn -main
;  "I don't do a whole lot ... yet."
;  [& args]
;  (println "Hello, World!"))

(defn -main []
  (say-welcome "ob"))

(require 'clojure.java.jdbc)

