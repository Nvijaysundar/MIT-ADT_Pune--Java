
public class Example {
	
	static 
	{
		System.out.println("This is Static Block");
	}
	{
		System.out.println("This is Instance Block");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		new Example();
		new Example();
		new Example();
		new Example();
	}
}
