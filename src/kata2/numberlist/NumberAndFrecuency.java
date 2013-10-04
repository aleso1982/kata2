package kata2.numberlist;

import java.util.ArrayList;

public class NumberAndFrecuency {
    private int number;
    private int frecuency;

    public NumberAndFrecuency(int number) {
        this.number = number;
        this.frecuency = 1;
    }
    
    public int getNumber() {
        return number;
    }

    public int getFrecuency() {
        return frecuency;
    }
    
    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
    }
    
}
