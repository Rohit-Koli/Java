import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tonny");
        System.out.println(sb);

        //char at 0
        sb.charAt(0);
        System.out.println(sb);
        //set char
        sb.insert(0, 'r');
        System.out.println(sb);
        //Deletion
        sb.delete(0,1);
        System.out.println(sb);
        //

        StringBuilder s=new StringBuilder("H");
        s.append("e");
        s.append("e");
        s.append("L");
        s.append("o");
        System.out.println(s);

    }
    
}
