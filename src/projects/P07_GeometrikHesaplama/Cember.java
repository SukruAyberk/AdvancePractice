package projects.P07_GeometrikHesaplama;

public class Cember extends Sekil {

    public Cember() {
    }

    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public double cemberCevreHesapla() {
        return super.cemberCevreHesapla();
    }

    @Override
    public double cemberAlanHesapla() {
        return super.cemberAlanHesapla();
    }

    @Override
    public String toString() {
        return "Cember {" + "yariCap=" + yariCap + " Çevre= " + cemberCevreHesapla() + " Alan= " + cemberAlanHesapla() + '}';
    }
}
