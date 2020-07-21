package com.company.interfaces.functionalInterfaces;


public class Musician {

  private Playable playable;


  public Musician (Playable playable) {

    this.playable = playable;
  }


  public void play () {

    playable.play();
  }
}
