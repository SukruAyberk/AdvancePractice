package _10_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

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

        // bu kötü bir çözüm ManavCevap daha iyi

        List<String> urunler = new ArrayList<String>();
        urunler.add("Domates");
        urunler.add("Soğan");
        urunler.add("Marul");
        urunler.add("Biber");
        urunler.add("Patates");
        int secim = -1;
        int adet = 0;
        int toplam = 0;

        while (secim != 0) {
            System.out.print("\nAşağıdaki listeden bir ürün seçin." + "\n1- " + urunler.get(0) + " 5 TL" + "\n2- " + urunler.get(1) + " 5 TL" + "\n3- " + urunler.get(2) + " 7 TL" + "\n4- " + urunler.get(3) + " 7 TL" + "\n5- " + urunler.get(4) + " 9 TL" + "\n");
            System.out.println("Lütfen listeden almak istediğiniz ürünü seçin: ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                case 2:
                    System.out.print("Kaç adet: ");
                    adet = scan.nextInt();
                    toplam += adet * 5;
                    break;
                case 3:
                case 4:
                    System.out.print("Kaç adet: ");
                    adet = scan.nextInt();
                    toplam += adet * 7;
                    break;
                case 5:
                    System.out.print("Kaç adet: ");
                    adet = scan.nextInt();
                    toplam += adet * 9;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız!");
            }

            System.out.print("Devam etmek için 1, çıkmak için sıfıra basın: ");
            secim = scan.nextInt();


        }

        System.out.println("Fişiniz bastırılıyor...");
        System.out.println("Toplam ödemeniz gereken tutar = " + toplam + " TL");


    }
}
