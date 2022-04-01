package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adediniz giriniz: ");
        int adet = scan.nextInt();
        System.out.println("Lütfen liste fiyatını giriniz: ");
        double fiyat = scan.nextInt();
        System.out.println("Müşteri kartınız var mı? ");
        String isCustomerCardAvaible = scan.next().toLowerCase();

        if (isCustomerCardAvaible.equals("evet")) {
            if (adet > 10) {
                System.out.println("Fiyat = " + ((fiyat / 20) * 100));
            } else {
                System.out.println("Fiyat = " + ((fiyat / 15) * 100));
            }
        } else {
            if (adet > 10) {
                System.out.println("Fiyat = " + ((fiyat / 15) * 100));
            } else {
                System.out.println("Fiyat = " + ((fiyat / 10) * 100));
            }
        }



    }

}
