import java.util.Scanner;

public class Input_JAVA {
    public static void main(String[] args) {
        // Taking Input in JAVA - In Java, you can take input from the user using the Scanner class, which is part of the java.util package.

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");

        // Read the user's age as an integer - We use the nextInt() method of the Scanner class to read an integer from the user's input.
        int age = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        System.out.println("Your age is " + age);

        System.out.println();

        System.out.println("Enter your name: ");

        // Read the user's age as a string - We use the next() method of the Scanner class to read a string from the user's input.
        // Note: next() method only take tokens (single words) in JAVA.
        String name = sc.nextLine();
        System.out.println("Hi, " + name + ". How are you?");

        System.out.println();

        System.out.println("Enter your hobby: ");

        //  To input a sentence/ line, we use the nextLine() method of the Scanner.
        String hobby = sc.nextLine();
        System.out.println(hobby + "- That's great!");
    }
}
