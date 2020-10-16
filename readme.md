[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.rutledgepaulv/semantic-reagent.svg)](https://clojars.org/org.clojars.rutledgepaulv/semantic-reagent)

A Clojure(Script) library containing reagent bindings for every Semantic UI React component and every Semantic UI
Calendar React component. All together, that's 170 distinct reagent components and provides a very comprehensive UI
library.

You should follow the official documentation (javascript) for information about how to use the components and the
supported options.

- [Semantic UI React](https://react.semantic-ui.com)
- [Semantic UI Calendar React](https://github.com/arfedulov/semantic-ui-calendar-react)

You're free to compile your CSS however you like, but if you just want the default semantic theme you only need to serve
up the "public" resource directory of this module and load the css file in your html. 

```clojure
[:link {:rel "stylesheet" :href "/semantic/semantic.min.css"}]
```

In the future I may provide a way to compile a theme from Clojure instead of asking you to mess with LESS and the 
semantic build process if you want something other than the default theme.


### License

This project is licensed under [MIT license](http://opensource.org/licenses/MIT).