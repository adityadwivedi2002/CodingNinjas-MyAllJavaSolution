import java.util.Scanner;

public class allSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

//        first method
//        for (int i =0; i<str.length();i++){
//            for(int j=i;j<str.length();j++){
//                for(int k=i;k<=j;k++){
//                    System.out.print(str.charAt(k));
//                }
//                System.out.println();
//            }
//        }

//        second method
        for(int len=1;len<=str.length();len++){
            for(int start=0;start<=str.length()-len;start++){
                int end = start + len-1;
                System.out.println(str.substring(start, end+1));
            }
        }

    }
}
