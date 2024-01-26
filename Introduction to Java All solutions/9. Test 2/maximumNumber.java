//  questions
//We are given a 4 digit number using digits 1 to 9. What is the maximum 3
//digit number that we can make by removing one digit from the given integer.

import java.util.Scanner;
public class maximumNumber {

    public static int threeMaxNum(int n){
        int maxNum =0;
        int i =1;
        while(n/i>0){
            int newNum = (n/(i*10))*i+n%i;
            i = i *10;
            if(maxNum<newNum){
                maxNum = newNum;
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = threeMaxNum(n);
        System.out.println("A Three Maximum Number Are = : "+result);
    }
}
