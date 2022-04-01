package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi = scanner.nextInt();
        int sayininKaresi = 0;
        int toplam = 0;

        if (sayi > 1) {
            for (int i = 1; i <= sayi; i++) {
                sayininKaresi = i*i;
                toplam += sayininKaresi;
            }
            System.out.println("Girilen sayi = " + sayi);
            System.out.println("Kareler toplamı = " + toplam);
        } else {
            System.out.println("1'den büyük sayı girin!");
        }


    }
}
