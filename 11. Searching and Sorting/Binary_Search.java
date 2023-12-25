import java.util.Scanner;

public class Binary_Search {

    public static int BinarySearch(int[] arr, int search) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > search) {
                end = mid - 1;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = sc.nextInt();
        System.out.println(BinarySearch(arr,search));
    }
}
