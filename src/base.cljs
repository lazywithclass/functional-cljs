(ns functional-cljs.src.base)

(defn ^:export identity [x] x)

(defn ^:export existy [x]
  (not= undefined x))

(defn ^:export truthy [x]
  (and (not (= x false)) (existy x)))

(defn ^:export do-when [cond action]
  (if (truthy cond)
    (action)
    undefined))

(defn ^:export compl [predicate]
  (fn [& rest] (not (predicate rest))))
