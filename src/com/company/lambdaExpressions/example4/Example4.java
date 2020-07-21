package com.company.lambdaExpressions.example4;


import java.util.function.Function;


public class Example4 {

  public static void main (String[] args) {
    // x-> y encoding "ABCD" ->"DCBA"
    Reverse r1=x->new StringBuilder(x).reverse().toString();
    System.out.println(r1.reverse("ABCD"));

    // Function
    Function<String, String> f1=x->new StringBuilder(x).reverse().toString();
    System.out.println(f1.apply("ABCD"));

    // Function, Predicate, Consumer, BiConsumer...

  }
}
