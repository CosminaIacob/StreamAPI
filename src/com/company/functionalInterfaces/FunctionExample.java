package com.company.functionalInterfaces;


import java.util.function.BiFunction;
import java.util.function.Function;


public class FunctionExample {

  public static void main (String[] args) {

    // Function
    // has 2 generic types
    // like in mathematics
    // it gets a value and returns a value
    // transforms from one value to the other
    // both consumes and supplies sth
    Function<String, Integer> f1 = s -> s.length();
    System.out.println(f1.apply("Hello!"));

    // BiFunction
    // consumes 2 values
    BiFunction<Integer, Integer, String> f = (a, b) -> a + " " + b;
    System.out.println(f.apply(2, 3));
  }

}
