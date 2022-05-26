class A
{
    private int age1;//Access inside only that class
    public void Age()
    {
        age1 =19;
        System.out.println("Age is :"+age1);
       
    }
}
public class AccessModifiers 
{
    public static void main(String[] args) 
    {
        A a = new A();
        a.Age();
    }
}
