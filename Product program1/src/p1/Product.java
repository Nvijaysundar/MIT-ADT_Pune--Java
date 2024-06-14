package p1;

public class Product {
	String pname,pid;
	float pprice;
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pname = "Mouse";
		p1.pid = "A1";
		p1.pprice = 547.65f;
		
		Product p2 = new Product();
		
		p2.pname = "Keyboard";
		p2.pid = "A2";
		p2.pprice = 852.364f;
		
		Product p3 = new Product();
		
		p3.pname  = "Floppy Disk";
		p3.pid = "A3";
		p3.pprice = 674.12f;
		
		
		System.out.println(p2.pname);
		System.out.println(p2.pprice + p2.pid);
		
		
	}
}
