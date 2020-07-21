package com.company.interfaces.staticMethods.factoryMethodPattern;


public final class EngineFactory {

  private EngineFactory () {

  }


  public static Engine build (String type) {

    switch (type) {
      case "electric":
        return new ElectricEngine();
      case "diesel":
        return new DieselEngine();
      default:
        throw new IllegalArgumentException();
    }

//    return switch (type) {
//      case "electric" -> new ElectricEngine();
//      case "diesel" -> new DieselEngine();
//      default -> throw new IllegalArgumentException();
//    };
  }
}
