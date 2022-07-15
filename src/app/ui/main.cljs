(ns app.ui.main
  (:require [keechma.next.helix.core :refer [with-keechma use-sub]]
            [keechma.next.helix.lib :refer [defnc]]
            [helix.core :as hx :refer [$]]
            [helix.dom :as d]))

(defnc MainRenderer [props]
  (let [{:keys [page]} (use-sub props :router)]
    (d/div
     {:className "bg-gray-500 w-screen h-screen flex flex-col items-center justify-around text-3xl"}
     (d/div {:class "font-bold max-w-xl text-center"}
            "Hello world!"))))

(def Main (with-keechma MainRenderer))