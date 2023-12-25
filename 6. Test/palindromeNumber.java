import java.util.*;
public class palindromeNumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int temp=n, rev=0;
         // taking n value to save in temp
        while(n>0) {
            int  LD =  n%10;
            rev = (rev*10)+LD;
            System.out.println("Last Digit = " +LD);
            n=n/10;
            System.out.println("Reverse Value = "+rev);
        }
        if(temp==rev) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }

}