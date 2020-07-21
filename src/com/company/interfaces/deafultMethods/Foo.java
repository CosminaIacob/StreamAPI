package com.company.interfaces.deafultMethods;

// the compilation problem related to what method inherits from A or be, disappears
// because it extends Bar which has the same method and it will take the method from Bar
public class Foo extends Bar implements A, B {

}
