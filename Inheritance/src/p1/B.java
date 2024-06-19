package p1;
class A{ //parent or super or base class
		static int a = 10;
		int b = 20;
		void m1()
		{
			System.out.println("Parent instance member");
		}
		static void m2()
		{
			System.out.println("Parent static method");
		}
}


public class B extends A{ // child or sub or derived class
	public static void main(String[] args) {
		B ob = new B();
		ob.m1();
		B.m2();
	}
}
