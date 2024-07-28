(ns string-double-reverse.core
  "Haven't you not never wanted to reverse your string, and then immediately
  reverse it again? Well, this isn't the namespace for you. Seriously, don't
  use this. Testing deployment to Clojars.")

(defn str-2X-rev
  "Given string `s`, returns `s` reversed twice."
  {:UUIDv4 #uuid "b562869b-4c0b-47ad-bc38-f0e12eb41ab3"}
  [s]
  (apply str (reverse (reverse s))))