(defproject com.sagevisuals/string_double_reverse "version5"
  :description "DEPRECATED: reverses your string twice"
  :url "https://clojars.org/com.sagevisuals/string_double_reverse"
  :license {:name "MIT License"
            :url "https://opensource.org/license/MIT"}
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [org.clojure/test.check "1.1.1"]]
  :repl-options {:init-ns string-double-reverse.core}
  :profiles {:dev {:plugins [[lein-codox "0.10.8"]]}}
  :codox {:metadata {:doc/format :markdown}
          :output-path "doc"
          :source-uri "https://github.com/blosavio/string_double_reverse/blob/main/{filepath}#L{line}"})
