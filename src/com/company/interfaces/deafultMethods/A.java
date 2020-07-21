package com.company.interfaces.deafultMethods;


public interface A {

  // the default behavior suggested by the contract
  default void method(){

    System.out.println("A");
  }
}
