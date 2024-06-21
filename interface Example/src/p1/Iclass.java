package p1;

public class Iclass implements Itest{
	public void m1()
	{
		System.out.println("This is abstract m1 body");
	}
	public void m2()
	{
		System.out.println("This is abstract m2 body");	
	}
	public static void main(String[] args) {
		System.out.println(Itest.a);
		new Iclass().m1();
	}
}
