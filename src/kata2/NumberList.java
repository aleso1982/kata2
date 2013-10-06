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
    
    public int mostFrecuency (){
        int mostN = 0;
        int mostF = 0;
        
        for (NumberAndFrecuency numberAndFrecuency : arrayList) {
            if (numberAndFrecuency.getFrecuency() >= mostF){
                mostN = numberAndFrecuency.getNumber();
                mostF = numberAndFrecuency.getFrecuency();
            }
        }
        return mostN;
    }
}
