import java.util.*;
public class printAllPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        for(int i = 0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")" + ",");
            }
            System.out.println();
        }
    }
}
