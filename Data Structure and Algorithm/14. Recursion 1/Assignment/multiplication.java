package Assignment;

import java.util.Scanner;

public class multiplication {

    public static int multiplication(int m, int n){
        if(n==0 || m==0){
            return 0;
        }
        return m + multiplication(m,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = multiplication(m,n);
        System.out.println(res);
    }
}
