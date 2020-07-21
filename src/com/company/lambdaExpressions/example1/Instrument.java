package com.company.lambdaExpressions.example1;

@FunctionalInterface
// this forces the interface to respect the rule
// of having one and only one abstract method - compilation error
// but doesn't make the interface functional
public interface Instrument {

  void play ();

}
