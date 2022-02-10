public class Exeption_Handling {
    public static void main(String[] args) {
        int a = 7273;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Unable to perform task !!! reason is :");
            System.out.println(e);
        }
        System.out.println("End of the program");
        //Nested try-catch 
        int marks[]=new int [3];
        marks[0]=5;
        marks[1]=6;
        marks[2]=7;
        try {
            System.out.println("welcome to nested try-and catch problem");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                //TODO: handle exception
                System.out.println("Marsks 9 doesnot exist!");
                System.out.println("exception appears");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("end");
        }
    }
}
