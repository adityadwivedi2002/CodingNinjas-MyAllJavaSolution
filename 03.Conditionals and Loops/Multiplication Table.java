import java.util.Scanner;

public class Main1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//reading a number whose table is to be print  
		int n = sc.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false  
		for (int i = 1; i <= 10; i++) {
//prints table of the entered number      
			System.out.println(i*n);
		}
	}
}


                           this is proper multiply table format code
import java.util.Scanner;
public class Main1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//reading a number whose table is to be print  
		int n = sc.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false  
		for (int i = 1; i <= 10; i++) {
//prints table of the entered number      
			System.out.println(i+"*"+n+"="+i*n);
		}
	}
}
