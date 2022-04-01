package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {




        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Vize sınav sonucunu giriniz: ");
        double vizeNotu = scan.nextDouble();
        System.out.print("Vize sınav yüzdesini giriniz: ");
        double vizeYuzde = scan.nextDouble() / 100;

        System.out.print("Final sınav sonucunu giriniz: ");
        double finalNotu = scan.nextDouble();
        System.out.print("Final sınav yüzdesini giriniz: ");
        double finalYuzde = scan.nextDouble() / 100;

        if (vizeNotu < 0 || finalNotu < 0 || vizeNotu > 100 || finalNotu > 100 || (vizeYuzde + finalYuzde < 0) || (vizeYuzde + finalYuzde > 1)) {
            System.out.println("Hatalı değer girdiniz tekrar deneyin.");
        } else {
            double gecmeNotu = (vizeNotu * vizeYuzde) + (finalNotu * finalYuzde);
            System.out.println("Geçme notunuz: " + gecmeNotu);
            if (gecmeNotu >= 90) {
                System.out.println("Not harfiniz AA.");
            } else if (gecmeNotu >= 80) {
                System.out.println("Not harfiniz BA.");
            } else if (gecmeNotu >= 70) {
                System.out.println("Not harfiniz BB.");
            } else if (gecmeNotu >= 60) {
                System.out.println("Not harfiniz CB.");
            } else if (gecmeNotu >= 50) {
                System.out.println("Not harfiniz CC.");
            } else if (gecmeNotu >= 40) {
                System.out.println("Not harfiniz DC.");
            } else if (gecmeNotu >= 30) {
                System.out.println("Not harfiniz DD.");
            } else {
                System.out.println("Not harfiniz FF. Kaldınız.");
            }
        }
    }
}
