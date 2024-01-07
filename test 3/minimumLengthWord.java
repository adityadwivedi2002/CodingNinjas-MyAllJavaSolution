import java.util.Scanner;

public class minimumLengthWord {

    public static String minimumlengthword(String str) {
        public class Solution {

            public static String minLengthWord(String str) {
                // String ko words mein split karte hain
                String[] words = str.split(" ");

                // Minimum length aur uss length ki word ko store karne ke liye variables initialize karte hain
                int minLength = Integer.MAX_VALUE;
                String minWord = "";

                // Har ek word par iterate karte hain
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    // Check karte hain ki current word ka length minimum length se kam hai ya nahi
                    if (word.length() < minLength) {
                        // Agar kam hai toh uss word ko minimum length aur minimum word ke variables mein store karte hain
                        minLength = word.length();
                        minWord = word;
                    }
                }

                // Minimum length wale word ko return karte hain
                return minWord;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "this is test String";
        String res = minimumlengthword(str);
        System.out.println(res);
    }
}
