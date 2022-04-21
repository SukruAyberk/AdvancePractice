package projects.P07_GeometrikHesaplama;

public class Sekil {

    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil() {

    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public double cevreHesapla() {
        return (uzunKenar + kisaKenar) * 2;
    }

    public double alanHesapla() {
        return (uzunKenar * kisaKenar);
    }

    public double cemberCevreHesapla() {
        return (2 * Math.PI * yariCap);
    }

    public double cemberAlanHesapla() {
        return (Math.PI * yariCap * yariCap);
    }


}
