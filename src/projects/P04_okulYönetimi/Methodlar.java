package projects.P04_okulYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methodlar {

    static Scanner scan = new Scanner(System.in);
    static List<Kisi> ogrenciLists = new ArrayList<Kisi>();
    static List<Kisi> ogretmenLists = new ArrayList<Kisi>();
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
        System.out.println("1-Ekleme\n2-Arama\n3-Listeleme\n4-Silme\n5-Ana Menü\n6-Cıkış");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                ekleme();
                menu();
                break;
            case 2:
                arama();
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
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatalı giriş!");
                menu();

        }

    }

    private static void arama() {

        System.out.print("Aramak istediğiniz kişinin kimlik nosunu yazın: ");
        scan.nextLine();
        String kimlikNo = scan.nextLine();

        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrenciLists.size(); i++) {
                if (ogrenciLists.get(i).getKimlikNo().equals(kimlikNo)) {
                    System.out.println(ogrenciLists.get(i));
                    break;
                } else {
                    System.out.println("Öğrenci kaydı bulunamadı!");
                }
            }
        } else if (kisiTuru.equals("OGRETMEN")) {
            for (int i = 0; i < ogretmenLists.size(); i++) {
                if (ogretmenLists.get(i).getKimlikNo().equals(kimlikNo)) {
                    System.out.println(ogretmenLists.get(i));
                    break;
                } else {
                    System.out.println("Öğretmen kaydı bulunamadı!");
                }
            }
        }
    }

    private static void listeleme() {

        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrenciLists.size(); i++) {
                System.out.println(ogrenciLists.get(i));
            }
        } else if (kisiTuru.equals("OGRETMEN")) {
            for (int i = 0; i < ogretmenLists.size(); i++) {
                System.out.println(ogretmenLists.get(i));
            }
        }
    }

    private static void ekleme() {

        System.out.println(kisiTuru + " ekleme menüsü");

        System.out.print("Ad-soyad girin: ");
        scan.nextLine().toUpperCase();
        String adSoyad = scan.nextLine();

        System.out.print("Kimlik no: ");
        String kimlikNo = scan.next();

        System.out.print("Yaş: ");
        int yas = scan.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.print("No: ");
            String no = scan.next();

            System.out.print("Sınıf: ");
            String sinif = scan.next().toUpperCase();

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, no, sinif);
            ogrenciLists.add(ogrenci);


        } else if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
            System.out.print("Sicil No: ");
            String sicilNo = scan.next();

            System.out.print("Branş: ");
            String brans = scan.next().toUpperCase();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, brans);
            ogretmenLists.add(ogretmen);

        }

    }

    public static void main(String[] args) {

        panel();

    }

}
