package stringclass;

public class StringComparisons {
	public static void main(String[] args) {
		String str = "Java",str2 = "Java";
	
		String str3 = new String("JavA "),str4 = new String("java");
		if(str.equalsIgnoreCase(str3.strip()))
			System.out.println("Same");
		else
			System.out.println("not Same");
		
		System.out.println(str2.compareTo(str4));
	}
}
