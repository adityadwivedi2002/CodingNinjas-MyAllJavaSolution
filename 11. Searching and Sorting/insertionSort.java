import java.util.Scanner;
public class insertionSort {

    public static void insertionsort(int arr[]){

        for(int i=1;i< arr.length;i++){

            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>=temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

        }

    }

    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {9,8,5,6,2,1};
        insertionsort(arr);
        printarr(arr);
    }
}
