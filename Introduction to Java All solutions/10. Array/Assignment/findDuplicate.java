package Assignment;

import java.util.Scanner;

public class findDuplicate {

    public static int printDuplicate(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,2,2};
        int result = printDuplicate(arr);
        System.out.println("A Duplicate of numbers is "+result);
    }
}
