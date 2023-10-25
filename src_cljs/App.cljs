(ns App
  (:require ["react" :refer [useState]]))

(defn App []
  #jsx [:div
        (let [[state setState] (useState 0)]
          #jsx [:div "You clicked " state "times"
                [:button {:onClick (fn [[_ _ _]]

                                     (setState (inc state)))}
                 "Click me!"]])])
