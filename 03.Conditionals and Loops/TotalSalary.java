import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basic_sal=scan.nextInt();
        int grade=(scan.next()).charAt(0); 
        
        double totalSalary=basic_sal+(double)(0.2*basic_sal)+(double)(0.5*basic_sal)-(double)(0.11*basic_sal);
        if (grade == 65)
        {
            totalSalary = totalSalary + 1700; 
        }
        else if (grade == 66)
        {
            totalSalary = totalSalary + 1500;
        }
        else
        {
            totalSalary = totalSalary + 1300;
        }
        System.out.println(Math.round(totalSalary));
	}
}
