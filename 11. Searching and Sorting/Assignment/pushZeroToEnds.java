package Assignment;

import java.util.Scanner;

public class pushZeroToEnds {

    public static int[] pushingZerotoEnd(int arr[]) {
        int[] tempArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                tempArr[k] = arr[i];
                k++;
            }
        }
        while (k < arr.length){
            tempArr[k] = 0;
            k++;
        }
        return tempArr;
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int arr[] = {2, 6, 0, 0, 1, 9, 0, 8, 0};
        int arr3[] = pushingZerotoEnd(arr);
        printarr(arr3);
    }
}
