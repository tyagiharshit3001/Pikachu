package ecs;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String word order Reverse 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to be Reversed: ");
		String st = scan.nextLine();
		String[] st1 = st.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String a: st1) {
			sb.insert(0, a+" ");
		}
		System.out.println("Reversed string: "+ sb);
		
		
		//reverse the characters of string
		System.out.println("Enter Word to be Reversed: ");
		String st2 = scan.nextLine();
		StringBuilder sb2 = new StringBuilder();
		String[] charset = st2.split("");
		for(String a: charset) {
			sb2.insert(0, a);
		}
		System.out.println("Reversed word: "+ sb2);
		
		scan.close();
		
	}

}
