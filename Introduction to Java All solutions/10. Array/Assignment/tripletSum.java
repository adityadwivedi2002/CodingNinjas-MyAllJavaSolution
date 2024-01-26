package Assignment;

import java.util.Scanner;

public class tripletSum {


    public static int printSum(int[] arr, int sum){
        int numTriplets = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        numTriplets +=1;
                    }
                }
            }
        }
        return numTriplets;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int sum = sc.nextInt();
       int res =  printSum(arr,sum);
        System.out.println(res);
    }
}
