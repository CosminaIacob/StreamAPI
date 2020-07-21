package com.company.functionalInterfaces;


import java.util.function.UnaryOperator;


public class UnaryOperatorExample {

  public static void main (String[] args) {
    // UnaryOperator
    // a functions where what you receive
    // and what you return is of the same type always

    UnaryOperator<Integer> u = n -> n + 1;
    System.out.println(u.apply(3));

    UnaryOperator<String> s = n -> new StringBuilder(n).reverse().toString();
    System.out.println(s.apply("abc"));
  }

}
