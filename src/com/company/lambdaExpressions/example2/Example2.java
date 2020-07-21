package com.company.lambdaExpressions.example2;


public class Example2 {

  public static void main (String[] args) {

    X x = y -> System.out.println(y);
    x.method(1);
    X x2 = y -> System.out.println(y);
    X x3 = (y) -> System.out.println(y);
    X x4 = (int y) -> {
      System.out.println(y);
    };
    x4.method(4);
//    X x5=(var y)-> System.out.println(y);

    Y y = (a, b) -> System.out.println(a + " " + b);
    Y y2 = (int a, int b) -> System.out.println(a + " " + b);
//    Y y2 = (int a, b) -> System.out.println(a + " " + b); doesn't work
    y.method(1, 9);

  }

}
