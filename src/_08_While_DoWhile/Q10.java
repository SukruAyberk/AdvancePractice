package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int sayac = 1;
        int enBuyukSayi = Integer.MIN_VALUE;

        do {
            System.out.print("Birinci sayıyı gir: ");
            sayi = scan.nextInt();

            if (sayi >= enBuyukSayi) {
                enBuyukSayi = sayi;
            }
            sayac++;
        } while (sayac <= 5);
        System.out.println("En büyük sayi = " + enBuyukSayi);


    }
}


