// in this sum there have three approaches

import java.util.Scanner;

public class checkArraySorted {

//    first Approaches
//    public static boolean checkSortedArray(int[] arr,int i){
//        if(i == arr.length-1){
//            return true;
//        }
//        if(arr[i] > arr[i+1]){
//            return false;
//        }
//        return checkSortedArray(arr,i+1);
//    }
//

//     Second approach
//    public static boolean checkSortedArray(int arr[]){
//        if(arr.length <= 1){
//            return true;
//        }
//        int smallArr[] = new int[arr.length-1];
//        for(int i =1;i< arr.length;i++){
//            smallArr[i-1] = arr[i];
//        }
//        boolean smallAns = checkSortedArray(smallArr);
//        if(!smallAns){
//            return false;
//        }
//        if(arr[0] <= arr[1]){
//            return true;
//        }else{
//            return false;
//        }
//
//    }

    public static boolean checkSortedBetter(int[] arr, int index){
        if(index >= arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return checkSortedBetter(arr,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1,2,9,4,5};
        System.out.println(checkSortedBetter(arr,0));
    }
}
