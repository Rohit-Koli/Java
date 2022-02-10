import java.util.Scanner;
 /**SYBCA 36 Koli Rohit Himmat*/
 class squareRoot 
 {
     public static void main(String[] args)
     {
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         a=sc.nextInt();
         for(int i=1;i<=a;i++)
         {
             b=i*i;
             if (b==a) 
             {
                 System.out.println("Square Root ="+i);
                 break;                 
             }
             if (i==a) 
             {
                 System.out.println("Not perfect square root !");
                 break;                 
             }
         }
     }
}
