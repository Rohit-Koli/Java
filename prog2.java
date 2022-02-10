import java.util.Scanner;
class prog2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number: ");
        a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        b=sc.nextInt();
        
        c=a+b;
        System.out.println("Sum of given two numbers is "+c);
    }
}
