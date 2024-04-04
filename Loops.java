package com.sampleproject;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Loops in JAVA - used to repeatedly execute a block of code until a specified condition is true or until a specific number of iterations is reached.

        // For Loop: The for loop is commonly used when the number of iterations is known in advance.
        /* *
        for (initialization; condition; update) {
            // code to be executed in each iteration
        }
        * */
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        // While Loop:  The while loop is used when the number of iterations is not known in advance, and the loop continues as long as a specified condition is true.
        /* *
        while (condition) {
        // code to be executed in each iteration
        }
        * */

        int a = 1  ;
        while(a <= 100) {
            System.out.println(a);
            a++;
        }

        System.out.println();

        //  Do-While Loop: The do-while loop is similar to the while loop, but the condition is checked after the execution of the loop block. Therefore, the loop block is guaranteed to execute at least once.
        int b = 100;

        do {
            System.out.println(b);
            b--;
        } while(b >= 1);

        System.out.println();

        // Take input of numbers from the user and print them on the console, stop as soon as the user input a number less than 0.

        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Input a number: ");
            number = sc.nextInt();
            System.out.println("Here is your number: " + number);
        } while(number >= 0);

        System.out.println("THE END");
    }
}
