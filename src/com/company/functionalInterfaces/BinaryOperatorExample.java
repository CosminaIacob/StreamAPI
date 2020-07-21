package com.company.functionalInterfaces;


import java.util.function.BinaryOperator;


public class BinaryOperatorExample {

  public static void main (String[] args) {

    // BinaryOperator
    // similar with a BiFunction
    // but both the input values and the return values have the same type
    BinaryOperator<Integer> bi = (a, b) -> a + b;
    System.out.println(bi.apply(2,3));
  }

}
