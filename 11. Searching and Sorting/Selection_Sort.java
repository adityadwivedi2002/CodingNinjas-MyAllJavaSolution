import java.util.Scanner;
public class Selection_Sort {

    public static void selectionsort(int[] arr){
        int n= arr.length;
        for(int i =0;i<n-1;i++) {
            for (int j = i + 1; j < n; j++) {
//                swapping
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
//                    {4,8,6,9,7}
                }
            }

        }
    }

    public static  void printarr(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int arr[] = {4,8,6,9,7};
        selectionsort(arr);
        printarr(arr);
    }
}
