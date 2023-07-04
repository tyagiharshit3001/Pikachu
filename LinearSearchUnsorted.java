package ecs;
import java.util.*;

public class LinearSearchUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of elements to be enter: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter Array elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter element to be search: ");
		int t = scan.nextInt();
		int c = 0;
		for(int j:arr) {
			if (j == t) {
				System.out.println("Index is: " + c);
				return;
			}
			c++;
		}
		scan.close();
	}

}
