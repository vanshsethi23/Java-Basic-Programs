package com.sampleproject;

import java.util.Arrays;

public class ArraysinJAVA {
    public static void main(String[] args) {
        // Arrays in JAVA - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // Syntax:
        // DataType[] nameofthearray = {pass the elements of the array here};
        int[] marks = {71, 56, 65};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        // Note: passing the name of the array inside "sout" doesn't print the constituents of the array!

        // Initialisation in JAVA: Variables in Java if not given a value are initialised with null(0).

        // Properties of Arrays
        // length
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2-D Arrays in JAVA
        int[][] finalMarks = {{85, 95, 97}, {95, 95, 98}};
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][2]);
    }
}
