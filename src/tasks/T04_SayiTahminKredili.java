package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {

    public static void main(String[] args) {

        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int random = 5;
        int hak = 5;
        int tahminSayisi = 0;
        int tahmin = 0;

        System.out.println("5 hakkınız var");

        while (hak > 0) {

            System.out.print((tahminSayisi + 1) + ". tahmini yap: ");
            tahmin = scan.nextInt();
            if (random == tahmin) {
                System.out.println(tahminSayisi + 1 + " kadar tahminde " + random + " sayısını bildiniz.");
                break;
            } else if (random > tahmin) {
                System.out.println("tahmini büyüt");
            } else if (random < tahmin) {
                System.out.println("tahmini küçült");
            }

            tahminSayisi++;
            hak--;
        }

        System.out.println("Bilemediniz. Tahmin etmeniz gereken sayı " + random + " idi");




    }
}
