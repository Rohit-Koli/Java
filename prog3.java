//student Information
import java.util.Scanner;
class prog3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name,adr;
        float per;

        System.out.println("Your Name ");
        name = sc.next();

        System.out.println("Your Adress ");
        adr = sc.next();

        System.out.println("Your 12th Percentage");
        per=sc.nextFloat();
        
        System.out.println("your Name is "+name);
        System.out.println("Your Adress is "+adr);
        System.out.println("Your 12th Percentage is "+per);
    }
}
