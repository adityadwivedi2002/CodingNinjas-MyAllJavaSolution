import java.util.Scanner;

public class reactangularNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int numOfRowsPrinting = n*2-1;
        for(int a = 1; a<=numOfRowsPrinting;a++){
//            printing rectangular
            for(int i =1;i<=n;i++){
                for(int j = n;j>=0;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
//
        }
    }
}
