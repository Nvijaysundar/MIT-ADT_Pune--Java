package constructoroverloaing;

public class Product{
	String name;
	float price;
	int id;
	
	
	public Product(String name, float price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public Product() {
		this.name = "Mouse";
		this.price = 569.36f;
		this.id = 11;
	}
	
	
	public Product(String name, int id) {
		this.name = name;
		this.price = 456.364f;
		this.id = id;
	}
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
		this.id = 125;
	}
	public static void main(String[] args) {
		
		System.out.println(new Product("Keyboard",786.55f).id);
	}
}
