package com.company.streams.operations;


import java.util.Arrays;
import java.util.List;


public class FlatMapOperation {

  public static void main (String[] args) {
    // map x -> y

    // flatMap - transform sth to a stream
    // used when you have an input that can be
    // transformed on a stream so that you  can process afterwards
    // not the element itself, but what was inside that element

    // flatMap - allows to specify a stream continuation from the input itself

    List<List<Integer>> listOfLists = Arrays.asList(
        Arrays.asList(1, 2, 3, 4, 5),
        Arrays.asList(5, 6, 7),
        Arrays.asList(8, 9)
    );
    // sum up all the values from all the lists
    Integer sum = listOfLists.stream() // List<Integer>: [1, 2, 3, 4, 5], [5, 6, 7], [8, 9]
        .flatMap(list -> list.stream()) // Integers: [1, 2, 3, 4, 5, 5, 6, 7, 8, 9]
        .reduce(0, (a, b) -> a + b);
    System.out.println(sum);


    List<String> listOfStrings = Arrays.asList(
        "ab4n3kdk4",
        "2n3n2nnm",
        "mko",
        "012a"
    );

    String digits = "0123456789";
    // count the digits
    long count = listOfStrings.stream() // "ab4n3kdk4", "2n3n2nnm", "mko", "012a"
        .flatMap(s -> Arrays.stream(s.split(""))) // "a", "b", "4"...
        .filter(s -> digits.contains(s))
        .count();

    System.out.println(count);
  }

}
