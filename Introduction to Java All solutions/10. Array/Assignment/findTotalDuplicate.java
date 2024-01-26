package Assignment;

import java.util.Scanner;

public class findTotalDuplicate {

    public static int printDuplicate(int arr[], int n){
        int count = 0;
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count= count + 1;
            }
            total = count;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {6,6,8,5,2,6,8,8,7,6,5,6,6,7,6,67,666};
        int n = sc.nextInt();
        int result = printDuplicate(arr,n);
        System.out.println("A Duplicate of "+n+" numbers is "+result);
    }
}
