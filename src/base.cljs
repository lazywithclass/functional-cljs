(ns functional-cljs.src.base)


(defn ^:export existy [x]
  (not= undefined x))

(defn ^:export truthy [x]
  (and (not (= x false))) (existy x))
