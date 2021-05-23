package SnackVendingMachine;

public enum Note {
	TWENTY_DOLLARS("TWENTY_DOLLARS", 20),
    FIFTY_DOLLARS("FIFTY_DOLLARS", 50);
	private String name;
    private double value;
	private Note(String name, double value) {
		this.name = name;
		this.value = value;
	}
	 public String getName() {
	        return name;
	    }
	    public double getValue() {
	        return value;
	    }
}
