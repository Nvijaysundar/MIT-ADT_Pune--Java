package example;

public class Sum {
	
	static int calculate(int a, int b)
	{
		return a+b +100;
	}
	
	
	// a+b + 100
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println(calculate(a,b));
		
		int x = 20, y = 30;
		System.out.println(calculate(x, y));
				
				
		
	}
}
