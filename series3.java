import java.util.Scanner;
class series3 
{
    public static void main(String[] args)
    {
        int res=4;
        System.out.print(res+"\t");
        for(int i=2;i<=5;i++)
        {
            res=res+2;
            System.out.print(res+"\t");
            res=res*2;
            System.out.print(res+"\t");
        }
    }    
}
