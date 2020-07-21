package com.company.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


// an alternative to marker interfaces
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
// specifies that the annotation can be used only on the type or on the constructor
public @interface MyAnnotation {

  int value() default 5;
}
