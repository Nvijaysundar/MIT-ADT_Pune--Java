package p1;

public abstract class Parent {
	Parent() {
		System.out.println("This is Constructor");
	}

	{
		System.out.println("This is Instance Block");
	}

	static {
		System.out.println("This is Staic block");
	}

	abstract void m1();

	void m2() {

	}

}
