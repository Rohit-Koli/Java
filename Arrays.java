import java.util.*;
public class Arrays {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // int size=sc.nextInt();
    // int marks[]=new int[3];
    // marks[0]=67;
    // marks[1]=89;
    // marks[2]=78;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // for(int i=0;i<3;i++)
    // {
    //     System.out.println(marks[i]);
    // }
    // int marks[]=new int[size];
    // // to take input from user 
    // for(int i=0;i<size;i++)
    // {
    //     marks[i]=sc.nextInt();
    // }
    // //to give output for user 
    // for(int i=0;i<size;i++)
    // {
    //     System.out.println(marks[i]);
    // }
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for (int i = 0; i < size; i++) {
            numbers[i]=sc.nextInt();
        }
        //Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }
}
