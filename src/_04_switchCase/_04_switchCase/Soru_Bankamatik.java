package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        int yeniBakiye;

        System.out.print("Lütfen şifrenizi girin: ");
        int password = scan.nextInt();

        if (password == 1234) {
            System.out.println("Şifreniz doğru giriş yapılıyor...");

            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:\n1-Info\n2-Para Yatirma\n3-Para cekme\n0-Cikis ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Hesap bakiyeniz: " + bakiye);
                    break;
                case 2:
                    System.out.println("Lütfen yatırmak istediğiniz miktarı girin: ");
                    int yatirilanPara = scan.nextInt();
                    yeniBakiye = bakiye + yatirilanPara;
                    System.out.println("Hesap bakiyeniz: " + yeniBakiye);
                    break;
                case 3:
                    System.out.println("Lütfen çekmek istediğiniz miktarı girin: ");
                    int cekilenPara = scan.nextInt();
                    if (bakiye < cekilenPara) {
                        System.out.println("Çekmek istediğiniz miktar kadar bakiyeniz yok!");
                    } else {
                        yeniBakiye = bakiye - cekilenPara;
                        System.out.println("Hesap bakiyeniz: " + yeniBakiye);
                    }
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor iyi günler.");
                    break;
            }
        } else {
            System.out.println("Yanlış şifre girdiniz tekrar deneyin.");
        }


    }
}

