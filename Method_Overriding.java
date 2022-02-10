class A{
    public int a;
    public int Harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    //main point of method overriding
    @Override
    public void meth2() {//this method is overrided
        System.out.println("I am metod 2 of class B");
    }
    public void meth3() {
        System.out.println("I am Method 3 of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        b.meth3();
        
    }
}
