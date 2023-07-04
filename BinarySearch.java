package ecs;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter Number of elements to be enter: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter sorted Array elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter element to be search: ");
		int t = scan.nextInt();
		
		int l = 0;
		int h = arr.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(arr[mid] == t) {
				System.out.println("Element at index: "+ mid);
				return;
			}else if(t < arr[mid])
				h = mid-1;
			else if (t > arr[mid])
				l = mid+1;
		}
		if (l>h)
			System.out.println("Element not found!!!");
		scan.close();
	}
}
