package com.company.interfaces.markerInterfaces;


public class Example1 {

  public static void main (String[] args) {
    B b=new B();

    if(b instanceof A){
      System.out.println("A");
    }

    // in this case we don't use the interface to specify a contract
    // we just use the interface to mark a characteristic
    // such that somewhere in the code we can check on that characteristic of the obj
    // and do sth related to that characteristic

    // marker interface were a good choice in old architectures
    // were we didn't have other options to do that
    // now we use less the marker interfaces because we have annotations 9since java 5)
    // Annotation types allow us to mark not only classes
    // but also methods, constructors, parameters etc
    //
  }

}
