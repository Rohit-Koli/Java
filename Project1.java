import java.util.*;

public class Project1 {
    // rate
    public static void rate(int p, int t, int si) {
        int rate = si * 100 / p * t;
        System.out.println(rate);
    }

    public static void SimpleIntrest(int p, int rate, int t) {
        int si = p * rate * t / 100;
        System.out.println(si);
    }

    public static void mishradhan(int p, int si) {
        int a = p + si;
        System.out.println(a);
    }

    public static void time(int rate, int p, int si) {
        int t = si * 100 / p * rate;
        System.out.println(t);
    }

    public static void MulDhan(int si, int rate, int t) {
        int p = si * 100 / rate * t;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // mulDhan
        //principle amount means amount before giving money without intrest
        System.out.println("Enter Principle amount");
        int p = sc.nextInt();
        // samay
        System.out.println("Enter time in years");
        int t = sc.nextInt();
        // rate
        System.out.println("Enter Rate");
        int rate = sc.nextInt();
        // mishradhan
        System.out.println("Enter Compound");
        int a = sc.nextInt();
        // simple intrest
        System.out.println("Enter Simple intrest ");
        int si = sc.nextInt();
        System.out.println("For simple intrest press 1");
        System.out.println("For rate press 2");
        System.out.println("For Compound press 3");
        System.out.println("For time press 4");
        System.out.println("For principle press 5");
        int num = sc.nextInt();
        if (num > 6) {
            System.out.println("enter valid number !!!");
        }
        switch (num) {
            case 1:
                SimpleIntrest(p, rate, t);
                break;
            case 2:
                rate(p, t, si);
                break;
            case 3:
                mishradhan(p, si);
                break;
            case 4:
                time(rate, p, si);
                break;
            case 5:
                MulDhan(si, rate, t);
                break;
            default:
                System.out.println("Please enter valid number !");
        }

    }
}