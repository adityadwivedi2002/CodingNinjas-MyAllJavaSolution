import java.util.*;
public class swapAlternate {

    public static void swapping(int []arr){
       int length = arr.length;
       if(length%2==0){  // checking array are even
           for(int i = 0; i<length;i+=2){
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
           }
       }else{      // checking array are odd
           for(int i = 0; i<length-1;i+=2){
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
           }
       }
    }

    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        swapping(arr);
        print(arr);

    }
}
