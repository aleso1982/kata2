package kata2;

import java.util.ArrayList;

public class NumberList {

    private static ArrayList<NumberAndFrecuency> arrayList;

    public NumberList() {
        arrayList = new ArrayList<NumberAndFrecuency>();
    }

    public void putNumber(int number) {
        for (NumberAndFrecuency numberAndFrecuency : arrayList) {
            if (numberAndFrecuency.getNumber() == number) {
                numberAndFrecuency.setFrecuency((numberAndFrecuency.getFrecuency() + 1));
                return;
            }
        }
        arrayList.add(new NumberAndFrecuency(number));
    }
    
    public int [] mostFrecuency (){
        int [] number;
        number = new int[2];
        
        for (NumberAndFrecuency numberAndFrecuency : arrayList) {
            if (numberAndFrecuency.getFrecuency() >= number[1]){
                number [0] = numberAndFrecuency.getNumber();
                number[1] = numberAndFrecuency.getFrecuency();
                //mostN = numberAndFrecuency.getNumber();
                //mostF = numberAndFrecuency.getFrecuency();
            }
        }
        return number;
    }
}
