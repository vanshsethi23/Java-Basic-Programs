package com.sampleproject;

public class TypeCasting_Constants {
    public static void main(String[] args) {
        // TypeCasting in JAVA: converting a variable from one datatype to another as long as they are compatible!
        /* *
        Types of Type Casting:
        > Implicit Typecasting - This type of conversion occurs when you convert a smaller data type to a larger data type. Java automatically performs this type of conversion because there is no loss of data.
        > Explicit Typecasting - This type of conversion occurs when you convert a larger data type to a smaller data type. This conversion requires explicit casting because there is a possibility of data loss.
        * */

        // Implicit Typecasting
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        // Explicit Typecasting
        int p = 100;
        int fp = p + (int)18.99;
        System.out.println(fp);

        // Constants in JAVA: constants are variables whose values cannot be changed once they are assigned. The "final" keyword is used to declare a variable as a constant. Once a variable is declared as final, its value cannot be changed. Constants are declared in UPPER CASE!
        final float PI = 3.14F;
        System.out.println(PI);
    }
}
