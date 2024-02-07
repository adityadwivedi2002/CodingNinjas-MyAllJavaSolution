public class allIndex {

    public static int[] allIndex(int arr[] ){

        return allIndex(arr, 8, 0,0);
    }

    public static int[] allIndex(int arr[],int x,int startIndex,int counter){
            if(startIndex == arr.length){
                return new int[counter];
            }
            if(arr[startIndex]==x){
                int[] iarr = allIndex(arr,x,startIndex+1,counter+1);
                iarr[counter] = startIndex ;
                return iarr;
            }else{
                int[] iarr = allIndex(arr,x,startIndex+1,counter);
                return iarr;
            }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,4,8,6,8,6,8};
        int[] res = allIndex(arr);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
