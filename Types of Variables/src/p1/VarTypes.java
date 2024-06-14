package p1;

public class VarTypes {

	static int a = 100; // static variable
	int b = 200;  //instance variable
	public static void main(String[] args) {
		int c = 300; //local variable
		System.out.println(VarTypes.a);
		System.out.println(c);
		
		VarTypes ob = new VarTypes();
		System.out.println(ob.b);
		
		VarTypes.a += 50;
		ob.b += 80;
		
		System.out.println(VarTypes.a);
		System.out.println(ob.b);
		
		VarTypes ob2 = new VarTypes();
		System.out.println(ob2.b);
	}

}
