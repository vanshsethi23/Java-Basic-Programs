public class StringsinJAVA {
    public static void main(String[] args) {
        // String Methods

        // 1. Concatenate - Two join two strings together.

        String name1 = "Vansh";
        String name2 = "Sethi";
        String name3 = name1 + " " + name2;
        System.out.println(name3);

        // 2. length - this function/ method prints the length of the string stored inside the variable after which its declared.

        String name = "Aman";
        System.out.println(name.length());

        // 3. charAt - To determine at what position a character is present in a string. Note: JAVA is a zero index based language!

        String fruit = "Apple";
        System.out.println(fruit.charAt(3));

        // 4. replace - used to replace a character of a particular string with another character. Changes doesn't take place in the original string rather the changes occur in the new string. (ie, Strings in JAVA are immutable)

        String student1 = "Mia";
        String student2 = student1.replace('M', 'R');
        System.out.println(student2);

        // 5. substring - used to extract a portion of a string. Syntax: stringname.substring(starting index, ending index). Note: Ending Index is not included!
        String wrestler = "John";
        System.out.println(wrestler.substring(0, 4));
    }
}
