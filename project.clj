(defproject dragonhoard-html5 "0.1.0-SNAPSHOT"
  :description "The HMTL 5 interface for DragonHoard"
  :url "https://github.com/dragonhoard/html5"
  :license {:name "Simplified BSD"
            :url "https://github.com/dragonhoard/html5/LICENSE"}
  :plugins [[lein-cljsbuild "1.0.3"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]]
  :clsjbuild {
    :builds {
      :dragonfire {
      	:source-path "src/cljs/dragonfire"
      	:compiler {:output-to "build/js/dragonfire.js"}}
      :dragonhoard {
        :source-path "src/cljs/dragonhoard"
        :compiler {:output-to "build/js/dragonhoard.js"}}}})
