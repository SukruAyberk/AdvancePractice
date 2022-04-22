package projects.P08_HastaneOtomasyon;

public class Hasta {

    private String isim;
    private String soyIsim;
    private String hastaID;
    private Durum hastaDurum;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getHastaID() {
        return hastaID;
    }

    public void setHastaID(String hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurum() {
        return hastaDurum;
    }

    public void setHastaDurum(Durum hastaDurum) {
        this.hastaDurum = hastaDurum;
    }
}
