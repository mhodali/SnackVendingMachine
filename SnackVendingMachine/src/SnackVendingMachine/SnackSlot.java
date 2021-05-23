package SnackVendingMachine;

public class SnackSlot {
private int quantity;
private int capacity;
private Item item;
public SnackSlot(int quantity, int capacity, Item item) {
	super();
	this.quantity = quantity;
	this.capacity = capacity;
	this.item = item;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}

}
