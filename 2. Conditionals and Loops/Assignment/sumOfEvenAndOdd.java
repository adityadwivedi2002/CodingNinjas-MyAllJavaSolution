package Assignment;

import java.util.Scanner;

public class sumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0, evenSum = 0; //for adding a value
        for (int i = 0; i < n; i++) {
            int digit = n%10; // taking a number last digit
            n = n/10; // cutting last digit number from number
            if (digit % 2 == 0){
                evenSum = evenSum + digit;
            }else{
                oddSum = oddSum + digit;
            }
        }
        System.out.println("The sum of even digits = "+evenSum);
        System.out.println("The sum of odd digits = "+oddSum);
    }
}
