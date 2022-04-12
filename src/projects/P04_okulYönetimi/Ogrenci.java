package projects.P04_okulYönetimi;

public class Ogrenci extends Kisi {

    String no;
    String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String no, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.no = no;
        this.sinif = sinif;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", no='" + no + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
