package stringclass;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		String str = "Java Program";
		System.out.println("Length: "+str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(3));
		/*
		 * Scanner sc = new Scanner(System.in);
		 *  char ch = sc.nextLine().charAt(0);
		 *  java programming
		 */
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("ava",1));
		System.out.println(str.endsWith("Program"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 9));
		str = str.concat("ming     ");
		System.out.println(str.toString());
		System.out.println(str.replace('a','q'));
		System.out.println(str.replaceFirst("a","j"));
		System.out.println(str.replaceAll("[ao]","James"));
		System.out.println(str.trim());
		String str2 = "   ,";
		System.out.println(str2.isBlank());
		String str3 = String.valueOf(245);
		System.out.println(str.indexOf('z'));
	}
}		
