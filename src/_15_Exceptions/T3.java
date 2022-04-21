package _15_Exceptions;

import java.util.Random;

public class T3 {

    public static void randomSayi() {

        Random rand = new Random();
        int randomSayi1 = rand.nextInt(11);
        int randomSayi2 = rand.nextInt(11);

        int sonuc = randomSayi1 + randomSayi2;
        System.out.println(sonuc);

        if (sonuc < 12) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Toplam 12'den küçük");
            }
        } else {
            System.out.println(sonuc);
        }

    }

    public static void main(String[] args) {

        randomSayi();

    }
}
