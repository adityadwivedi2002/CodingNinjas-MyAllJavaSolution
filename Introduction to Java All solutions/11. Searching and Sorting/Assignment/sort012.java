package Assignment;

public class sort012 {

    public static void sorting(int[] arr){
        int zero = 0;
        int i=0;
        int two = arr.length-1;
        while(i<=two) {
            if(arr[i]==0) {
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                i++;
                zero++;
            }else if(arr[i]==2) {
                int temp = arr[i];
                arr[i] = arr[two];
                arr[two] = temp;
                two--;
            }else {
                i++;
            }
        }
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,0};  //{0,0,0,1,1,2,2}
        sorting(arr);
        printarr(arr);
    }
}

