package nonprimitive;
import java.util.Scanner;
public class ExamplewithString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[Integer.parseInt(sc.nextLine())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		for (String temp : arr) {
			System.out.println(temp);
		}

		String str = "Hai Hello This is Alpha", str2 = "Java Programming";

		String[] arr2 = str.split(" ");

		for (String temp : arr2)
			System.out.println(temp);

		char[] arr3 = str2.toCharArray();
		for (char temp : arr3)
			System.out.println(temp);
		sc.close();
	}
}
