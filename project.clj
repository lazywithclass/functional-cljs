(defproject functional-cljs "0.0.1"
  :description "Humble attempt to translate Fogus' functions found in Functional JavaScript into ClojureScript"
  :source-paths ["src-cljs/"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                [org.clojure/clojurescript "0.0-2014"
                :exclusions [org.apache.ant/ant]]]
  :plugins [[lein-cljsbuild "1.0.2"] [com.cemerick/clojurescript.test "0.2.2"]]
  :cljsbuild {
    :builds [{
      :source-paths ["test-cljs"]
      :compiler {
        :output-to "output/main.js"
        :optimizations :advanced
        :target :nodejs
      }
    }]
    :test-commands { "test" [ "node" "output/main.js" ] }
  }
)
