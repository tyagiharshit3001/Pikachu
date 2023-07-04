package ecs;
import java.util.*;
public class ElectBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current meter readings: ");
		int m = scan.nextInt();
		System.out.println("Enter previous meter readings: ");
		int p = scan.nextInt();
		System.out.println("Domestic   -----> (1)");
		System.out.println("Commercial -----> (2)");
		System.out.println("Industrial -----> (3)");
		System.out.println("Connection Category: \n");
		int cat = scan.nextInt();
		int u = m - p;
		System.out.println("Billable units: " + u);
		int amt = 0;
		switch(cat) {
		case 1:
			if(u<100)
				amt = amt + u;
			if(u>=101 && u < 200)
				amt = 100*1 + (u-101)*2;
			if(u>=201)
				amt = 100*1 + 100*2 + (u-200)*3;
			break;
		case 2:
			if(u<100)
				amt = amt + u*2;
			if(u>=101 && u < 200)
				amt = 100*2 + (u-101)*4;
			if(u>=201)
				amt = 100*2 + 100*4 + (u-200)*6;
			break;
		case 3:
			if(u<100)
				amt = amt + u*3;
			if(u>=101 && u < 200)
				amt = 100*3 + (u-101)*6;
			if(u>=201)
				amt = 100*3 + 100*6 + (u-200)*9;
			break;
		}
		
		System.out.println("Total billed amount: Rs " + amt + "/-");
		
		scan.close();
	}

}
