import java.util.Scanner;

class myException extends Exception
{
    @Override
    public String toString(){
        return super.toString()+ "I am Two String";
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " I am Get Message";
    }
}
public class Exeption_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        if(a<99){
            try{
            //throw new myException();
            //Using throw keyword we can give custom exception
            throw new ArithmeticException("This is Arithmatic Exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //we can know which error occure in which line through printStackTrace
                e.printStackTrace();
                System.out.println("Finish");
            }
            System.out.println("FInished");
        }
        
    }
}
