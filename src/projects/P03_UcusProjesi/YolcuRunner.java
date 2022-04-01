package projects.P03_UcusProjesi;

import java.util.Scanner;

public class YolcuRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Yolcu yolcu = new Yolcu();
        double toplamUcret = 0;

        System.out.println("Java Airlines'a hoşgeldiniz.");
        System.out.print("İsminiz ve soyisminiz: ");
        yolcu.isimSoyisim = scanner.nextLine();

        System.out.print("Hangi şehre gitmek istersiniz(B, C, D): ");
        yolcu.city = scanner.next().substring(0, 1).toUpperCase();
        toplamUcret = YolcuMethodlar.sehirToplamUcret(yolcu.city, toplamUcret);

        System.out.print("Yaşınız: ");
        yolcu.yas = scanner.nextInt();
        yolcu.yasKategori = YolcuMethodlar.getYasKategori(yolcu.yas);

        toplamUcret = YolcuMethodlar.yasIndirimiHesapla(toplamUcret, yolcu.yasKategori);

        System.out.print("Gidiş için 1, Gidiş-Dönüş için 2 tuşlayın: ");
        yolcu.flytype = scanner.nextInt();

        toplamUcret = YolcuMethodlar.gidisDonusIndirimi(toplamUcret, yolcu.flytype);

        System.out.println("Tarifeniz için toplam ücret: " + toplamUcret);


    }


}
