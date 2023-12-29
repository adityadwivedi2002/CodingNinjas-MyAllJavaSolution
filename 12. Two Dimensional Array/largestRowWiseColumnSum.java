import java.util.Scanner;

public class largestRowWiseColumnSum {
    public static int[][] inputArray(){
        int[][] arr = { {6,9,8,5},
                        {9,2,4,1},
                        {8,3,9,3},
                        {8,7,8,6}
        };
        return arr;
    }


    public static void largestRowWiseColumnSum(int[][] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;
        if(arr.length == 0){
            System.out.println("row "+index+" "+max);
            return;
        }
        boolean isRows = true;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
        }

        for(int j=0;j<arr[0].length;j++){
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
                index = j;
                isRows = false;
            }
        }

        if(isRows){
            System.out.println("row "+index+" "+max);
        }else{
            System.out.println("column " + index + " " + max);
        }


    }


    public static void main(String[] args) {
        int[][] arr = inputArray();
        largestRowWiseColumnSum(arr);
    }
}
