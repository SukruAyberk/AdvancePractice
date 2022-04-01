package Interview;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi = scan.nextInt();

        armstrongHesapla(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);

    }

    private static void armstrongHesapla(int sayi) {

        int yeniSayi = sayi;
        int toplam = 0;
        int rakam = 0;

        while (yeniSayi > 0) {

            rakam = yeniSayi % 10;
            toplam = toplam + (rakam * rakam * rakam);
            yeniSayi /= 10;

        }
        if (toplam == sayi) {
            System.out.println(sayi + " = " + toplam + " olduğundan armstrong sayıdır.");
        } else {
            System.out.println(sayi + " != " + toplam + " olduğundan armstrong sayı değildir.");
        }

    }

    public static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {

        for (int i = 0; i <= sayi; i++) {

            armstrongHesapla(i);

        }

    }

}
