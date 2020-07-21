package com.company.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


//Stream methods
public class Example3 {

  public static void main (String[] args) {

    // finite streams
    List<Integer> numbers = Arrays.asList(1, 5, 6, 3, 8, 9);
    boolean anyMatch = numbers.stream().anyMatch(x -> x % 2 == 0);
    boolean allMatch = numbers.stream().allMatch(x -> x % 2 == 0);
    boolean noneMatch = numbers.stream().noneMatch(x -> x % 2 == 0);

    System.out.println(anyMatch); // true
    System.out.println(allMatch); // false
    System.out.println(noneMatch); //false

    // infinite streams
    Stream<Integer> s1=Stream.iterate(1, i->i+1); // infinite stream
    boolean result1=s1.anyMatch(x -> x % 2 == 0);
    System.out.println(result1);

    Stream<Integer> s2=Stream.iterate(1, i->i+2); // 1, 3, 5, 7
    // it will not end because it will try continuously to find a value
    boolean result2= s2.anyMatch(x -> x % 2 == 0);
    System.out.println(result2);
  }

}
