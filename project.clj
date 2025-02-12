(defproject com.github.popoppo/aws-xray-sdk-clj "0.1.0-SNAPSHOT"
  :description "A light wrapper for aws-xray-sdk-java"
  :url "https://github.com/popoppo/aws-xray-sdk-clj"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.checkerframework/checker "3.19.0"]
                 [com.github.popoppo/aws-xray-recorder-sdk-core "0.1.0-SNAPSHOT"]]
  :repl-options {:init-ns aws-xray-sdk-clj.core})
