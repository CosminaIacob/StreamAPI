package com.company.streams.stagiu;


import java.util.Set;


public class Student {

  private String name;

  private Set<Course> courses;

  private Long registrationNumber;


  public Student (String name, Long registrationNumber) {

    this.name = name;
    this.registrationNumber = registrationNumber;
  }


  public String getName () {

    return name;
  }


  public void setName (String name) {

    this.name = name;
  }


  public Set<Course> getCourses () {

    return courses;
  }


  public void setCourses (Set<Course> courses) {

    this.courses = courses;
  }


  public Long getRegistrationNumber () {

    return registrationNumber;
  }


  public void setRegistrationNumber (Long registrationNumber) {

    this.registrationNumber = registrationNumber;
  }
}
