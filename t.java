import java.util.*;
public class t {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for (int i=n; i <=10; i++) {
                for(int j=1;j<=10;j++){
                    int tab=i*j;
                    System.out.println(tab);
                }break;
                // System.out.println(i);
            }
        }
    }
}
