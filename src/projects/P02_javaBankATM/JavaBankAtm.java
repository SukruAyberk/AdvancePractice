package projects.P02_javaBankATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */

    static double bakiye;
    static String kartNo = "1234123412341234";
    static int sifrem = 1234;
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        int sifre = 0;

        do {
            System.out.print("Lütfen kart numaranızı giriniz: ");
            kartNo = scan.nextLine();

            System.out.print("Lütfen şifrenizi girin: ");
            sifre = scan.nextInt();

            if (sifre != sifrem || kartNo.replace(" ", "").length() != 16) {
                System.out.println("İşlem başarısız, hatalı tuşlama yaptınız!");
            }

        } while (sifre != sifrem || kartNo.replace(" ", "").length() != 16);

        atmPanel();


    }

    private static void atmPanel() {

        System.out.println("Bilgileriniz kontrol ediliyor...");
        System.out.println("Şifreniz doğrulandı.");

        int secim = 0;

        do {
            System.out.println("Lutfen yapmak istediginiz islemi giriniz ↓ "
                    + "\n1->Bakiye sorgula\n2->Para yatirma\n3->Para cekme\n4->Para gonderme"
                    + "\n5->Sifre degistirme \n6->Cikis\n");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    bakiyeSorgula();
                    break;
                case 2:
                    paraYatir();
                    break;
                case 3:
                    paraCek();
                    break;
                case 4:
                    paraGonder();
                    break;
                case 5:
                    sifreDegistir();
                    break;
                case 6:
                    cikis();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapın!");
            }
        } while (secim != 6);
        System.out.println("Çıkış yapıldı!");
    }

    private static void cikis() {
        System.out.print("Bilgi fişi almak ister misiniz?: ");
        char a = scan.next().toUpperCase().charAt(0);

        if (a == 'E') {
            fatura();
        } else {
            System.out.println("Doğayı koruduğunuz için teşekkür ederiz!");
        }


    }

    private static void fatura() {

        LocalDateTime lcd = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy" + " HH.mm");
        lcd.format(dtf);
        System.out.println("+-------------------+\r\n"
                + "|  " + lcd.format(dtf) + "|\r\n"
                + "|                   |\r\n"
                + "|     JAVA BANK     |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|   HALUK'CA DUSUN  |\r\n"
                + "|                   |\r\n"
                + "|    JAVACA YAZ     |\r\n"
                + "|                   |\r\n"
                + "|     TESEKKURLER   |\r\n"
                + "|     JAVACANLAR    |\r\n"
                + "+-------------------+");
    }


    private static void sifreDegistir() {

        System.out.print("Eski şifrenizi doğrulayın: ");
        int sifre = scan.nextInt();

        if (sifre == sifrem) {
            System.out.print("Şifreniz doğrulandı lütfen yeni şifrenizi girin: ");
            sifrem = scan.nextInt();
        } else  {
            System.out.println("Eksik veya hatalı şifre girdiniz!");
        }

    }

    private static void paraGonder() {
        System.out.print("Lütfen para göndermek istediğiniz kişinin IBAN numarasını girin: ");
        scan.nextLine();
        String IBAN = scan.nextLine();

        if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 16) {
            System.out.println("IBAN kontrol ediliyor...");
            System.out.println("Girdiğiniz IBAN onaylandı!");
            System.out.println("\nLutfen gondermek istediginiz tutari giriniz...");
            double havaleTutari = scan.nextDouble();
            
            if (havaleTutari > bakiye) {
                System.out.println("Bakiyeniz yetersiz!");
            } else {
                bakiye -= havaleTutari;
                System.out.println("İşlem tamamlandı!");
            }
            
        } else {
            System.out.println("Geçersiz IBAN!");
        }

    }

    private static void paraCek() {

        System.out.println("Yatırmak istediğiniz tutarı girin: ");
        double cekilecekPara = scan.nextDouble();

        if (cekilecekPara > bakiye) {
            System.out.println("Bakiyeniz yetersiz!");
        } else {
            bakiye -= cekilecekPara;
            System.out.println("İşlem tamamlandı!");
        }



    }

    private static void paraYatir() {

        System.out.println("Yatırmak istediğiniz tutarı girin: ");
        double yatirilacakPara = scan.nextDouble();
        bakiye += yatirilacakPara;
        System.out.println("İşlem tamamlandı!");

    }

    private static void bakiyeSorgula() {

        System.out.println("Bakiyeniz: " + bakiye);

    }
}


