package SnackVendingMachine;

public class Card {
private String name;
private String number;
private String type;
private double balance;

public Card(String name, String number, String type, double balance) {
	super();
	this.name = name;
	this.number = number;
	this.type = type;
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
