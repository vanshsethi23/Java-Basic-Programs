package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot_WhileLoop {
    public static void main(String[] args) {
        // Write a Program to find whether the number is prime or not using while loop.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;

        boolean flag = false;

        while (i <= num / 2) {
            //condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
