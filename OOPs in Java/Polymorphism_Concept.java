// Poly means ‘many’ and morphism means ‘forms’. 
/*
The polymorphism which is implemented at the compile time is known as compile-time polymorphism. 
Example - Method Overloading (a technique which allows you to have more than one function with the same function name but with different functionality inside the same class.)
The parameters/ arguments  passed to the functions should be different!
- No. of arguments different    
- Sequence of arguments different 
- Types of arguments different
 */

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("The name of the student is " + this.name);
    }

    public void printInfo(int age) {
        System.out.println("\nThe age of the student is " + this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println("\nThe name of the student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }
}

public class Polymorphism_Concept {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vansh";
        s1.age = 20;

        s1.printInfo(s1.name); 
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
