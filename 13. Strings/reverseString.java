import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String reverseStr = "";
//        there are two methods

//        1 methods
//        for(int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }

//        2 methods
        for(int i=0;i<str.length();i++){
            reverseStr = str.charAt(i) + reverseStr;
        }
        System.out.print(reverseStr);
    }
}
