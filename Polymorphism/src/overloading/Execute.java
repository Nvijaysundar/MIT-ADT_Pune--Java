package overloading;

public class Execute {
	void m1()
	{
		System.out.println("0 Parameter");
	}
	void m1(int a)
	{
		System.out.println("1 int Parameter "+a);
	}
	void m1(float a)
	{
		System.out.println("1 float parameter ");
	}
	
	int m1(int a, int b)
	{
		System.out.println("2 parameter "+a+" "+b);
		return 0;
	}
	public static void main(String[] args) {
		
		new Execute().m1(56,96);
	}
}
