package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen vize giriniz: ");
        double vizeNotu = scan.nextInt();

        System.out.println("Lütfen final giriniz: ");
        double finalNotu = scan.nextInt();

        double avg = (vizeNotu * 0.4) + (finalNotu * 0.6);

        if (avg >= 50) {
            System.out.println("Tebrikler başarıyla geçtiniz.");
        } else {
            System.out.println("Maalesef dersten kaldınız.");
        }

    }
}
