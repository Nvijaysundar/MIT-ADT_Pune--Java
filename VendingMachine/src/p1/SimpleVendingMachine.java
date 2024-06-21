package p1;

import java.util.Scanner;

public class SimpleVendingMachine implements VendingMachince{
	String item1,item2;
	int qty1,qty2;
	
	
	SimpleVendingMachine()
	{
		this.item1 =null;
		this.item2 = null;
		this.qty1 = 0;
		this.qty2 = 0;
	}
	public void addItem(String itemName, int quantity)
	{
		if(item1 == null)
		{
			this.item1 = itemName;
			this.qty1 = quantity;
		}
		else if(item2 == null)
		{
			this.item2 = itemName;
			this.qty2 = quantity;
		}
		else
		{
			System.out.println("Vending Machine is full");
		}	
	}
	public boolean selectItem(String itemName)
	{
		if(itemName.equalsIgnoreCase(this.item1)) {
			if(this.qty1>0)
				return true;
		}
		else if(itemName.equalsIgnoreCase(this.item2))
			if(this.qty2>0)
				return true;
		
		return false;
	}
	
	public void dispenseItem(String itemName) {
		if(selectItem(itemName))
		{
			if(itemName.equalsIgnoreCase(this.item1))
				this.qty1 -= 1;
			else if (itemName.equalsIgnoreCase(this.item2))
				this.qty2 -= 1;
		}
		else
			System.out.println("Selected Item is Not Available");
	}
	public boolean checkStock(String itemName) {
		return selectItem(itemName);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleVendingMachine s1 = new SimpleVendingMachine();
		while(true)
		{
			System.out.println("1.addItem\n2.Dispence\n3.Exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter Item Name : ");
				String item = sc.nextLine();
				System.out.println("Enter Quantity: ");
				int qty = Integer.parseInt(sc.nextLine());
				s1.addItem(item, qty);
				break;
			case 2:
				System.out.println("Enter Item Name : ");
				String item1 = sc.nextLine();
				s1.dispenseItem(item1);
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}
	
}


