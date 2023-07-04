package ecs;

import java.util.Scanner;

public class LinearSearchSorted {

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
		int mid = n/2;
		
		if(t < arr[mid]) {
			for(int j =0; j<mid; j++) {
				if(arr[j]==t) {
					System.out.println("Index is: "+ j);
					return;
				}
			}
		}else if(t == arr[mid]) {
			System.out.println("Index is: "+ mid);
			return;
		}else if(t > arr[mid]) {
			for (int k =n-1 ; k>mid ; k--) {
				if(arr[k]==t) {
					System.out.println("Index is: "+ k);
					return;
				}
			}
		}else {
			System.out.println("Element not found!!");
		}
		scan.close();

	}

}
