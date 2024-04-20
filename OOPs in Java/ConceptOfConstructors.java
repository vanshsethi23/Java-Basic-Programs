// Constructors in Java: Constructors are used to initialize objects. They are ivoked automatically when an object is created.

class Dog {
    String name;
    String breed;
    String color;
    String gender;

    public void getdogInfo() {
        System.out.println("\nThe dog's name is " + name);
        System.out.println("The dog's breed is " + breed);
    }

    public void getdogCharacterstics() {
        System.out.println("\nThe dog's color is " + color);
        System.out.println("The dog's gender is " + gender);
    }

    // Non Parameterized Constructor - has no argument, invoked at the time of creating an object! If we don't write any constructor in the class, Java will create a default constructor.
    Dog() {
        System.out.println("This is a non parameterized constructor!");
    }

    // Parameterized Constructor - has arguments, used to provide different values to distinct objects. 

    Dog(String color, String gender) {
        this.color = color;
        this.gender = gender;
    }

    // Copy Constructor - used to copy the values of one object to another object. 
    Dog(Dog dog3) {
        this.color = dog3.color;
        this.gender = dog3.gender;
    }
}

public class ConceptOfConstructors {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Rocky";
        dog1.breed = "Labrador";

        dog1.getdogInfo();

        System.out.println();

        // Dog dog2 = new Dog("Black", "Male");
        
        // dog2.getdogCharacterstics();

        Dog dog2 = new Dog();
        dog2.color = "Black";
        dog2.gender = "Male";

        Dog dog3 = new Dog(dog2);
        dog3.getdogCharacterstics();
    }
}
