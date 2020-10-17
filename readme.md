[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.rutledgepaulv/semantic-reagent.svg)](https://clojars.org/org.clojars.rutledgepaulv/semantic-reagent)

A Clojure(Script) library containing reagent bindings for every Semantic UI React component and every Semantic UI
Calendar React component. All together, that's 170 distinct reagent components and provides a very comprehensive UI
library. Reagent components are defined in `semantic-reagent.core` and symbols for every available icon are defined in 
`semantic-reagent.icons`.

My intention is that you follow the official (javascript) documentation for information about how to use the components 
and their supported options.

- [Semantic UI React](https://react.semantic-ui.com)
- [Semantic UI Calendar React](https://github.com/arfedulov/semantic-ui-calendar-react)

You're free to provide the semantic CSS however you like, but if you want the default 
semantic theme you only need to serve up the "public" resource directory of this jar 
and load the css file in your html. 

```clojure
[:link {:rel "stylesheet" :href "/semantic_reagent/semantic.min.css"}]
```

### License

This project is licensed under [MIT license](http://opensource.org/licenses/MIT).