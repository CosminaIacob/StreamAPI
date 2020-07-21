package com.company.streams;


import java.util.Arrays;
import java.util.List;


public class Example1 {

  public static void main (String[] args) {

    List<Integer> list = Arrays.asList(1, 5, 6, 3, 8, 9);

    // print the even numbers of the list

    // classic way - without streams
    for (Integer i : list) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // with streams
    System.out.println("Streams: ");
    list.stream()
        .filter(i -> i % 2 == 0)
        .forEach(System.out::println);
//        .forEach(i-> System.out.println(i));
  }
}
