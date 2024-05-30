package Assignment;

//Is code ka time complexity O(1) hai. Kyunki yeh ek loop mein 10 iterations karta hai irrespective of input value n. So, input size n ke saath koi change nahi hai, sirf 10 constant iterations hote hain.

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reading a number whose table is to be print
        int n = sc.nextInt();
        // loop start execution form and execute until the condition i<=10 becomes false
        for (int i = 1; i <= 10; i++) {
            // prints table of the entered number
            System.out.println(n + " x "+i+" = "+n*i);
        }
    }
}
