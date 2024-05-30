package Assignment;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factor = sc.nextInt();
        boolean isPrime = true; // isprime ka mtlb hota hai ki ye khud se divide hoga ya fir 1 se  ye condition se hum pata karlenge ki uski koi factor
        // uske ya 1 ke alwa toh nhi hai
        //agar factor rahega toh vo show hoyega nhi toh nhi hoga
        for (int i = 2; i < factor; i++) {
            if (factor % i == 0) {
                isPrime = false;
                System.out.print(i + " ");
            }
        }
        if(isPrime){
            System.out.println(-1);
        }
    }
}