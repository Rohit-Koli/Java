import java.util.Scanner;
class prog1
{
  public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the first number ");
    a=sc.nextInt();
    System.out.println("Enter the second number ");
    b=sc.nextInt();
    if (a>b) 
    {
        System.out.println("A is greater than B");            
    }
    else
    {
        System.out.println("B is greater than A"); 
    }
 }
}
