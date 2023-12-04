(ns App
  (:require ["react" :as r :refer [useState]]
            ["./App.css"]
            ["/vite.svg$default" :as viteLogo]
            ["./assets/react.svg$default" :as reactLogo]
            ["./assets/nbb.svg$default" :as nbbLogo]))

(defn Main []
  (let [[count setCount] (useState 0)]
    #jsx [r/Fragment
          [:div
           [:a {:href "https://github.com/squint-cljs/squint" :target "_blank"}
            [:img {:src nbbLogo :className "logo nbb" :alt "nbb logo"}]]
           [:a {:href "https://vitejs.dev" :target "_blank"}
            [:img {:src viteLogo :className "logo" :alt "Vite logo"}]]
           [:a {:href "https://react.dev" :target "_blank"}
            [:img {:src reactLogo :className "logo react" :alt "React logo"}]]]
          [:h1 "Squint + Vite + React"]
          [:div {:className "card"}
           [:button {:onClick (fn [[_ _ _]]
                                (setCount (inc count)))}
            "count is " count]
           [:p "Edit "
            [:code "src-cljs/App.cljs"]
            " and save to test HMR"]]
          [:p {:className "read-the-docs"}
           "Click on the Vite and React logos to learn more"]]))
