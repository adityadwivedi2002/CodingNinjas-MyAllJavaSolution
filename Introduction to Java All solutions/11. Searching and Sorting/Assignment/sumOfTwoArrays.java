package Assignment;

import java.util.Scanner;

public class sumOfTwoArrays {

    public static void sumOfTwoArraysFunction(int[]arr1,int[]arr2,int[]output){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            int sum = arr1[i]+carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }

        while(j>=0){
            int sum = arr2[j]+carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }

        output[0] = carry;
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr1[] = {9,7,6,1};
        int n = arr1.length;
        int arr2[] = {4,5,9};
        int m = arr2.length;
        int output[] = new int [Math.max(n,m) + 1];
        sumOfTwoArraysFunction(arr1,arr2,output);
        printarr(output);
    }
}
