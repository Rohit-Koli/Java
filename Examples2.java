import java.util.*;
public class Examples2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Q 1: Make a Calculator. Take 2 numbers (a & b) from the user and an operation */        int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // int sum=num1+num2;
        // int sub=num1-num2;
        // int mult=num1*num2;
        // double div=num1/num2;
        // System.out.println("Addition is "+sum);
        // System.out.println("Substraction is "+sub);
        // System.out.println("Multiplication is "+mult);
        // System.out.println("Division is"+div);
        /*Q 2: Ask the user to enter the number of the month & print the name of the
         month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.*/
        switch (num1) {
            case 1:
                System.out.println("January");
                break;
            case 2:
            System.out.println("Feb");
            break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
            System.out.println("Sept");
            break;
            case 10:
            System.out.println("Oct");
            break;
            case 11:
            System.out.println("Nov");
            break;
            case 12:
            System.out.println("Dec");
            break;
            default:
            System.out.println("Youb have entered wrong number");
        }
    }
}
