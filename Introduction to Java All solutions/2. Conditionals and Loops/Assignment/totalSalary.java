package Assignment;

import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char c = sc.next().charAt(0);
        int allow;
        if (c == 'A') {
            allow = 1700;
        } else if (c == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double totals = ((basic + (0.20 * basic) + (0.50 * basic) + allow) -
                (0.11 * basic));
        double p = Math.round(totals);
        int hra = (int) (p);
        System.out.println(hra);
    }
}
