package com.company.functionalInterfaces;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class ConsumerExample {

  public static void main (String[] args) {
    // Consumer
    // an obj that consumes a value but doesn't return anything
    java.util.function.Consumer<String> c1 = s -> System.out.println(s);
    c1.accept("Hello!");

    // example in collections
    List<Integer> myList= Arrays.asList(10,20,30);
    myList.forEach(x-> System.out.print(x+" ")); // forEach uses a consumer

    java.util.function.Consumer<Integer> c=x-> System.out.println(x);
    myList.forEach(c);

    // BiConsumer
    // an obj that consumes 2 values but doesn't return anything
    BiConsumer<Integer, String> c2 = (a, b) -> System.out.println(a + " " + b);
    c2.accept(2, "test");

    //examples in collections
    Map<Integer, String> map=new HashMap<>();
    map.put(10, "A");
    map.put(20, "B");
    map.forEach(c2);


    // Supplier
    // Function
    // BiFunction
    // Predicate
    // BiPredicate
    // UnaryOperator
    // BinaryOperator
  }

}
