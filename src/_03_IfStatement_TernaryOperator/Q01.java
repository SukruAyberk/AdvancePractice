package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplama için 1\nÇıkarma için 2\nBölme için 3\nÇarpma için 4");
        System.out.println("Lütfen iki tam sayı giriniz: ");

        double sayi1 = scan.nextInt();
        double sayi2 = scan.nextInt();
        System.out.println("Girdiğiniz sayılar: " + "Sayı1 = " + sayi1 + ", Sayı2 = " + sayi2);

        int islem = scan.nextInt();

        if (islem == 1) {
            System.out.println("Toplam: " + sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
        } else if (islem == 2) {
            System.out.println("Çıkarma: " + sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Bölüm: " + sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
        } else if (islem == 4) {
            System.out.println("Çarpım: " + sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
        } else {
            System.out.println("Lütfen menüden geçerli bir işlem seçiniz!");
        }

    }

}
