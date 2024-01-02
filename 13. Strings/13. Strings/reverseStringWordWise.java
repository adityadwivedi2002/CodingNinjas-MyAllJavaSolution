import java.util.Scanner;

public class reverseStringWordWise {

    public static String reverseStringWordWise(String str){
        String ans = "";

        int currentWordStart = 0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
//                reverse current word
                int currentWordEnd = i-1;
                String reverseWord = "";
                for(int j= currentWordStart;j<=currentWordEnd;j++){
                    reverseWord = str.charAt(j) + reverseWord;
                }
                ans = ans + reverseWord + " ";
                currentWordStart = i +1;
            }
        }
        int i=0;
                int currentWordEnd = i-1;
                String reverseWord = " ";
                for(int j= currentWordStart;j<=currentWordEnd;j++){
                    reverseWord = str.charAt(j) + reverseWord;
                }
                ans = ans + reverseWord;
                currentWordStart = i +1;
                return  ans;
            }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String res = reverseStringWordWise(str);
        System.out.println(res);
    }
}
