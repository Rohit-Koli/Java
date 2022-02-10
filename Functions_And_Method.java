import java.util.*;
public class Functions_And_Method 
{
    //Function is block of code that perform operatons of 
    //user given command and give us ouput of particular thing 
    public static int SumOfTwoNumbers(int a,int b)
    {
       // System.out.println("The sum is "+sum);
       int sum =a+b;
       return sum;
    }
    public static void PrintMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static int MultiOfTwoNums(int x,int y)
    {
        int multi=x*y;
        return multi;
    }
    public static void FactorialOfGivenNum(int n)
    {        
        int fact=1;

        for(int i=n;i>=1;i++)
        {
            fact=fact*i;
            
        }
        System.out.println(fact); 
    }
    public static void main(String[] args) {
       // syntax:returnType functionName(type arg1,type arg2....)
        //operations
        //Example:print a given name in a function
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // PrintMyName(name);//Function Calling//function ko call kiya 
        //..................................................................
         //ex2:Make a function to add two numbers
        
        //  System.out.println("Enter num1");
        //  int a=sc.nextInt();
        //  System.out.println("Enter num2");
        //  int b=sc.nextInt();
        //  int sum=SumOfTwoNumbers(a, b);
        //  System.out.println("Sum of two numbers is "+sum);
         //sum=num1+num2;
         //SumOfTwoNumbers();
         //..............................................................................
        //Q3: make a function to multiply 2 numbers and return their product
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // int multi=MultiOfTwoNums(x, y);
        // System.out.println("Multiplication is :"+multi);
        //..............................................................................
        //Q4:find a factorial of a number 
       
        int n=sc.nextInt();
       // System.out.println(FactorialOfGivenNum());
 
        





    }
   
    
}
