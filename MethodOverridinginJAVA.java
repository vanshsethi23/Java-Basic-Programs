package JavaBasicPrograms;

class Animals {
    // Method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animals
class Dogs extends Animals {
    // Overriding the eat() Method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // New Method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

public class MethodOverridinginJAVA {
    public static void main(String[] args) {

        // Create an Object of the subclass
        Dogs labrador = new Dogs();

        // Call the eat() Method
        labrador.eat();
        labrador.bark();
    }
}

    /* Method Overriding helps to achieve Runtime Polymorphism.
    (ie. polymorphism which exists at the time of execution of program)
    Whenever we write method in sub and super class in such a way that method name and parameter must be same is called Method Overriding.

    Syntax:-
    class A
    {
        void show()
        {
        }
    }

    class B extends A
    {
        void show()
        {
        }
    }

    Method Overriding Rules:-
    1) Whenever we call a method, the runtime environment (JVM) checks the method in the superclass.
    2) If the method is not present in the superclass, it throws a compilation error. If it is present in the superclass, then the JVM checks if that method is overridden or not.
    3) If the method is not overridden, then it calls the super class method. If the method is overridden, then it calls the sub class method.
     */
