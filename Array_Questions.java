import java.util.*;
public class Array_Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int x=sc.nextInt();
        int num[]=new int[x];
        for(int i=0;i<x;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++)
        {
            if (num[i]==x) {
                System.out.println("your number is found on"+i+"position");
            }
        }
        
    }
}
