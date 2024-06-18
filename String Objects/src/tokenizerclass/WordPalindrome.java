package tokenizerclass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordPalindrome {
	public static void main(String[] args) {
		int count =0;
		String str = new Scanner(System.in).nextLine();
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			StringBuffer sb = new StringBuffer(temp);
			if(temp.equalsIgnoreCase(sb.reverse().toString()))
				count++;
			System.out.println(sb.toString());
		}
		System.out.println("Panidrome Count : "+count);
	}
}
