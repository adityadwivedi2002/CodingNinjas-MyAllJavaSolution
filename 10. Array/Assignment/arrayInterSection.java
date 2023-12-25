package Assignment;

public class arrayInterSection {

    public static void printArrayIntersection(int[] arr1, int[] arr2){
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr2[j] );
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2,6,8,4,5,4,3};
        int[] arr2 = {2,3,4,7};
        printArrayIntersection(arr1, arr2);
    }
}
