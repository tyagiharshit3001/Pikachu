package ecs;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		String[] charset = st.split("\\s+");
		if (charset[0].isBlank())
			System.out.println(charset.length-1);
		else
			System.out.println(charset.length);
		
		scan.close();
	}

}
