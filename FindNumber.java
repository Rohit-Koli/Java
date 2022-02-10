import java.util.Scanner;
class FindNumber 
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        
        System.out.println("Enter the second number");
        b=sc.nextInt();
        
        System.out.println("Enter the third number");
        c=sc.nextInt();
        d=a*b+c;
        System.out.println("Number is"+d);
    }    
}
