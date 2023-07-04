package ecs;
import java.util.*;
public class TaxCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Monthly salary: ");
		int sal = scan.nextInt();
		double tax = 0F;
		long a_sal = 12*sal;
		if (a_sal <250000)
			tax = 0;
		else if(250000 <= a_sal && a_sal< 500000) {
			tax =  (a_sal - 250000)*0.2;
		}else if(500000 <= a_sal && a_sal< 1000000) {
			tax = 250000*0.1 + (a_sal-500000)*0.2;
		}else if(a_sal>= 1000000) {
			tax = 250000*0.1 + 500000*0.2 + (a_sal-1000000)*0.3F;
		}
		
		System.out.println("Tax amount = Rs "+ tax +"/-");
		scan.close();
	}
}
