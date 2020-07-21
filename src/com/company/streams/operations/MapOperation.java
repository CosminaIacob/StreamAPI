package com.company.streams.operations;


import java.util.Arrays;
import java.util.List;


public class MapOperation {

  public static void main (String[] args) {

    List<String> list= Arrays.asList("abcde", "test", "qwerty");

    // it takes a Function<T,R> as param
    // it takes a values and transforms it in sth else
    // Function<T,T> --> UnaryOperator<T>
    // Function<T, Boolean> --> Predicate<T>
    // the sum of the lengths of the strings from list
    System.out.print("Sum of the lengths of the strings from list: ");
    Integer sum = list.stream()
        .map(s -> s.length()) // 5, 4 ,6
        .reduce(0, (a, b) -> a + b);
         // 0 + 5 = 5
         // 5 + 4 = 9
         // 9 + 6 = 15
    System.out.println(sum);

    System.out.println("Strings reversed: ");
    list.stream()
        .map(s-> new StringBuilder(s).reverse())
        .forEach(System.out::println);


    int sum2 = list.stream()
        .mapToInt(s -> s.length()) // 5, 4 ,6
        .sum(); // works only with IntStream
    System.out.println("IntStream sum: " + sum2);

  }

}
