package Assignment;

public class secondLargestInArray {

    public static int secondLargestArray(int arr[]){
        int largest = Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        for (int i =0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        for(int i =0 ;i<arr.length;i++){
            if(largest > arr[i] && secondLargest < arr[i]){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,6,31,14,29,44,3};
        int secondLargestArray = secondLargestArray(arr);
        System.out.println(secondLargestArray);
    }
}
