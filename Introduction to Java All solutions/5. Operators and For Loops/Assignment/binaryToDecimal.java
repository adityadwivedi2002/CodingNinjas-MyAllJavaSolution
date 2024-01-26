package Assignment;
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, placeValue = 1;

        while(n>0){
            int lastD = n%10;
//            System.out.println(" before placevalue = "+placeValue);

            ans = ans + lastD * placeValue;
//            System.out.println("lastDigit = "+lastD);

            placeValue = placeValue * 2;
//            System.out.println(" After placevalue = "+ placeValue);

            n=n/10;
//            System.out.println("N after divide = "+n);
//            System.out.println("Answer Value = "+ans);
            System.out.println();
        }
        System.out.println(ans);

    }
}
