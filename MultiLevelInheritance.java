class Animals
{
    public void eat(){
        System.out.println("Eating ...");
    }
}
class Dog extends Animals
{
    public void Bark(){
        System.out.println("Dog is Barking ..");
    }
}
class BabyDog extends Dog
{
    public void DrinkMilk(){
        System.out.println("Baby dog is drinking milk ..");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.Bark();
        bd.DrinkMilk();
    }
}
//MultiLevel inheritance
