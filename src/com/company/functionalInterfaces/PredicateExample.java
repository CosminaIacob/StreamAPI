package com.company.functionalInterfaces;


import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class PredicateExample {

  public static void main (String[] args) {
    // Predicate
    // consumes a method/value and it always returns a boolean
    //
    Predicate<Integer> p1 = x -> x % 2 == 0;
    System.out.println(p1.test(2));
    System.out.println(p1.test(3));


    // BiPredicate
    // consumes 2 values and returns a boolean
    BiPredicate<String, Integer> p=(s,i)->s.length()==i;
    System.out.println(p.test("abc", 3));
  }

}
