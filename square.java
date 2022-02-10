import java.util.Scanner;
 /**SYBCA 36 Koli Rohit Himmat*/
 class square 
 {
     public static void main(String[] args)
     {
         int a,b;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         a=sc.nextInt();
         b=a*a;
         System.out.println("Square="+b);
         for (int i=1;i<=a;i++)
         {
             b=i*i;
             System.out.println("Square of "+i+"="+b);
         }
     }     
 }