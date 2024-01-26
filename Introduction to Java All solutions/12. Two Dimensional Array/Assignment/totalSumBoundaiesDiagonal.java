package Assignment;

import java.util.Scanner;

public class totalSumBoundaiesDiagonal{

    public static int getFirstDiagonalSum(int[][] arr){
        int n = arr.length;
        int currRow = 0;
        int currCols = 0;
        int diagonalSum = 0;

        while(currRow < n && currCols < n){
            diagonalSum = diagonalSum + arr[currRow][currCols];
            currRow++;
            currCols++;
        }
        return diagonalSum;
    }
    // second diagonal

    public static int getSecondDiagonalSum(int[][] arr){
        int n = arr.length;
        int currRow = 0;
        int currCols = (arr.length)-1;
        int diagonalSum = 0;

        while(currRow < n && currCols >= 0){
            diagonalSum = diagonalSum + arr[currRow][currCols];
            currRow++;
            currCols--;
        }
        return diagonalSum;
    }
    //boundary Sums

    public static int boundarySum(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 1; i<(n-1);i++){
            sum += arr[0][i]; //upperside
            sum += arr[n-1][i];
            sum += arr[i][0];
            sum += arr[i][n-1];
        }
        return sum;
    }

    // totals sums

    public static void totalSum(int arr[][]){
        int n =arr.length;
        if(n==0){
            System.out.println(0);
            return;
        }

//        int totalSums = getFirstDiagonalSum(arr) + getSecondDiagonalSum(arr) + boundarySum(arr);
//        System.out.println(totalSums);

    }

    public static void main(String[] args) {
        int[][] arr = {
                {6, 9 ,8 ,5 ,9},
                {2, 4, 1, 8, 3},
                {9, 3, 8, 7, 8},
                {6, 8, 9, 4, 1},
                {1, 7, 6, 1, 5}
        };
        int n = arr.length;
        int firstDSum = getFirstDiagonalSum(arr);
        int secondDSum = getSecondDiagonalSum(arr);
        int boundarySum = boundarySum(arr);
        int totalSums = getFirstDiagonalSum(arr) + getSecondDiagonalSum(arr) + boundarySum(arr);
        if(n % 2 !=0){
            totalSums -= arr[n / 2][n/2];
        }
        System.out.println(totalSums);
    }
}
