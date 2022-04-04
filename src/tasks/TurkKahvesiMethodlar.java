package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TurkKahvesiMethodlar {

    static List<String> kahveList = new ArrayList<String>(Arrays.asList("Türk kahvesi", "Filtre Kahve", "Espresso"));
    static Scanner scan = new Scanner(System.in);

    static void menu() {

        System.out.println("1- " + kahveList.get(0));
        System.out.println("2- " + kahveList.get(1));
        System.out.println("3- " + kahveList.get(2));

        String hangiKahve = hangiKahve();
        String sut = sutMethod();
        String seker = sekerMethod();
        String boy = boyMethod();
        sonucMethod(hangiKahve, sut, seker, boy);


    }

    static void sonucMethod(String hangiKahve, String sut, String seker, String boy) {

        if (seker.equalsIgnoreCase("evet")) {
            if (sut.equalsIgnoreCase("evet")) {
                System.out.println(hangiKahve + " kahveniz " + boy + " boy, şekerli ve sütlü bir şekilde hazırdır.");
            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println(hangiKahve + " kahveniz " + boy + " boy, şekerli ve sütsüz bir şekilde hazırdır.");
            }
        } else if (seker.equalsIgnoreCase("hayır")) {
            if (sut.equalsIgnoreCase("evet")) {
                System.out.println(hangiKahve + " kahveniz " + boy + " boy, şekersiz ve sütlü bir şekilde hazırdır.");
            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println(hangiKahve + " kahveniz " + boy + " boy, şekersiz ve sütsüz bir şekilde hazırdır.");
            }
        }

    }

    static String boyMethod() {
        String boy = "";
        System.out.print("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
        boy = scan.nextLine();

        if (boy.equalsIgnoreCase("büyük")) {
            System.out.println("Kahveniz " + boy + " boy hazırlanıyor.");
        } else if (boy.equalsIgnoreCase("orta")) {
            System.out.println("Kahveniz " + boy + " boy hazırlanıyor.");
        } else if (boy.equalsIgnoreCase("küçük")) {
            System.out.println("Kahveniz " + boy + " boy hazırlanıyor.");
        } else {
            System.out.println("Hatalı seçim yaptınız.");
            boyMethod();
        }

        return boy;
    }

    static String sekerMethod() {
        String seker = "";
        int adet = 0;
        System.out.print("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        seker = scan.nextLine();

        if (seker.equalsIgnoreCase("evet")) {
            System.out.print("Kaç adet şeker istersiniz?: ");
            adet = scan.nextInt();
            String bosKod = scan.nextLine();
            System.out.println(adet + " adet şeker ekleniyor... ");
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Şeker eklenmiyor.");
        } else {
            System.out.println("Hatalı seçim yaptınız.");
            sekerMethod();
        }
        return seker;
    }

    static String sutMethod() {
        String sut = "";
        System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        sut = scan.nextLine();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor... ");
        } else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor.");
        } else {
            System.out.println("Hatalı seçim yaptınız.");
            sutMethod();
        }
        return sut;
    }

    static String hangiKahve() {
        String hangiKahve = "";
        System.out.print("Lütfen seçiminizi yapın: ");
        hangiKahve = scan.nextLine();

        if (hangiKahve.equalsIgnoreCase(kahveList.get(0))) {
            System.out.println("Türk kahveniz hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase(kahveList.get(1))) {
            System.out.println("Filtre kahveniz hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase(kahveList.get(2))) {
            System.out.println("Espressonuz hazırlanıyor.");
        } else {
            System.out.println("Hatalı seçim yaptınız.");
            hangiKahve();
        }
        return hangiKahve;
    }

}
