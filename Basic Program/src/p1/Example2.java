package p1;

public class Example2 {
	String name;	
	public Example2(String name) {
		this.name = name;
	}
	void disp()
	{
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Example2 e1 = new Example2("Java");
		Example2 e2 = new Example2("Program");
		
		e1.disp();
		
	}
}
