(ns clojure-noob.core
  (:gen-class))

(defn fizzBuzz
  [number]
  (if (= 0 (mod number 3))
    (if (= 0 (mod number 5))
      (println "fizzbuzz")
      (println "buzz")
      )
    (if (= 0 (mod number 5))
      (println "fizz")
      (println number))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm A Little Teapot!")
  (def x 1)
  (while (< x 101)
    (do (fizzBuzz x)
    (def x (+ x 1)))
    ))
