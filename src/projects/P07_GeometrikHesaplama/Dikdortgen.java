package projects.P07_GeometrikHesaplama;

public class Dikdortgen extends Sekil {

    public Dikdortgen() {
    }

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public double cevreHesapla() {
        return super.cevreHesapla();
    }

    @Override
    public double alanHesapla() {
        return super.alanHesapla();
    }

    @Override
    public String toString() {
        return "Dikdortgen {" + "uzunKenar=" + uzunKenar + ", kisaKenar=" + kisaKenar + " Alan= " + alanHesapla() + " Çevre= " + cevreHesapla() + '}';
    }
}
