//Jab har execution mein fixed number of inputs liye jayenge, jaise ki is case mein teen, toh hum kahte
// hain ki time complexity O(1) hai. Chahe hum kitne bhi executions kyun na karein, inputs ka number fix rahega.

import java.util.Scanner;
public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char name = input.charAt(0);
        int m1,m2,m3;
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        int average = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(average);
    }
}
