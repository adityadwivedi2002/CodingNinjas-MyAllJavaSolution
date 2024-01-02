package Assignment;

import java.util.Scanner;

public class highestOccuringCharacter {

    public static char highestOccuring(String str){
        int arr[] = new int[255];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }

//        char ch = "";
        int max = 0;
        int maxIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return (char) maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "abdefgbabfba";
        char ch = highestOccuring(str);
        System.out.println(ch);
    }
}
