import java.util.Scanner;

public class rowWiseSum {

    public static int[][] printingNumberColumnWise() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        int value = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                array[row][col] = value;
                value++;
            }
        }
        return array;
    }

    public static void rowWiseSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
//        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println(); // Add a new line after printing the row-wise sum
    }

    public static void main(String[] args) {
        int[][] arr = printingNumberColumnWise();
        rowWiseSum(arr);
    }
}