package com.company.interfaces.functionalInterfaces;

// functional interface
// it has one and only one abstract method
// the number of static or default method it doesn't matter
@FunctionalInterface // it will only compile if it's really is a functional interface
public interface Playable {

  void play();

  default void method(){

  }
}
