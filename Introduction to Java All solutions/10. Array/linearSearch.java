//Yeh code ek linear search algorithm ko implement karta hai,jiska time complexity O(n)hota hai,jahan'n'array ke length ko represent karta hai.Main aapko detail mein batata hoon:
//
//        linearSearchF function:Yeh function ek array arr mein di gayi value ko dhoondta hai.Is function mein ek for loop chalta hai,jiske andar har ek element ko ek ek karke check kiya jata hai.Agar di gayi value mil jati hai toh uska index return kiya jata hai,nahi toh-1return kiya jata hai.
//
//        main function:Yahaan par user se ek value input liya jata hai,aur phir linearSearchF function ka use kiya jata hai value dhoondne ke liye.Agar value mil jati hai,toh uska index print kiya jata hai,warna"not in array"message diya jata hai.
//
//        Time Complexity:
//        Is linear search algorithm ki time complexity O(n)hoti hai.Yani,jaise-jaise array size badhega,uske corresponding comparisons bhi badhte jayenge.Iska matlab hai ki agar aapke paas ek n element wala array hai,to worst case me aapko n comparisons karne padenge value dhoondne ke liye.Iska time complexity linear(O(n))hota hai,kyun ki har element ko check karna padta hai.
//
//        Is code ki time complexity O(n)hai kyun ki usme ek for loop hai jo array ke har element ko ek ek karke check karta hai.


import java.util.Scanner;

public class linearSearch {

    public static int linearSearchF(int[] arr, int value) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 23, 21, 24, 43, 54, 56, 67, 3, 4, 5, 64, 57};
        int value = sc.nextInt();
        int ans = linearSearchF(arr, value);
        if (ans == -1) {
            System.out.println("Your value are at index of = " + ans + "th it means this value" +
                    " are not in array");
        } else {
            System.out.println("Your value are at index of = " + ans + "th");
        }
    }
}
