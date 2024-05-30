//Is code ka time complexity O(1) hoga, kyunki yeh ek constant time operation hai. Yahan hum sirf ek input le rahe hain (side), aur uske basis par area calculate kar rahe hain. Chahe side ka value kitna bhi ho, calculation time same rahega. Isliye, code ka time complexity constant (O(1)) hoga.

import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of square is: "+ area);
    }
}