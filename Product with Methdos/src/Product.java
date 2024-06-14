public class Product {
	String pname,pid;
	float pprice;
	
	Product(String p_name,String p_id,float p_price)
	{
		pname = p_name;
		pid = p_id;
		pprice = p_price;
	}
	
	void getdetails()
	{
		System.out.println("Product name: "+pname);
		System.out.println("Product id: "+pid);
		System.out.println("Product price: "+pprice);
	}
	public static void main(String[] args) {
		
		Product p1 = new Product("Mouse","A1",456.32f);
		p1.getdetails();
		
		Product p2 = new Product("Keyboard","A3",741.36f);
		p2.getdetails();
	}
}
