package com.company.streams;


import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

// How to create a stream source
public class Example2 {

  public static void main (String[] args) {

    // how to create a stream source: collections; empty streams

    // use empty stream to avoid using null
    Stream<Integer> emptyStream = Stream.empty();

    System.out.println("Stream.of: ");
    Stream<Integer> s2 = Stream.of(2, 3, 4, 5); // finite source
    s2.forEach(System.out::println);

    System.out.println("Generate:");
    Supplier<Integer> supplier = () -> new Random().nextInt();
    Stream<Integer> s3 = Stream.generate(supplier); //infinite source
    s3.limit(3)
        .forEach(System.out::println);


    System.out.println("Iterate: ");
    Stream<Integer> s4=Stream.iterate(1, i->i+2); // infinite stream
    s4.limit(5).forEach(System.out::print);

  }


  public List<Integer> myMethod () {
    // do sth here
    return Collections.emptyList(); // instead of returning null

  }


  public Stream<Integer> streamMethod () {
    // do sth here
    return Stream.empty(); // instead of returning null

  }

}
