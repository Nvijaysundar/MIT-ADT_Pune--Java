package nonprimitive;

import java.util.Random;
import java.util.Scanner;

public class Product {
	String name,pid;
	int qty;
	float price;
	
	
	public Product(String name, String pid, int qty, float price) {
		this.name = name;
		this.pid = pid;
		this.qty = qty;
		this.price = price;
	}
	

	public Product(String name, int qty, float price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.pid = String.valueOf(Math.abs(new Random().nextInt()));
	}

	public String toString()
	{
		return this.name+"\t"+this.pid+"\t"+this.price+"\t"+this.qty;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] p = new Product[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter P name : ");
			String name = sc.nextLine();
			System.out.println("Enter P price: ");
			float price = Float.parseFloat(sc.nextLine());
			System.out.println("Enter p Qty: ");
			int qty = Integer.parseInt(sc.nextLine());
			p[i] = new Product(name, qty, price);
		}
		
		for(Product temp : p)
			System.out.println(temp.toString());
		sc.close();
	}
}
