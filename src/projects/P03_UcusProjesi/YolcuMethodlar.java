package projects.P03_UcusProjesi;

import java.util.Scanner;

public class YolcuMethodlar {
    static int bKm = 500;
    static int cKm = 700;
    static int dKm = 900;


    public static double sehirToplamUcret(String city, double toplamUcret) {

        switch (city) {

            case "B":
                toplamUcret = bKm * 0.1;
                break;
            case "C":
                toplamUcret = cKm * 0.1;
                break;
            case "D":
                toplamUcret = dKm * 0.1;
                break;
            default:
                System.out.println("Geçerli bir şehir seçiminde bulunun!");

        }
        return toplamUcret;
    }

    public static String getYasKategori(int yas) {

        String yasKategori = "";

        if (yas <= 12) {
            yasKategori = "Çocuk";
        } else if (yas <= 24) {
            yasKategori = "Genç";
        } else if (yas <= 65) {
            yasKategori = "Yetişkin";
        } else {
            yasKategori = "Yaşlı";
        }

        return yasKategori;
    }

    public static double yasIndirimiHesapla(double toplamUcret, String yasKategori) {

        if (yasKategori.equals("Çocuk")) {
            toplamUcret = toplamUcret * 0.5;
        } else if (yasKategori.equals("Genç")) {
            toplamUcret = toplamUcret * 0.9;
        } else if (yasKategori.equals("Yetişkin")) {
            toplamUcret = toplamUcret;
        } else if (yasKategori.equals("Yaşlı")) {
            toplamUcret = toplamUcret * 0.7;
        }

        return toplamUcret;
    }

    public static double gidisDonusIndirimi(double toplamUcret, int flytype) {

        if (flytype == 1) {
            toplamUcret = toplamUcret;
        } else if (flytype == 2) {
            toplamUcret = (toplamUcret * 0.80) * 2;
        } else {
            System.out.println("Geçerli bir değer girmediniz!");
        }

        return toplamUcret;
    }
}
