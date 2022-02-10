class Pen
{
    String type;
    String Color;

    public void write(){
        System.out.println("Hii");
    }
    public void printColor(){
        System.out.println(this.Color);//this told us that which method call her 
    }
}

    //Function Overriding
    class Student{
        String name;
        int age;
        public void PrintInfo(String name){
            System.out.println(name);
        }
        public void PrintInfo(int age){
            System.out.println(age);
        }
        public void PrintInfo(String name,int age){
            System.out.println(name +" "+age);
        }
        
    }
    //Inheritance 
    //base class or Parent class
    class Shape{
        public void area(){
            System.out.println("Display area");
        }
    }
    //This is Derived class
    class Triangle extends Shape{//extends mean inherit the shape class properties into triangle class it means 
        public void area(int l,int h){
            System.out.println(1/2*l*h);
        }
    }
    class EquiletralTriangle extends Triangle{
        public void area(int l,int h){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }
    //...............................................................
    //Abstraction
    // abstract class Animal //class abstract
    // {
    //     abstract void walk();//function abstract        
    // }
    // class Horse extends Animal
    // {
    //     public void walk()
    //     {
    //         System.out.println("Walk on 4 legs");
    //     }
    // }
    // class Chicken extends Animal{
    //     public void walk() {
    //         System.out.println("walks on 2 legs");
    //     }
    // }
    //interface 2nd type of abstraction / pure abstraction
    interface Animal{
        void walk();
        // void eat();
    }
    class Horse implements Animal{
        public void walk(){
            System.out.println("Walks on 4 legs");
        }
    }
    class Chicken implements Animal{
        public void walk(){
            System.out.println("walks on 2 legs");
        }
    }
public class OOPs {
    public static void main(String[] args) {
        // Pen pen1= new Pen();
        // pen1.Color="Red";
        // pen1.type="gel";
        // pen1.write();//write function calling
        // Pen pen2= new Pen();
        // pen2.Color="Blue";
        // pen2.type="BallPen";        
        // pen1.printColor(); 
        // pen2.printColor();
        //.........................................................................
        //Polymorphism-function overloading
        // Student s1=new Student ();
        // s1.age=19;
        // s1.name="Rohit";
        // s1.PrintInfo(s1.name,s1.age);
        //..........................................................................
        //Inheritance
        // Triangle t1=new Triangle();
        // t1.color="Red";
        //.....................................................................
        //Encapsulation
        /*
        combine the data and their function into one entity 
        we can hide data using encapsulation in java
        Hide implementation show only final product
        *///....................................................................
        //Abstraction
        // Horse hs=new Horse();
        // hs.walk();
        // Chicken ch=new Chicken();
        // ch.walk();
        //Interface 2n type of abstraction / pure abstraction
        Horse hs=new Horse();
        hs.walk();
        Chicken ch=new Chicken();
        ch.walk();               
    }    
}