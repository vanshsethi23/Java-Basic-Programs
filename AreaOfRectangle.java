import java.util.Scanner;

public class AreaOfRectangle {

        public static void main(String[] args) {
            // Write a Program to calculate the area of Rectangle in Java Programming Language.
            Scanner sc = new Scanner(System.in);

            System.out.println("Length Of Rectangle: ");
            int length  = sc.nextInt();

            System.out.println();

            System.out.println("Breadth Of Rectangle: ");
            int breadth  = sc.nextInt();

            System.out.println();

            int area = length * breadth;
            System.out.println("Area Of Rectangle: " + area);
        }
    }

