import java.util.Scanner;
public class arrangeNumbersInArray {

    public static void arrange(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int counter = 1;

        while(left <= right){
            if(counter % 2 !=0){
                arr[left] = counter;
                counter = counter + 1;
                left = left + 1;
            }else{
                arr[right] = counter;
                counter = counter + 1;
                right = right - 1;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // Change the size of the array as needed
        arrange(arr); // Call the arrange function
        printArray(arr);
    }
}
