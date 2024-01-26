package Assignment;

import java.util.Scanner;

public class compressString {

    public static String getCompressedString(String str) {

        String x ="";

        int len = str.length();
        for(int i = 0; i<len; i++){

            int count = 1;

            while(i<len-1 &&str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            x+=str.charAt(i);

            if (count>1){
                x = x+count;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "aaabbcccddaeef";
        String res = getCompressedString(str);
        System.out.println(res);
    }
}
