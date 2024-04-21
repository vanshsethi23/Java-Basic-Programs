// Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 
/*
Inheritance increases Reusability! 
In Java, the class which inherits the members of another class is called derived/sub/child class and the class whose members are inherited is called base/parent  class. 
 */

class Shape {
    String color;
}

class Triangle extends Shape {

}

public class Inheritance_Concept {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
    }
}

