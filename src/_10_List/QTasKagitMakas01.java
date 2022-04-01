package _10_List;

import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas01 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */

        Random rnd = new Random();
        int rastgele = 0;
        int secim = 1;


        while (secim != 0) {
            rastgele = rnd.nextInt(3);
            System.out.print("Taş için 0\nKağıt için 1\nMakas için 2\nÇıkış için 3 seçin: ");
            secim = scan.nextInt();


            switch (secim) {
                case 0:
                    tasSonuc(secim, rastgele);
                    break;
                case 1:
                    kagitSonuc(secim, rastgele);
                    break;
                case 2:
                    makasSonuc(secim, rastgele);
                    break;
                case 3:
                    tkmCikis();
                    break;
                default:
                    System.out.print("Lütfen geçerli bir değer girin: ");
            }

            System.out.println("Çıkış için 0'a basabilirsiniz: ");
            secim = scan.nextInt();

            if (secim == 0) {
                tkmCikis();
            }


        }


    }


    private static void tkmCikis() {

        System.out.println("Çıkış yapılıyor...");
    }

    private static void makasSonuc(int secim, int rastgele) {
        if (rastgele == 0) {
            System.out.println("Kaybettiniz. Taş makası kırar.");
        } else if (rastgele == 1) {
            System.out.println("Kazandınız. Makas kağıdı keser.");
        } else if (rastgele == 2) {
            System.out.println("Berabere kaldınız. İkiniz de makas seçtiniz.");
        }
    }

    private static void kagitSonuc(int secim, int rastgele) {
        if (rastgele == 0) {
            System.out.println("Kazandınız. Kağıt taşı sarar.");
        } else if (rastgele == 1) {
            System.out.println("Berabere kaldınız. İkiniz de kağıt seçtiniz.");
        } else if (rastgele == 2) {
            System.out.println("Kaybettiniz. Makas kağıdı keser.");
        }
    }

    private static void tasSonuc(int secim, int rastgele) {
        if (rastgele == 0) {
            System.out.println("Berabere kaldınız. İkiniz de taş seçtiniz.");
        } else if (rastgele == 1) {
            System.out.println("Kaybettiniz. Kağıt taşı sarar.");
        } else if (rastgele == 2) {
            System.out.println("Kazandınız. Taş makası kırar.");
        }
    }


}



