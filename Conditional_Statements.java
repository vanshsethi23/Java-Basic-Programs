import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        // Conditional Statements in JAVA:  allow you to control the flow of your program and make decisions based on certain conditions.
        /* *
        > if Statement:
        The if statement allows you to execute a block of code only if a specified condition is true.

        > else if Statement:
        allows you to check multiple conditions in sequence.

        > if-else Statement:
        The if-else statement allows you to execute one block of code if the condition is true and another block if the condition is false.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Is sun up?: ");

        boolean isSunUp = sc.nextBoolean();

        if(isSunUp == true)  // It is not compulsary to write the "== true" in the if block in JAVA. In this way the code is optimised! To check implcitly for false we use the Logical NOT (!) operator.
            System.out.println("It is day!");
        else
            System.out.println("It is night!");

        System.out.println();

        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        if(age > 18)
            System.out.println("You are eligible to vote!");
        else
            System.out.println("You are not eligible to vote!");

        System.out.println();

        // WAP in JAVA to input the amount of money with a user based on which he can buy the required stuff!

        System.out.println("Enter the amount you have: ");
        int cash = sc.nextInt();

        if (cash < 10) {
            System.out.println("You cannot buy anything.");
            System.out.println("Get more cash!");
        }
        else if(cash > 10 && cash < 50)
            System.out.println("You can buy one item.");
        else
            System.out.println("You can buy both the items.");

        System.out.println();

        /* *
        Switch Statement:
        The switch statement is a control flow statement that allows a variable to be tested for equality against a list of values.
        Each value in a switch statement is called a "case," and the variable being switched on is checked against each case.
        Note: Each case block should end with a break statement to exit the switch statement.
         */

        System.out.println("Enter the day no. - ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }




    }
}
