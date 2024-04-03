package JavaBasicPrograms;

public class OperatorsInJava {
    public static void main(String[] args) {
        // Operators in JAVA:

        // > Arithmetic Operators: used to perform mathematical operations on numeric values. (+, -, *, /, %)

        // Declaring Variables

        int a = 25;
        int b = 10;

        // Addition (+) Operator

        int sum = a + b;
        System.out.println("a + b = " + sum);

        System.out.println();

        // Subtraction (-) Operator

        int diff = a - b;
        System.out.println("a -  b = " + diff);

        System.out.println();

        // Multiplication (*) Operator

        int mul = a * b;
        System.out.println("a * b = " + mul);

        System.out.println();

        // Division (/) Operator

        double div = (double) a / b;
        System.out.println("a / b = " + div);

        System.out.println();

        // Modulus Operator

        double modulo = (double) a % b;
        System.out.println("a % b = " + modulo);

        System.out.println();
        System.out.println();

        // > Assignment Operators - used to assign values to variables. (=, +=, -=, *=, /=)

        // Assignment Operator (=):

        int x = 10; // Assigns the value 10 to the variable x
        System.out.println(x);

        System.out.println();

        // Addition Assignment (+=):

        int y = 5;
        y += 3; // Equivalent to y = y + 3; - Adds 3 to the current value of y and assigns it back to y
        System.out.println(y);

        System.out.println();

        // Subtraction Assignment (-):
        int z = 8;
        z -= 2; // Equivalent to z = z - 2; - Subtracts 2 from the current value of z and assigns it back to z
        System.out.println(z);

        System.out.println();

        // Multiplication Assignment (*=):
        int p = 4;
        p *= 6; // Equivalent to p = p * 6; - Multiplies the current value of p by 6 and assigns it back to p
        System.out.println(p);

        System.out.println();

        // Division Assignment (/=):
        int q = 20;
        q /= 4; // Equivalent to q = q / 4; - Divides the current value of q by 4 and assigns it back to q
        System.out.println(q);

        System.out.println();
        System.out.println();

        // Unary Operators - need only one operand to operate. (++) & (--)

        int num1 = 1;
        num1++; // Postfix increment: Value increments afterwards.
        System.out.println(num1);

        System.out.println();

        int num2 = 5;
        num2--; // Postfix decrement: Value decrements afterwards.
        System.out.println(num2);

        System.out.println();

        int numb1 = 10;
        System.out.println(++numb1); // Prefix increment: Value increments beforehand only.

        System.out.println();

        int numb2 = 15;
        System.out.println(--numb2); // Prefix decrement: Value decrements beforehand only.

        System.out.println();
        System.out.println();

        // > Comparison Operators (if_else statements) - used to perform relational operations on boolean and numeric values.

        int r = 5;
        int s = 10;

        // Equal to (==): Checks if two values are equal.

        if (r == s) {
            System.out.println("r is equal to s");
        } else {
            System.out.println("r is not equal to s");
        }
        System.out.println();

        // Not equal to (!=): Checks if two values are not equal.

        if (r != s) {
            System.out.println("r is not equal to s");
        } else {
            System.out.println("r is equal to s");
        }
        System.out.println();

        // Less than (<): Checks if the left operand is less than the right operand.

        if (r < s) {
            System.out.println("r is less than s");
        }
        else {
            System.out.println("r is not less than s");
        }
        System.out.println();

        // Greater than (>): Checks if the left operand is greater than the right operand.

        if (r > s) {
            System.out.println("r is greater than s");
        } else {
            System.out.println("r is not greater than s");
        }
        System.out.println();

        // Greater than or equal to (>=): Checks if the left operand is greater than or equal to the right operand.

        if (r >= s) {
            System.out.println("r is greater than or equal to s");
        } else {
            System.out.println("r is less than s");
        }
        System.out.println();

        // Less than or equal to (<=): Checks if the left operand is less than or equal to the right operand.

        if (r <= s) {
            System.out.println("r is less than or equal to s");
        } else {
            System.out.println("r is greater than s");
        }

        System.out.println();
        System.out.println();

        // > Logical Operators - used to perform logical operations on boolean values.

        // Logical AND (&&): Returns true if both operands are true.

        boolean result1 = (true && false);
        System.out.println(result1);

        // Logical OR (||): Returns true if at least one of the operands is true.

        boolean result2 = (true || false);
        System.out.println(result2);

        // Logical NOT (!): Returns true if the operand is false, and vice versa.

        boolean result3 = !true;
        System.out.println(result3);
    }
}
