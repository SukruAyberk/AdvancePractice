package _10_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavCevap {

    ///*
    //     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
    //     *
    //     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
    //     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
    //     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
    //     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
    //     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
    //     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
    //     *
    //     * */

    static Scanner scan = new Scanner(System.in);
    static List<String> urunler = new ArrayList<String>();
    static List<Double> urunFiyatlar = new ArrayList<Double>();
    static double toplamOdeme;

    public static void main(String[] args) {

        urunler.add("Domates - ürün kodu: 1");
        urunler.add("Muz - ürün kodu: 2");
        urunler.add("Elma - ürün kodu: 3");
        urunler.add("Erik - ürün kodu: 4");
        urunler.add("Çilek - ürün kodu: 5");

        urunFiyatlar.add(15.0);
        urunFiyatlar.add(18.0);
        urunFiyatlar.add(8.0);
        urunFiyatlar.add(47.0);
        urunFiyatlar.add(27.0);

        System.out.println(urunler);

        musteriSecim();


    }

    private static void musteriSecim() {

        System.out.print("Seçtiğiniz ürünün kodunu girin: ");
        int secim = scan.nextInt();
        System.out.print("Seçtiğiniz üründen kaç kg alacaksınız: ");
        double kilo = scan.nextDouble();
        double urunTurari = kilo * urunFiyatlar.get(secim - 1);
        toplamOdeme += urunTurari;

        System.out.print("Alışverişe devam etmek istiyorsanız 1 kasa için 2 seçin: ");
        int devamMi = scan.nextInt();
        if (devamMi == 1) {
            musteriSecim();
        } else {
            kasa();
        }

    }

    private static void kasa() {

        System.out.println("Borcunuz = " + toplamOdeme + " Yine bekleriz.");

    }
}
