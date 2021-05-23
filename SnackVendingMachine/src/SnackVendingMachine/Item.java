package SnackVendingMachine;

public enum Item {
	Doritos("Doritos",1)
	,Cheetos("Cheetos",1.5)
	,Lays("Lays",1.5)
	,Pringles("Pringles",1)
	,gum("gum",1);
    private String ItemName;
    private double price;
    Item(String ItemName, double price) {
        this.ItemName = ItemName;
        this.price = price;
    }
    public String getItemName(){
        return ItemName;
    }
   
    public double getPrice(){
        return price;
    }
}
