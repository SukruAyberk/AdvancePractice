package _14_Encapsulation.Q01;

public class ArabaRunner {

/*
1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- ArabaMain isminde main için bir class oluşturunuz.
 4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 5- aracların motor gücünü 100 beygir ve üstü olması ve yılını hatalı veri girisine karsi kontrol ediniz.

 */

    public static void main(String[] args) {

        Araba toyota = new Araba("Corolla", "Kırmızı", 120, 2019);
        Araba volvo = new Araba(90,2000);
        Araba vw = new Araba();
        vw.setModel("Golf");
        vw.setRenk("Kırmızı");
        vw.setMotor(700);
        vw.setYil(1980);
        System.out.println(toyota);
        System.out.println(volvo);
        System.out.println(vw);

        System.out.println("Model: " + vw.getModel() + ", Renk: " + vw.getRenk() + ", Yıl: " + vw.getYil());

    }



}
