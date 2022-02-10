import java.awt.*;

import java.awt.*;
class form1
{
    form1()
    {
    Frame f= new Frame();
    Label l=new Label();
    Button b=new Button();
    TextField t=new TextField();
    l.setBounds(20,80,80,30);
    t.setBounds(20,100,80,30);
    b.setBounds(100,100,80,30);
    f.add(b);
    f.add(l);
    f.add(t);
    f.setSize(400,300);
    f.setTitle("Employee Information");
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String args[])
    {
        form1 f1=new form1();
    }
}
