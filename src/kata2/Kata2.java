package kata2;

import kata2.numberlist.NumberList;

public class Kata2 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        NumberList a = new NumberList();
        
        for (int i = 0; i < array.length; i++) {
            a.putNumber(i);
        }
        
        System.out.println("Numero con mayor frecuencia: " + a.getFrecuency() + 
                          "\n" + "Frecuencia: " + a.getNumber());
    }
}
