class stat
{
    public static void Sample(){
        System.out.println("It is Static Method !");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        stat.Sample();
    }
}
//Static Methods 

public class StaticBlock {
    static{
        System.out.println("Its StaticBlock !");//It is use to initialize static members
    }
    public static void main(String[] args) {
        System.out.println("Its Main method !!");
    }
}
//Static Block
