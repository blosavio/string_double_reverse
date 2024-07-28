(ns string-double-reverse.core-test
  (:require [clojure.test :refer :all]
            [string-double-reverse.core :refer :all]))

(deftest str-2X-rev-tests
  (testing "basic functionality"
    (are [x] (= x (str-2X-rev x))
      ""
      " "
      "foo"
      "bar"
      "baz")))
