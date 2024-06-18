package stringclass;

import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		System.out.println(new Scanner(System.in).nextLine().toLowerCase()
				.replaceAll("[abc]","2").replaceAll("[def]","3")
				.replaceAll("[ghi]","4").replaceAll("[jkl]","5")
				.replaceAll("[mno]", "6").replaceAll("[pqrs]","7")
				.replaceAll("[tuv]","8").replaceAll("[wxyz]","9").toString());
		
	}
}
