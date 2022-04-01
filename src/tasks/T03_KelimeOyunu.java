package tasks;


import java.util.Scanner;


public class T03_KelimeOyunu {
    static Scanner sc = new Scanner(System.in);
    static int oyuncu1 = 1;
    static int oyuncu2 = 2;
    static String kelime;
    static String ekleme;
    static int puan1;
    static int puan2;

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    public static void main(String[] args) {

        System.out.print("1. oyuncu bir kelime girsin: ");
        kelime = sc.nextLine();
        System.out.println(kelime);

        kabulMu();
        devamMiKelimeOyun();


    }

    private static void kabulMu() {

        System.out.print("Oyuncu kelimeyi kabul ediyor mu? Evet için 1, Hayır için 2'ye basın: ");
        oyuncu2 = sc.nextInt();

        switch (oyuncu2) {
            case 1:
                puan1 += kelime.length();
                break;
            case 2:
                System.out.println("Geçersiz kelime");
                cikisKelimeOyun();
                break;

        }
    }

    private static void devamMiKelimeOyun() {

        System.out.print("Oyuncu oyuna devam etmek istiyor mu? Evet için 1, Hayır için 2: ");
        oyuncu2 = sc.nextInt();

        switch (oyuncu2) {
            case 1:
                basaMiSonaMi();
                break;
            case 2:
                System.out.println("Oyun bitti.");
                cikisKelimeOyun();
                break;
        }
        kabulMu();

    }

    private static void basaMiSonaMi() {

        System.out.print("Eklemek istediğiniz kelimeyi girin: ");
        ekleme = sc.nextLine();
        System.out.print("Kelimeyi başa eklemek için 1, sona eklemek için 2: ");
        oyuncu2 = sc.nextInt();
        switch (oyuncu2) {
            case 1:
                kelime = ekleme + kelime;
            case 2:
                kelime = kelime + ekleme;
        }
    }

    private static void cikisKelimeOyun() {

        if (puan1 > puan2) {
            System.out.println("1. oyuncu kazandı");
        } else if (puan1 < puan2) {
            System.out.println("2. oyuncu kazandı");
        } else {
            System.out.println("Berabere kaldınız.");
        }

    }
}