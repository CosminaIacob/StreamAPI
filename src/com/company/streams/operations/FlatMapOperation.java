package com.company.streams.operations;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FlatMapOperation {

  public static void main (String[] args) {
//    // map x -> y
//
//    // flatMap - transform sth to a stream
//    // used when you have an input that can be
//    // transformed on a stream so that you  can process afterwards
//    // not the element itself, but what was inside that element
//
//    // flatMap - allows to specify a stream continuation from the input itself
//
//    List<List<Integer>> listOfLists = Arrays.asList(
//        Arrays.asList(1, 2, 3, 4, 5),
//        Arrays.asList(5, 6, 7),
//        Arrays.asList(8, 9)
//    );
//    // sum up all the values from all the lists
//    Integer sum = listOfLists.stream() // List<Integer>: [1, 2, 3, 4, 5], [5, 6, 7], [8, 9]
//        .flatMap(list -> list.stream()) // Integers: [1, 2, 3, 4, 5, 5, 6, 7, 8, 9]
//        .reduce(0, (a, b) -> a + b);
//    System.out.println(sum);


//    List<String> listOfStrings = Arrays.asList(
//        "ab4n3kdk4",
//        "2n3n2nnm",
//        "mko",
//        "012a"
//    );

    List<String> listOfStrings = Arrays.asList(
        "ab4n3kdk4",
        "2n3n2nm975w",
        "aasdfr3o",
        "012a3daw36",
        "896",
        "vfdjd"
    );

    String digits = "0123456789";
    // count the digits
    long count = listOfStrings.stream() // "ab4n3kdk4", "2n3n2nnm", "mko", "012a"
        .flatMap(s -> Arrays.stream(s.split(""))) // "a", "b", "4"...
        .filter(s -> digits.contains(s))
        .count();

//    System.out.println("Sum: "+count);

    Integer sum = listOfStrings.stream() // "ab4n3kdk4", "2n3n2nnm", "mko", "012a"
        .flatMap(s -> Arrays.stream(s.split(""))) // "a", "b", "4"...
        .filter(digits::contains)
        .mapToInt(Integer::valueOf)
        .reduce(0, (a, b) -> a + b);
    System.out.println("Sum: "+sum); // 80


    // TODO    given the following set of integers
    // TODO    print out a semicolon separated string based on this set
    // TODO    with each prime number followed by the letter 'p'
    // TODO    result: 1; 97p; 19p; 3p; 4; 7p; 87; 56; 8; 45
    Set<Integer> numbers = new HashSet<>(Arrays.asList(56, 7, 19, 4, 1, 8, 3, 97, 87, 45));  // 7, 19, 3, 97

    Set<Integer> primeNumbers = numbers.stream()
        .filter(FlatMapOperation::isPrime)
        .collect(Collectors.toSet());
//    System.out.println(primeNumbers);

    String result1 = numbers.stream()
        .map(number -> isPrime(number) ? number + "p" : number.toString())
        .collect(Collectors.joining("; "));
    System.out.println(result1);

    Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, (result, x) -> result * 2 + x);
    Stream.of(1, 2, 3, 4).parallel()
        .reduce(0, (result, x) -> result * 2 + x);
    // 0 *2 + 1 =1 * 2+2=4*2+3=11*2+4
//    System.out.println(reduce);

    // TODO  given the following list of instruments
    //  print out a map with the instrument as key
    //  and the number of instruments of that type as value

    List<String> instruments = Arrays.asList(
        "piano",       // 3
        "guitar",      // 4
        "saxophone",   // 1
        "guitar",
        "violin",      // 2
        "violin",
        "accordion",   // 2
        "trumpet",     // 1
        "piano",
        "guitar",
        "accordion",
        "piano",
        "guitar"
    );

    Map<String, Long> groupedInstruments = instruments.stream()
        .collect(Collectors.groupingBy(instrument -> instrument, Collectors.counting()));
    System.out.println(groupedInstruments);

    // TODO  #5
    //  generate a stream containing the following sequence of numbers: 1 3 9 27 81 243 729 2187 6561 19683
    //  and print them out on a single line, like they appear above

    Stream.iterate(1, i -> i * 3).limit(10).forEach(element -> System.out.print(element + " "));
  }


  public static boolean isPrime (int i) {

    IntPredicate isDivisible = index -> i % index == 0;
    return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
  }

}
