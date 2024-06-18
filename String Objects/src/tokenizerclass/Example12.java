package tokenizerclass;

import java.util.StringTokenizer;

public class Example12 {
	public static void main(String[] args) {
		String str = "Hello Everyone, We are learning Java Programming";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
		
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextElement());
	}
}
