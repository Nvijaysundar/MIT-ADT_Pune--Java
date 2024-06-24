package p1;

public class Process {

	public static void main(String[] args) {
		Itest ob = (int a)->{
			System.out.println("this is Lambda exp"+a);
		};
		
		ob.execute(56);
		
	}

}
