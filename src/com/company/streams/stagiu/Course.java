package com.company.streams.stagiu;


public class Course {

  private String name;

  private Integer level;


  public Course (String name, Integer level) {

    this.name = name;
    this.level = level;
  }


  public String getName () {

    return name;
  }


  public void setName (String name) {

    this.name = name;
  }


  public Integer getLevel () {

    return level;
  }


  public void setLevel (Integer level) {

    this.level = level;
  }
}
