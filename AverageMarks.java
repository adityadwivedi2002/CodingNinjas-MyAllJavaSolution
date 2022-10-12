import java.util.Scanner;
public class Main1 {

		
		public static void main(String[] args) {

	        int m1,m2,m3;       //			here we take a three input for integer
	        
	        Scanner sc=new Scanner(System.in);
	        
	        String str = sc.next(); //			here we take a String input for Character
	       	 m1 = sc.nextInt();
	         m2 = sc.nextInt();
	         m3 = sc.nextInt();
	         int avg = (m1+m2+m3)/3; // taking average formula of 3 subject with name
	        System.out.println(str);
	        System.out.println(avg);
	        

	}

}
