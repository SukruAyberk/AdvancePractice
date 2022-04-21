package projects.P07_GeometrikHesaplama;

public class Runner {

    public static void main(String[] args) {

        Cember cember1 = new Cember(5);
        cember1.cemberCevreHesapla();
        cember1.cemberAlanHesapla();
        System.out.println(cember1);

        Dikdortgen dd1 = new Dikdortgen(10,5);
        dd1.cevreHesapla();
        dd1.alanHesapla();
        System.out.println(dd1);

        Kare k1 = new Kare(5,5);
        k1.cevreHesapla();
        k1.alanHesapla();
        System.out.println(k1);

    }
}
