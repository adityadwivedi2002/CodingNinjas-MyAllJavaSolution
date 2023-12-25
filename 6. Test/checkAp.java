import java.util.Scanner;
public class checkAp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int commondifference = secondNumber - firstNumber;
        boolean isArithmeticProgression = true;

        for(int i = 2; i<n;i++){
            int currentNumber = sc.nextInt();
            if(currentNumber - secondNumber != commondifference){
                isArithmeticProgression = false;
                break;
            }
            secondNumber = currentNumber;
        }
        if(isArithmeticProgression){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
