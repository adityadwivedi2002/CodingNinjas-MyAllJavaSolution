import java.util.Scanner;

public class checkNumberInArray {

    public static boolean checkNumArray(int arr[], int x,int index){
        System.out.println(index);
        if(index == arr.length){
            return false;
        }

        if(arr[index]==x){
            return true;
        }

        return checkNumArray(arr,x,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {9,8,9,8};
        System.out.println(checkNumArray(arr,7,0));
    }
}
