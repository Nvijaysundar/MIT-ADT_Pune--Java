package p1;

import java.util.Scanner;

public class Chalk {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int ch = sc.nextInt();
		sc.close();
		if(ch>=4 && ch<=666)
			System.out.println("Days:"+(ch+(int)Math.sqrt(ch)+1));
		else
			System.out.println("Invalid Input");
	}
}	
