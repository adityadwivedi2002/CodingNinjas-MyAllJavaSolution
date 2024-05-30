package Assignment;

//Condition checks ke liye O(1) time lagta hai.
//Loop ke liye O(n) time lagta hai.
//Overall, code ka time complexity O(n) hai, jahan n power ka value hai.


import java.util.Scanner;
public class findPowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans = 1;
            if(num == 0){
                if(pow == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
//  jab bhi power ki value zero se badhi rehti hai
//  tab tak loop ko run karo
             for(int i=pow;i>0;i--){
                 ans = ans * num;
             }
            }
        System.out.println(ans);
    }
}
