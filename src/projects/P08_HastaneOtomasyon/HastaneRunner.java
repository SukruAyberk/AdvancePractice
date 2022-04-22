package projects.P08_HastaneOtomasyon;

import java.util.Scanner;

public class HastaneRunner {

    public static Hastane hastane = new Hastane();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ID'nizi girin: ");
        int ID = scan.nextInt();

        hastane.setHasta(hastaBul(ID));
        System.out.println("Hasta isim - soyisim: " + hastane.getHasta().getIsim() + " " + hastane.getHasta().getSoyIsim());
        scan.nextLine();

        System.out.print("Şikayetiniz nedir: ");
        String hastaDurumu = scan.nextLine();
        String unvan = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));
        System.out.println("Doktor isim - soyisim: " + hastane.getDoktor().getIsim() + " " + hastane.getDoktor().getSoyIsim());
        System.out.println("Unvan: " + hastane.getDoktor().getUnvan());

    }

    private static Hasta hastaBul(int id) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < hastane.hastaIDleri.length; i++) {
            if (id == hastane.hastaIDleri[i]) {
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
            }
        }
        return hasta;
    }


    private static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < hastane.unvanlar.length; i++) {
            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }
        }
        return doktor;
    }

    private static String doktorUnvan(String hastaDurumu) {

        if (hastaDurumu.equals("Allerji")) {
            return hastane.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (hastaDurumu.equals("Diabet")) {
            return hastane.unvanlar[2];
        } else if (hastaDurumu.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        } else if (hastaDurumu.equals("Migren")) {
            return hastane.unvanlar[4];
        } else if (hastaDurumu.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "Yanlış tanı";
    }
}
