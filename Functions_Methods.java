package com.sampleproject;

public class Functions_Methods {
    public static void printJava() {
        System.out.println("Hello Java, I have written this code snippet to understand the use of Functions in Java!");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
          // Methods/ Functions in JAVA - blocks of code that perform a specific task and are defined within a class. Methods are used to organize code, make it reusable, and promote modular programming.
        printJava();
        printJava();
        printJava();

        System.out.println();

        printName("Vansh");
        printName("Yash");
        printName("Jigit");

        System.out.println();

        printSum(1, 6);
        printSum(23, 14);

    }
}
