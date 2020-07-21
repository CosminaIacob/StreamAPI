package com.company.interfaces.staticMethods;


public interface A {

  default void method1(){
    // do dth here
//    System.out.println("A");
//    System.out.println("B");
    staticMethod();
    //do sth here
  }

  default void method2(){
    // do dth here
//    System.out.println("A");
//    System.out.println("B");
    staticMethod();
    //do sth here
  }

  // I want that this method to be used only in this interface
  // it's purpose is to eliminate code duplication here
//  private
  static void staticMethod(){
    System.out.println("A");
    System.out.println("B");
  }

}
