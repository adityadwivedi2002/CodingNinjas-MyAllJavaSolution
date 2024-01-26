import java.util.Scanner;
public class numberStarPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        int rows = n;
//        code for rows
        for(int i = 1; i<=n;i++){
//            code to print increasing column
            for(int j=1;j<=rows;j++){
                System.out.print(j);
            }
//            code to print stars
            int starCount = (n-rows)*2;
            for(int k=1; k<=starCount;k++){
                System.out.print("*");
            }
//            code to print decreasing column
            int printValue = rows; // for printing value of decreasing
            for(int m=1;m<=rows;m++) {
                System.out.print(printValue);
                printValue--;
            }
            System.out.println();
            rows--; // after loops decreasing value

        }
    }
}
