(ns core
  (:require
   [App :as App]
   ["react-dom/client" :as rdom]))

(def root (rdom/createRoot (js/document.getElementById "root")))
(.render root #jsx [App/App])
