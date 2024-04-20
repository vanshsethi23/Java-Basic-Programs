public class Variables_DataTypes {
    public static void main(String[] args) {

        // Variables - used to store data in memory temporarily in JAVA. Note: Variables declared with the same name in JAVA throw an error!

        String myname = "Vansh";
        int age1 = 19;
        String neighbour = "Nonu";
        int age2 = 18;
        String friend1;
        friend1 = neighbour;

        // NOTE: Values of variables can be assigned to other variables in JAVA but only within the same DataType.

        System.out.println(myname);
        System.out.println(age1);
        System.out.println(friend1);
        System.out.println(age2);
        System.out.println(neighbour);

        // Data types in Java
        /* *
        1. Primitive Type - Store simple type of data. Length/ Capacity of primitive data is fixed.
        - byte = 1 [-128 to 127]
        - short = 2
        - int = 8 [1, 2, 3..]
        - long = 8
        - float = 4 [decimal values: 3.14]
        - double = 8
        - char = 2 [a, b, c...]
        - boolean = 1 [true/ false]
        * */

        byte age = 19;
        int phone1 = 27865421;
        long phone2 = 9999893722L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        System.out.println(phone1);
        System.out.println(phone2);

        /* *
        NOTE: In Java, by default all integers are taken as int, not Long i.e. why we use L or l.
        And all numbers with decimal point are taken as double, not float i.e. why we use F or f.

        2. Non - Primitive Type -
        > Store complex type of data.
        > Infinite no. of characters can be stored in non - primitive data.
        > To be declared using a "new" keyword. (not compulsary to use)
        * */

        String friend2 = new String("Yash");
        System.out.println(friend2);

        /* *
        > Have functions/ methods with the help of which some operations can be performed on the datatype
        - String = group of letters --> words, group of words --> sentences: stored in a string.
         *  */
    }
}
