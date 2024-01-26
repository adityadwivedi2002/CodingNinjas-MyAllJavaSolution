import java.util.Scanner;

public class sumOfArrayRecursion {

    public static int sumOfArray1(int[] arr, int i){
        if(arr.length == 1){
            return arr[0];
        }
        if(i == arr.length-1){
            return arr[i];
        }
        int sum = arr[i] + sumOfArray1(arr,i+1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {6,6,6,6};
        int result = sumOfArray1(arr, 0);
        System.out.println(result);
    }
}
