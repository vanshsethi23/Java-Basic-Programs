package com.sampleproject;

public class Break_Continue {
    public static void main(String[] args) {
        // Break & Continue Statement in JAVA:

        // break Statement: used to terminate the loop prematurely, causing the program to exit the loop even if the loop condition is still true.

        int i = 0;
        while(true) {
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
        System.out.println();

        for (int a = 1; a <= 10; a++) {
            if (a == 7) {
                break;
            }
            System.out.println(a);
        }

        System.out.println();

        // continue Statement: The continue statement is used to skip the rest of the code inside the loop for the current iteration and proceed to the next iteration.

        int b = 0;
        while(true) {
            if(b == 3) {
                b++;
                continue;
            }
            System.out.println(b);
            b++;
            if(b > 5) {
                break;
            }
        }
        System.out.println();

        for (int c = 1; c <= 10; c++) {
            if (c == 5) {
                continue;
            }
            System.out.println(c);
        }

    }
}
