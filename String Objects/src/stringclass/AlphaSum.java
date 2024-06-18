package stringclass;

import java.util.Scanner;

public class AlphaSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int u = 0, l = 0, s = 0, n = 0, sum =0; 
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				u++;
			else if(Character.isLowerCase(ch))
				l++;
			else if(Character.isDigit(ch)) {
				n++;
				sum += Integer.parseInt(String.valueOf(ch));
			}
			else
				s++;
		}
		System.out.println("Upper : "+u);
		System.out.println("lower : "+l);
		System.out.println("Number : "+n);
		System.out.println("Symbols : "+s);
		System.out.println("Sum : "+sum);
	}}
