package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */

        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int n = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int r = scan.nextInt();
        int faktoriyelN = 1;
        int faktoriyelR = 1;
        int faktoriyelNR = 1;
        int NR = n - r;

        System.out.println(NR);

        do {

            faktoriyelN *= n;
            n--;

        } while (n > 0);

        do {

            faktoriyelR *= r;
            r--;

        } while (r > 0);

        do {
            faktoriyelNR *= NR;
            NR--;

        } while (NR > 0);

        System.out.println("n!= " + faktoriyelN);
        System.out.println("r!= " + faktoriyelR);
        System.out.println("(n-r)!= " + faktoriyelNR);

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        System.out.println(kombinasyon);

    }
}

