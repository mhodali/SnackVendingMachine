package SnackVendingMachine;

public enum Coin {
	TenCent("TenCent",0.10), 
	TwenyCent("TwenyCent",0.20), 
	halfDollar("HalfDollar",0.5), 
	oneDollar("OneDollar",1);
	 private String name;
	private double value;
	
	private Coin(String name, double value) {
		this.name = name;
		this.value = value;
	}
    public String getName(){
        return name;
    }
   
    public double getValue(){
        return value;
    }
}
