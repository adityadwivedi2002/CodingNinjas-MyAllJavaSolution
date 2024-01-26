package Assignment;
import java.util.Scanner;
public class sumOrProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        if(c==1){
            int sum =0;
            for(int i =1; i<=n;i++){
                sum = sum + i;
            }
            System.out.println("Sum of Sum is = "+sum);
        } else if (c==2) {
            int product = 1;
            for(int i = 1; i<=n;i++){
                product = product * i;
            }
            System.out.println("Sum of Product is = "+product);
        }
    }
}
