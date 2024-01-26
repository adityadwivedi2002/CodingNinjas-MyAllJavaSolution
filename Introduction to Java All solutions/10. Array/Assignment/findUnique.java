package Assignment;
import java.util.*;
public class findUnique {

    public static int printUnique(int arr[]){
        boolean isFound ;
        int uniq = 0;
        for(int i=0;i<arr.length;i++){
            isFound = false;
            for (int j=0;j< arr.length;j++){
                if(j == i) {
                    continue;
                }
                    if(arr[i] == arr[j]){
                        isFound = true;
                        break;
                    }
                }
                if (!isFound){
                    uniq =  arr[i];
                }
            }

        return uniq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {6,6,8,5,2,2,8};
        int result = printUnique(arr);
        System.out.println(result);
    }
}
