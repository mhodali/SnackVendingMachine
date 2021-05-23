package SnackVendingMachine;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CoinSlot extends MoneySlot  {
    private List<Double> accepted = Arrays.asList(

    	Coin.TenCent.getValue(),
    	Coin.TwenyCent.getValue(),Coin.halfDollar.getValue(),Coin.oneDollar.getValue()
    );
	public CoinSlot(double type, double value) throws IOException  {
        try {
            if (!accepted.contains(type))
                throw new IOException();
            else {
                this.setType(type);
                this.setValue(value);
            }
        }catch (IOException ex){
            System.out.println("10c, 20c, 50c, 1$ only accepted\n");
        }	
	}

}
