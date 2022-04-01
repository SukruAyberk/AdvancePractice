package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

        System.out.println("1-Info\n2-Para Yatırma\n3-Para Çekme\n0-Çıkış");
        secim();


    }

    private static void secim() {
        System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 0:
                cikis();
                break;
        }

    }

    private static void paraCekme() {
        System.out.println("Çekmek istediğiniz miktarı girin: ");
        int cekilenPara = scan.nextInt();

        if (cekilenPara > bakiye) {
            System.out.println("Bakiyeniz yetersiz.");
        } else {
            bakiye -= cekilenPara;
            System.out.println("Güncel bakiyeniz: " + bakiye);
        }

        System.out.println("   ****   ");


        System.out.println("İşleme devam etmek istiyorsanız 1 girin\nİşleme devam etmek istemiyorsanız 0 girin ");
        int karar = scan.nextInt();

        if (karar == 1) {
            secim();
        } else {
            cikis();
        }

    }

    private static void cikis() {
        System.out.println("Çıkışınız yapıldı yine bekleriz.");
    }

    private static void paraYatirma() {
        System.out.println("Yatıracağınız miktarı girin: ");
        int yatirilanPara = scan.nextInt();
        bakiye += yatirilanPara;
        System.out.println("Güncel bakiyeniz: " + bakiye);

        System.out.println("   ****   ");

        System.out.println("İşleme devam etmek istiyorsanız 1 girin\nİşleme devam etmek istemiyorsanız 0 girin ");
        int karar = scan.nextInt();

        if (karar == 1) {
            secim();
        } else {
            cikis();
        }

    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.println("   ****   ");

        System.out.println("İşleme devam etmek istiyorsanız 1 girin\nİşleme devam etmek istemiyorsanız 0 girin ");
        int karar = scan.nextInt();

        if (karar == 1) {
            secim();
        } else {
            cikis();
        }


    }


}



