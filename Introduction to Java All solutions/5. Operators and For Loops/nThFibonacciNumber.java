import java.util.Scanner;
public class nThFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        first Approach
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int c = 0;
//        for (int i = 0 ; i<n ;i++){
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.println("fibonacci at index i "+i+" =  "+a);
//        }
//        System.out.println("final output of A = "+a);
//          Second Approach
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 1; i<=n ;i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("final output of A = "+a);
    }
}
