package com.sampleproject;

public class ExceptionHandling {
    public static void main(String[] args) {
        /* *
        Exception Handling:
        Exception handling in Java is a mechanism to deal with runtime errors or exceptional situations that may occur during the execution of a program.
        * */
        // The try block contains the code that might throw an exception, and the catch block contains the code that handles the exception.
        try {
            int result = 10/0; // This will throw an ArithmeticException
            System.out.println(result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { // The finally block is executed regardless of whether an exception occurred or not.
            System.out.println("This block will always execute.");
        }

        System.out.println();

        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[10]);
        } catch(Exception exp) {
            System.out.println("Error: " + exp.getMessage());
        }
        finally {
            System.out.println("B.Tech mee aisa hota rehta hai!");
        }

    }
}
