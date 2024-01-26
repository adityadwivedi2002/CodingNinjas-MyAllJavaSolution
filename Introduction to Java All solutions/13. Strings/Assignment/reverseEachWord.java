package Assignment;

import java.util.Scanner;

public class reverseEachWord {

    public static void reversingEachWords(String word) {
        String output = "";
        int startValue = 0;
        int endValue = 0;
        int i = 0;
        while (i < word.length()) {
            if (word.charAt(i) == ' ') {
                endValue = i - 1;
                String rev = "";
                for (int j = endValue; j >= startValue; j--) {
                    rev = rev + word.charAt(j);
                }
                output = output + " "+rev;
                startValue = i + 1; // Update the startValue for the next word
            }
            i++;
        }

        // Process the last word (if any)
        if (startValue < word.length()) {
            String rev = "";
            for (int j = word.length() - 1; j >= startValue; j--) {
                rev = rev + word.charAt(j);
            }
            output = output + " "+rev;
        }

        System.out.println(output.trim());
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word = sc.nextLine();
        reversingEachWords(word);
    }
}
