package com.company.interfaces.deafultMethods;

// it doesn't know what method to inherit
// the one from A or the one from B
// compilation error
public class C implements A, B {

  // you have to override the method()
  @Override
  public void method () {

    System.out.println("C");
  }
}
