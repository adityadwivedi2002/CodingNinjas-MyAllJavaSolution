import java.util.Scanner;

public class reverseString {

    public static String reverseWord(String str){
        String output = "";
        int end = str.length();
        int i = str.length()-1;
        while(i>=0){
            if(str.charAt(i)==' '){
                output = output + str.substring(i+1,end)+" ";
                end = i;
            }
            i--;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String res = reverseWord(str);
        System.out.println(res);
    }
}
