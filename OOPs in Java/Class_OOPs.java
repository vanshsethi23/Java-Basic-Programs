// Example 1 :-

class Pen {
    String color;
    String type;
    
    public void write() {
        System.out.println("I can write on paper!");
    }
 
    public void printColor() {
        System.out.println(this.color);
    }
 
    public void printType() {
        System.out.println(this.type);
    }
 }
 
 // Example 2 :-
 
 class Student {
     String name;
     int age;
     int rollno;
 
     public void printInfo() {
         System.out.println("The name of the student is " + this.name);
         System.out.println("The age of the student is " + this.age);
         System.out.println("The roll number of the student is " + this.rollno);
     }
 }
 
 public class Class_OOPs {
     public static void main(String[] args) {
         Pen pen1 = new Pen();
         pen1.color = "Blue";
         pen1.type = "Gel";
         pen1.write();
         pen1.printColor();
         pen1.printType();
 
         System.out.println();
 
         Pen pen2 = new Pen();
         pen2.color = "Black";
         pen2.type = "Ballpoint";
         pen2.write();
         pen2.printColor();
         pen2.printType();
 
         System.out.println();
 
         Student student1 = new Student();
         student1.name = "Vansh";
         student1.age = 20;
         student1.rollno = 87;
         student1.printInfo();
 
         System.out.println();
 
         Student student2 = new Student();
         student2.name = "Yash";
         student2.age = 19;
         student2.rollno = 59;
         student2.printInfo();
     }
 }
 
 