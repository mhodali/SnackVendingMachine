package SnackVendingMachine;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NoteSlot extends MoneySlot{
    private List<Double> accepted = Arrays.asList(
    		Note.TWENTY_DOLLARS.getValue(),Note.FIFTY_DOLLARS.getValue()
    		);
    public NoteSlot(double type, double value) throws IOException  {
        try {
            if (!accepted.contains(type))
                throw new IOException();
            else {
                this.setType(type);
                this.setValue(value);
            }
        }catch (IOException ex){
            System.out.println("20$ and 50$ only accepted\n");
        }		
	}
}
