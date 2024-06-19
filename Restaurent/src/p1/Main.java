package p1;

class Customer{
	private String name;
	private int order_id;
	private float amout;
	public Customer(String name, int order_id, float amout) {
		this.name = name;
		this.order_id = order_id;
		this.amout = amout;
	}
	void details()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Order id : "+this.order_id);
		System.out.println("Amount : "+this.amout);
		
	}
	
	public float getAmount()
	{
		return this.amout;
	}
}

class DineIn extends Customer{

	public DineIn(String name, int order_id, float amout) {
		super(name, order_id, amout);
	}
	
	void getDetails()
	{
		super.details();
		System.out.printf("Total Bill : %.2f\n",
		                        (super.getAmount()+super.getAmount()*0.1));
	}
}

class TakeAway extends Customer{

	public TakeAway(String name, int order_id, float amout) {
		super(name, order_id, amout);
	}
	
	void getDetails()
	{
		super.details();
		System.out.println("Total Bill : "+ super.getAmount());
	}
}
public class Main {
	public static void main(String[] args) {
		DineIn di = new DineIn("Aplha",123,560.45f);
		di.getDetails();
		
		TakeAway tw = new TakeAway("Beta",112,453.26f);
		tw.getDetails();
	}
}
