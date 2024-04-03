package JavaBasicPrograms;

class Animal {
    // Field and Method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

// Inherit from Animal
class Dog extends Animal {
    // New Method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

public class InheritanceInJava {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog labrador = new Dog();

        // Access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // Call Method of superclass
        // Call Method of subclass
        labrador.eat();
    }
}

// Inheritance in JAVA: When we construct a new class from an existing class in such a way that the new class access all the features & properties of existing class is called inheritance.
        /*
        1. In Java, the "extend" keyword is used to perform inheritance.
        2. It provides code reusability.
        3. We can't access private members of class through inheritance.
        4. A subclass contains all the features of super class. So, we should create the object of sub class.
        5. Method overriding is only possible through inheritance.

        Syntax:-
        class A // super class
        {
        ---
        ---
        }
        class B extends class A // sub class
        {
        ---
        ---
        }

        Types:-
        1. Single/ Super Inheritance
        one super class, one subclass

        2. Multi Level Inheritance
        one super class, numerous subclass

        3. JAVA does not support Multiple Inheritance

        4. Hierarchical Inheritance
        the numerous subclasses are directly connected to the super class
         */