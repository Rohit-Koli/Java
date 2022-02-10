/**
 * InterfaceDemo
 */
/**
 * Animal
 */  interface Animal {
    void walk();    
}
class Horse implements Animal{
    public void walk(){
        System.out.println("Horse Wals on 4 Legs");
    }
}
class Chicken implements Animal{
    public void walk(){
        System.out.println("Chicken wals on 2 legs");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Horse hs = new Horse();
        hs.walk();
        Chicken ch = new Chicken();
        ch.walk();
    }
}