package Assignment;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int binary_num = 0, placeValue = 1;

        while(n>0){
            int rem = n%2;  // taking remainder
            System.out.println("remainder = "+rem);
            System.out.println("Placevalue before = "+placeValue);
            binary_num = binary_num + rem * placeValue; // takeout binary value plus with remainder value into with placevalue
            System.out.println("Binary Num = "+binary_num);
            placeValue = placeValue * 10; // placevalue 1,10,100,100 aise hi aage badhta rahega
            System.out.println("Placevalue after = "+placeValue);
            n = n/2; // n 2 se divide hoke jo quotient value rahegi vo hojayega
            System.out.println("Quotient Value = "+n);
            System.out.println();
        }
        System.out.println(binary_num); // final output of binary number
    }
}
