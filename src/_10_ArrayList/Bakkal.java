package _10_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {

    static Scanner scan = new Scanner(System.in);
    static List<String> gunler = new ArrayList<String>();
    static List<Double> gunlukKazanclar = new ArrayList<Double>();
    static double ortalamaKazanc = 0;

    public static void main(String[] args) {


        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */


        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        int i = 0;
        while (i < 7) {
            System.out.print("Lütfen " + gunler.get(i) + " gününün kazancını girin: ");
            gunlukKazanclar.add(scan.nextDouble());
            i++;
        }

        getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanç: " + ortalamaKazanc);

        List<String> ortlamaKazancUstuGunler = getOrtalamaninUstundeKazancGünleri(gunler, ortalamaKazanc, gunlukKazanclar);
        System.out.println("Ortalama kazançtan fazla olan günler : " + ortlamaKazancUstuGunler);

        List<String> ortalamaKazancAltiGunler = getOrtalamaninAltindaKazancGünleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalama kazançtan az olan günler : " + ortalamaKazancAltiGunler);


    }

    private static List<String> getOrtalamaninAltindaKazancGünleri(List<String> gunler, List<Double> gunlukKazanclar, double ortalamaKazanc) {
        List<String> sonuc = new ArrayList<String>();

        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i) < ortalamaKazanc) {
                sonuc.add(gunler.get(i));
            }

        }

        return sonuc;
    }

    private static List<String> getOrtalamaninUstundeKazancGünleri(List<String> gunler, double ortalamaKazanc, List<Double> gunlukKazanclar) {
        List<String> sonuc = new ArrayList<String>();

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {
                sonuc.add(gunler.get(i));
            }
        }

        return sonuc;
    }


    private static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
        double toplam = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplam += gunlukKazanclar.get(i);
        }
        ortalamaKazanc = toplam / gunlukKazanclar.size();
        return ortalamaKazanc;
    }
}
