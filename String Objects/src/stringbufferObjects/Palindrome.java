package stringbufferObjects;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
