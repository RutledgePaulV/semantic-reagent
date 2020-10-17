(defproject org.clojars.rutledgepaulv/semantic-reagent "0.1.1-SNAPSHOT"

  :description
  "A reagent component bundle for Semantic UI and Semantic UI Calendar React."

  :url
  "https://github.com/rutledgepaulv/semantic-reagent"

  :license
  {:name "MIT License" :url "http://opensource.org/licenses/MIT" :year 2020 :key "mit"}

  :scm
  {:name "git" :url "https://github.com/rutledgepaulv/semantic-reagent"}

  :pom-addition
  [:developers
   [:developer
    [:name "Paul Rutledge"]
    [:url "https://github.com/rutledgepaulv"]
    [:email "rutledgepaulv@gmail.com"]
    [:timezone "-5"]]]

  :deploy-repositories
  [["releases" :clojars]
   ["snapshots" :clojars]]

  :dependencies
  [[org.clojure/clojure "1.10.1" :scope "provided"]
   [org.clojure/clojurescript "1.10.773" :scope "provided"]
   [cljsjs/semantic-ui-react "0.88.1-0"]
   [cljsjs/semantic-ui-calendar-react "0.15.3-0"]
   [reagent "0.10.0"]]

  :repl-options
  {:init-ns semantic-reagent.core})
