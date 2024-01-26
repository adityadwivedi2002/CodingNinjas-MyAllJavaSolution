package Assignment;
import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String[] args) {

//        FIRST APPROACH

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n= n/10;
        }

//        SECOND APPROACH this approach is coding ninjas approach

//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int reversedNumber = 0;
//
//        for (int n = number; n != 0; n /= 10) {
//            int digit = n % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//        }
//
//        System.out.println("Reversed number: " + reversedNumber);
    }
}
