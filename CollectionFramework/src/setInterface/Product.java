package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Product {
	String pname,id;
	Float pprice;
	Integer pqty;
	public Product(String pname, String id, Float pprice, Integer pqty) {
		this.pname = pname;
		this.id = id;
		this.pprice = pprice;
		this.pqty = pqty;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.HashSet\t2.LinkedHashSet\t3.TreeSet ::");
		Set<Product> ob = null;
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			ob = new HashSet<>();
			break;
		case 2:
			ob = new LinkedHashSet<>();
			break;
		case 3:
			ob = new TreeSet<>();
		}
		while(true)
		{
			System.out.println("1.Add new Product\t2.Display Product\t3.exit :: ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				ob.add(getNewProduct(sc));
				break;
			case 2:
				for(Product temp : ob)
				{
					System.out.println(temp.toString());
				}
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}
	public String toString()
	{
		return this.pname+"\t"+this.id+"\t"+this.pqty+"\t"+this.pprice;
	}
	private static Product getNewProduct(Scanner sc) {
		System.out.println("Enter pName : ");
		String pname = sc.nextLine();
		System.out.println("Enter Product Id: ");
		String id  = sc.nextLine();
		System.out.println("Enter Price: ");
		Float price = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Pqty: ");
		int qty = Integer.parseInt(sc.nextLine());
		
		return new Product(pname, id, price, qty);
	}
	
}
