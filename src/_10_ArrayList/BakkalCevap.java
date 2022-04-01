package _10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BakkalCevap {

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

    static Scanner scan = new Scanner(System.in);
    static List<String> gunler = new ArrayList<String>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<Double>();
    static double ciro = 0;


    public static void main(String[] args) {
        int gun = 0;
        while (gun < 7) {
            System.out.print("Lütfen " + gunler.get(gun) + " gününün kazancını girin: ");
            double gunlukHasilat = scan.nextDouble();
            gunlukKazanclar.add(gunlukHasilat);
            ciro += gunlukHasilat;
            gun++;
        }

        getOrtalamaKazanc2();
        getOrtalamaninUstundeKazancGünleri2();

    }

    private static String getOrtalamaninUstundeKazancGünleri2() {
        String ortlamaUstuGun = "";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc2()) {
                ortlamaUstuGun += gunler.get(i);
            }

        }
        return ortlamaUstuGun;
    }

    private static double getOrtalamaKazanc2() {
        double ortalamaKazanc = ciro / gunler.size();
        return ortalamaKazanc;
    }
}
