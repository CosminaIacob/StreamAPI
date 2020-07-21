package com.company.interfaces.functionalInterfaces;


public class MusicianExample {

  public static void main (String[] args) {
    Musician musician=new Musician(()->System.out.println("play"));
    musician.play();

    // completely decoupled from the implementation
    // of the object that we are using-piano
    Musician piano=new Musician(new Piano());
    piano.play();
  }
}
