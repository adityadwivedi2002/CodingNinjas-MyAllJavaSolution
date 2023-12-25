package Assignment;

import java.util.Scanner;

public class rotateArray {

    public static void rotatingArray(int arr[], int d){
        int [] temp = new int [d];

        for(int i=0;i<d;i++){
            temp[i]= arr[i];
        }

        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        int k=0;

        for(int i=arr.length-d;i<arr.length;i++){
            arr[i] = temp[k];
            k++;
        }
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {2,6,3,1,5,9,8};
        int rotate = sc.nextInt();
        rotatingArray(arr,rotate);
        printarr(arr);
    }
}
