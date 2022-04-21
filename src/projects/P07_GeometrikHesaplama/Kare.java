package projects.P07_GeometrikHesaplama;

public class Kare extends Dikdortgen {

    public Kare() {
    }

    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kare {" + "uzunKenar=" + uzunKenar + ", kisaKenar=" + kisaKenar + " Alan= " + alanHesapla() + " Çevre= " + cevreHesapla() + '}';
    }

}
