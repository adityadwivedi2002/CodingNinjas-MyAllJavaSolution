
// time complexity = O(1) - Constant Time Complexity:

//diye gaye code mein ek while loop hai, lekin iska iteration count fixed hai, yani 100. Har ek iteration mein ek hi statement execute hoti hai. Yeh constant time complexity hai, kyunki input size se koi dependability nahi hai.

public class print100timeHelloWorld {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 100){
            System.out.println("Hello World");
            counter++;
        }
    }
}
