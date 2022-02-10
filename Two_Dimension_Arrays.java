import java.util.*;
public class Two_Dimension_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
      int col=sc.nextInt();
    //   int numbers[][]=new int[row][col];
    //   //Input
    //    for(int i=0;i<row;i++)
    //    {//
    //       for(int j=0;j<col;j++) 
    //       {
    //         // System.out.print(row , col);
    //         numbers[i][j]=sc.nextInt();
    //    }
    //    System.out.println();
    //    //System.out.println();
    // }
    // //Output 
    // for(int i=0;i<row;i++)
    // {
    //     for(int j=0;j<col;j++)
    //     {
    //         System.out.print(numbers[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    //Q:Taqke a matrix inpurt from a user and sho
    int numbers[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            numbers[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter number you want to find in matrix");
    int x=sc.nextInt();
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            // System.out.print(numbers[i][j]+" ");
            if (numbers[i][j]==x) 
            {
                System.out.println("X found at this location ("+ i +" , "+ j+")" );
            } 
            // else {
            //     System.out.println("You have entered wrong number for finding");
            // }
        }
        // System.out.println();
    }
}
}
