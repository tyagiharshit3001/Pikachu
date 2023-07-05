package ecs;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		String[] charset = st.split(" ");
		int count = 0;
		for(int j =1; j<charset.length;j++) {
			if (charset[j-1].equals(" ") && charset[j].equals(" ") ) {
				continue;
			}else
				count++;
		}
		System.out.println(count);
		
		scan.close();
	}

}
