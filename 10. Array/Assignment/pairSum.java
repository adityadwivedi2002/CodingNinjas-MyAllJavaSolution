package Assignment;

import java.util.Scanner;

public class pairSum {


    public static void printSum(int[] arr, int sum){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println("("+arr[i]+" "+arr[j]+")" );
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,3,6,2,5,4,3,2,4};
        int sum = sc.nextInt();
        printSum(arr,sum);

    }
}
