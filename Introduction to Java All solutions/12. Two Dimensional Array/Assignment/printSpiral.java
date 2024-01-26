package Assignment;

public class printSpiral {

    public static void printingSpiral(int[][]matrix){
        if(matrix.length == 0){
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int count =0;
        int total =row*col;
        int startingRow =0;
        int startingCol =0;
        int endingRow =matrix.length-1;
        int endingCol =matrix[0].length-1;

        while(count<total){
            for(int index = startingCol; count < total && index<=endingCol; index++){
                System.out.print(matrix[startingRow][index] + " ");
                count++;
            }
            startingRow++;
            for(int index=startingRow; count < total && index<=endingRow; index++){
                System.out.print(matrix[index][endingCol] + " ");
                count++;
            }
            endingCol--;
            for(int index =endingCol; count < total && index>=startingCol;index--){
                System.out.print(matrix[endingRow][index] + " ");
                count++;
            }
            endingRow--;
            for(int index =endingRow; count < total && index>=startingRow;index--){
                System.out.print(matrix[index][startingCol] + " ");
                count++;
            }
            startingCol++;
        }


    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{14,15,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
        printingSpiral(arr);
    }
}
