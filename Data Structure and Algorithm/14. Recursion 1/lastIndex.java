public class lastIndex {

    public static int lastIndex(int arr[] ){
        return lastIndex(arr, 8, arr.length-1);
    }

    public static int lastIndex(int arr[],int x,int startIndex){
        if(startIndex == 0){
            if (arr[startIndex] == x)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        if(arr[startIndex] == x){
            return startIndex;
        }
       int smalloutput = lastIndex(arr,8,startIndex-1);
       return smalloutput;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,8};
        int res = lastIndex(arr);
        System.out.println(res);
    }
}
