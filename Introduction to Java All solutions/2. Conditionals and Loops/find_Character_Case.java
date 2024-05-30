import java.util.Scanner;
public class find_Character_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n = sc.next().charAt(0);
        if( n >= 'A' && n <= 'Z')
        {
            System.out.print("1");
        }
        else if(n >= 'a' && n <='z')
        {
            System.out.print("0");
        }
        else {
            System.out.print("-1");
        }
    }
}
