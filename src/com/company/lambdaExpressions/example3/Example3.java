package com.company.lambdaExpressions.example3;


public class Example3 {

  public static void main (String[] args) {

    Z z = () -> 5;
    Z z2 = () -> q(); // this is how we override the method() method
    System.out.println(z.method());
    System.out.println(z2.method());

    Z z3 = () -> {
      return 3;
    };
    System.out.println(z3.method());
//    Z z4 = () -> return 5; doesn't work
  }


  static int q () {

    return 4;
  }
}
