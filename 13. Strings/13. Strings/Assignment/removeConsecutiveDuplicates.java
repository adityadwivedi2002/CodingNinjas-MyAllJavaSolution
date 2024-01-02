package Assignment;

import java.util.Scanner;

public class removeConsecutiveDuplicates {

    public static String removeCons(String str){
        String res ="";
        for (int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                continue;
            }else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "aabccba";
        String res = removeCons(str);
        System.out.println(res);
    }
}
