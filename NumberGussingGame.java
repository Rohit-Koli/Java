import java.util.*;
import java.math.*;
public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnum=(int)(Math.random()*10+1);
        int userNum=sc.nextInt();
        if (cnum==userNum) {
            System.out.println("Congratuation you have won the game!!");
        } else {
            System.out.println("oops you have entered wrong number try again number is "+cnum);
        }

    }
}
