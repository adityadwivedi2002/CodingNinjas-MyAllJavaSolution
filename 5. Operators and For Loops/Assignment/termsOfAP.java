package Assignment;
import java.util.Scanner;
public class termsOfAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int i=1;
        while(count<=n){
            int sum = 3*i+2;
            if(sum%4!=0){
                System.out.println(sum + " ");
                count++;
            }
            i++;
        }
    }
}
