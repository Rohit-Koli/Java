import java.util.*;
class demo
{  
  int Rollno,pin;
  String name,clg,std,div,add;
  double per;
  void read()
  {
    Rollno=36;
    name="Koli ROhit Himmat";
    clg="Institute of Management, Research and Development, Shirpur"; 
    std="SYBCA";
    div="A";
    per=90;
    add="At post Kuwe.Shirpur, Dhule, Maharashtra, India";
    pin=425427;
    }
   void show()
  {
    System.out.println("Name : "+name+"\n");
    System.out.println("Standard : "+std+"\n");
    System.out.println("Division : "+div+"\n");
    System.out.println("Roll No : "+Rollno+"\n");
    System.out.println("College : "+clg+"\n");
    System.out.println("Per : "+per+"\n");
    System.out.println("Address : "+add+"\n");
    System.out.println("Pin Code : "+pin);
  }
}
class display
{
  public static void main(String args[])
  {
    demo d1= new demo();
    d1.read();
    d1.show();
  }
}