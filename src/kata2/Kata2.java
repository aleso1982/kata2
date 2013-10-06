package kata2;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 1, 1, 5, 8, 9, 8, 7, 5, 8, 8, 1, 8};
        NumberList a = new NumberList();

        for (int i = 0; i < array.length; i++) {
            a.putNumber(array[i]);
        }

        System.out.println("Numero con mayor frecuencia: " + a.mostFrecuency());

    }
}
