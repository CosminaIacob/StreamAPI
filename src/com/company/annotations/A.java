package com.company.annotations;

@MyAnnotation(value = 20) // this way I'm marking the class as being of a specific type
public class A {

  @MyAnnotation(20)
  public A(){

  }
}
