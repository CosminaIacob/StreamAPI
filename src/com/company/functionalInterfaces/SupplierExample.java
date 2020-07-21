package com.company.functionalInterfaces;


import java.util.Random;
import java.util.function.Supplier;


public class SupplierExample {

  //Supplier
  // represents the obj that returns a value
  // it doesn't receive any parameter


  public static void main (String[] args) {

    Supplier<Integer> supplier= ()->10;
    System.out.println(supplier.get());


    Random r=new Random();
    Supplier<Integer> s=()->r.nextInt(1000);
    System.out.println(s.get());
  }

}
