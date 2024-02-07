package Assignment;

import java.util.Scanner;

public class countZeros {

    public static int countZeros1(int n) {
        if(n<10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
            if(n%10==0){
                return countZeros1(n/10)+1;
            }else{
                return countZeros1(n/10);
            }

    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = 10230;

        // Calling the function and printing the result
        int result = countZeros1(N);
        System.out.println("Number of zeros: " + result);
    }
}
