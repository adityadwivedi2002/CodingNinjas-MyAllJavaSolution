public class firstIndex {

    public static int firstIndex(int arr[] ){
        return firstIndex(arr, 7, 0);
    }

    public static int firstIndex(int arr[],int x,int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        if(arr[startIndex] == x){
            return startIndex;
        }
        return firstIndex(arr,x,startIndex+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8};
        int res = firstIndex(arr);
        System.out.println(res);
    }
}
