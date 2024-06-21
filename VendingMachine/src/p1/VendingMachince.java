package p1;

public interface VendingMachince {
	void addItem(String itemName, int quantity);
	boolean selectItem(String itemName);
	void dispenseItem(String itemName);
	boolean checkStock(String itemName);
}
