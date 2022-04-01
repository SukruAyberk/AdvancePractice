package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = scan.nextInt();

        System.out.println(rakamlarToplami(sayi));


    }

    private static int rakamlarToplami(int sayi) {
        int toplam = 0;
        int rakam = 0;

        while (sayi > 0) {

            rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;

        }

        return toplam;

    }

}
