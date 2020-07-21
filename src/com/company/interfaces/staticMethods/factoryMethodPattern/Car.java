package com.company.interfaces.staticMethods.factoryMethodPattern;


public class Car {

  private Engine engine;


  public Car () {

//    this.engine = new ElectricEngine();
    // I want to be able to decouple it somehow and not to instantiate here
//    this.engine=Engine.build("electric");
  }
}
