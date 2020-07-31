package com.company.interfaces.functionalInterfaces;


import java.util.stream.Collectors;


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
