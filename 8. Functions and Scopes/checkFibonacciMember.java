import java.util.Scanner;
public class checkFibonacciMember {

    public static boolean checkMember(int n){

        int a=0;
        int b=1;
        while(a<n) {
            int c=a+b;
            a=b;
            b=c;
        }
        if(n==a) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = checkMember(n);
        System.out.println(result);
    }
}
