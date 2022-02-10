import java.util.*;

public class Break_and_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Break is use to terminate the loop
        // continue isn use to iteration of loop
        // for (int i = 0; i<=100; i++)
        // {
        // if (i%3==0) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // System.out.println();
        // ...............................................................................
        // Non prime numberz
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Non Prime Number ");
                break;
            }
        }
        if (i == n) {
            System.out.println("Is prime");
        }
    }
}