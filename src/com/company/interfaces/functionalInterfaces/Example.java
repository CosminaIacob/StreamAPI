package com.company.interfaces.functionalInterfaces;


public class Example {

  public static void main (String[] args) {
    // anonymous type
    Playable p = new Playable() {
      @Override
      public void play () {

        System.out.println("Anonymous");
      }
    };
    p.play();

    // lambda expression
    Playable pExpression = () -> System.out.println("Lambda Expression");

    pExpression.play();
  }
}
