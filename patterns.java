import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int n=sc.nextInt();
        // pattern1(n);
        
        //int m=5;
       // pattern2(m);
        int p=5;
        pattern3(p);
    }
    public static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int m)
    {
        for(int row=1;row<=m;row++)
        {
            for(int col=1;col<=m;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int p) {
        for(int row=1;row<=p-row+1;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
