package com.company.lambdaExpressions.example1;


public class InstrumentTest {

  public static void main (String[] args) {
    // old way
    Instrument piano = new Piano();
    piano.play();

    // lambda expression
    // you can do the impl here only if the interface has only one abstract method
    // otherwise you don't which is the method that you override
    Instrument instrument = () -> System.out.println("Lambda Expression Instrument"); //the impl of the play method from the interface
    instrument.play();
  }
}
