import java.util.Scanner;

public class leadersInArray {

    public static void leaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                System.out.print(arr[i]+ " ");
                max = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {3,12,34,2,0,-1};
        leaders(arr);
    }
}
