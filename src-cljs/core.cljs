(ns core
  (:require
   [App :as App]
   ["react-dom/client" :as rdom]
   ["./assets/core.css"]))

(def root (rdom/createRoot (js/document.getElementById "root")))
(.render root #jsx [App/App])
