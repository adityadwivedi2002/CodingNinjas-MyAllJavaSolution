import java.util.Scanner;

public class allPrimeNumbers {
    public static void main(String[] args) {
//        withoutFuntion
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =2; i <=n;i++){
            boolean isPrime = true;
            for(int j =2;j<i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
