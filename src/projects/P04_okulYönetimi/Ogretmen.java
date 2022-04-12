package projects.P04_okulYönetimi;

public class Ogretmen extends Kisi{

    String sicilNo;
    String brans;

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String brans) {
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", sicilNo='" + sicilNo + '\'' +
                ", brans='" + brans + '\'' +
                '}';
    }
}
