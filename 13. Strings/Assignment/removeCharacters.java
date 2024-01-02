package Assignment;

import java.util.Scanner;

public class removeCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int n = str.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=ch){
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
