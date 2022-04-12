package projects.P04_okulYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methodlar {

    static Scanner scan = new Scanner(System.in);
    static List<Kisi> ogrenciLists = new ArrayList<Kisi>();
    static List<Object> ogretmenLists = new ArrayList<Object>();
    static String kisiTuru;

    public static void panel() {
        System.out.println("OBS\n1-Ogrenci islemi\n2-Ogretmen İşlemi\n3-Çıkış");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kisiTuru = "OGRENCI";
                menu();
                break;
            case 2:
                kisiTuru = "OGRETMEN";
                menu();
                break;
            case 3:
                cikis();
                break;
            default:
                System.out.println("Yanlış giriş!");
                panel();
        }


    }

    private static void cikis() {
        System.out.println("Çıkış yapılıyor...");
    }

    private static void menu() {
        System.out.println(kisiTuru + " için işleminizi seçin");
        System.out.println("1-Ekleme\n2-Arama\n3-Listeleme\n4-Silme\n5-Ana Menü");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                ekleme();
                menu();
                break;
            case 2:

                menu();
                break;
            case 3:
                listeleme();
                menu();
                break;
            case 4:

                menu();
                break;
            case 5:
                panel();
                break;
        }

    }

    private static void listeleme() {

        System.out.println("Aşağıdan seçiminizi yapın");
        System.out.println("1-Öğrenci\n2-Öğretmen");
        String secim = "";
            secim = scan.next();
        if (secim.equalsIgnoreCase("1")) {
            for (int i = 0; i < ogrenciLists.size(); i++) {
                System.out.println(ogrenciLists.get(i));
            }
        } else if (secim.equalsIgnoreCase("2")) {
            for (int i = 0; i < ogretmenLists.size(); i++) {
                System.out.println(ogretmenLists.get(i));
            }
        } else {
            System.out.println("Hatalı seçim");
            listeleme();
        }

    }

    private static void ekleme() {

        System.out.println(kisiTuru + " ekleme menüsü");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.print("Ad-soyad girin: ");
            scan.nextLine();
            String adSoyad = scan.nextLine();

            System.out.print("Kimlik no: ");
            String kimlikNo = scan.next();

            System.out.print("Yaş: ");
            int yas = scan.nextInt();

            System.out.print("No: ");
            String no = scan.next();

            System.out.print("Sınıf: ");
            String sinif = scan.next();

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, no, sinif);
            ogrenciLists.add(ogrenci);


        } else if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {

            System.out.print("Ad-soyad girin: ");
            scan.nextLine();
            String adSoyad = scan.nextLine();

            System.out.print("Kimlik no: ");
            String kimlikNo = scan.next();

            System.out.print("Yaş: ");
            int yas = scan.nextInt();

            System.out.print("Sicil No: ");
            String sicilNo = scan.next();

            System.out.print("Branş: ");
            String brans = scan.next();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, brans);
            ogretmenLists.add(ogretmen);


        }

    }

}
