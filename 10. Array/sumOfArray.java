import java.util.*;
public class sumOfArray {

//    sum function
    public static int sumArr(int arr[]){
        int n = arr.length;
        int sum =0;
        for (int i =0;i<n;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int res = sumArr(arr);
        System.out.println("Sum of array is = "+res);
    }
}
