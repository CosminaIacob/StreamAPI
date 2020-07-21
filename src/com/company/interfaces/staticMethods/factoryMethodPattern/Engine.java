package com.company.interfaces.staticMethods.factoryMethodPattern;


public interface Engine {

  void run ();


  // starting with Java 8 I can avoid the need of having a separate factory class
  // for building the objects
//  static Engine build (String type) {
//
//    return switch (type) {
//      case "electric" -> new ElectricEngine();
//      case "diesel" -> new DieselEngine();
//      default -> throw new IllegalArgumentException();
//    };
//  }
}
