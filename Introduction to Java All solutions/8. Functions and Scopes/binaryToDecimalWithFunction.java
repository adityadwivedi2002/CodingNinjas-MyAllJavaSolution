import java.util.Scanner;

public class binaryToDecimalWithFunction {

    public static void convertingDecimal(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binNum = sc.nextInt();
        convertingDecimal(binNum);
    }
}
