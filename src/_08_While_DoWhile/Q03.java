package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı gir: ");
        int sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı gir: ");
        int sayi2 = scan.nextInt();
        int sonuc = 1;
        int kuvvet = sayi2;


        while (kuvvet != 0) {

            sonuc = sonuc * sayi1;
            kuvvet--;

        }

        System.out.println(sayi1 + " üssü " + sayi2 + " = " + sonuc);
    }


}
