import java.util.Scanner;

public class printingNumberColumnWise {

    public static int[][] printingNumberColumnWise(){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Rows :- ");
        int rows = sc.nextInt();
//        System.out.println("Enter your columns :- ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        int value = 1;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                array[row][col] = value;
                value++;
            }
        }
        return array;
    }

    public static void print2dArray(int[][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] newArr = printingNumberColumnWise();
        print2dArray(newArr);

    }
}

