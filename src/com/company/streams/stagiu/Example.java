package com.company.streams.stagiu;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Example {

  public static void main (String[] args) {


    Set<Student> students = new HashSet<>(Arrays.asList(
        new Student("Student1", 132154L),
        new Student("Student2", 78154L),
        new Student("Student3", 568L),
        new Student("Student4", 741687314L)
    ));

    List<Course> courses = Arrays.asList(
        new Course("Course1", 3),
        new Course("Course2", 1),
        new Course("Course2", 3),
        new Course("Course3", 5),
        new Course("Course5", 5),
        new Course("Course4", 4),
        new Course("Course5", 2)
    );




  }

}
