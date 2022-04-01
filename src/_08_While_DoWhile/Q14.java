package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */
        faktoriyelHesapla();
        devamMi();

    }

    private static void devamMi() {
        System.out.print("Devam etmek isterseniz 1'e, Çıkış yapmak isterseniz 0'a basın: ");
        int secim = scan.nextInt();

        if (secim == 1) {
            faktoriyelHesapla();
            devamMi();
        } else if (secim == 0) {
            cikis();
        } else {
            System.out.println("Seçiminizi tekrar girin!");
            devamMi();
        }


    }

    private static void cikis() {
        System.out.println("Çıkış yapılıyor...");
    }

    private static void faktoriyelHesapla() {
        System.out.print("Faktöriyel hesaplamak istediğiniz sayıyı girin: ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
        }
        System.out.println(sayi + " sayısının faktöriyeli = " + faktoriyel);
    }


}


