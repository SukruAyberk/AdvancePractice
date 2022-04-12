package tasks;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını girin: ");
        int n = scan.nextInt();

        System.out.println("r sayısını girin: ");
        int r = scan.nextInt();
        int ncarpim = 1;
        int rcarpim = 1;
        int NR = n - r;
        int NRCarpim = 1;
        int kombinasyon = 0;
        int permutasyon = 0;

        for (int i = 1; i <= n; i++) {
            ncarpim *= i;
        }

        for (int i = 1; i <= r; i++) {
            rcarpim *= i;
        }

        for (int i = 1; i <= NR; i++) {
            NRCarpim *= i;
        }

        kombinasyon = ncarpim / (rcarpim * NRCarpim);
        permutasyon = ncarpim / NRCarpim;

        System.out.println("Kombinasyon: " + kombinasyon);
        System.out.println("Permutasyon: " + permutasyon);

    }
}
