package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("cevrim yapacağınız işlemi seçiniz: ");
        String secim = scan.nextLine();

        System.out.print("Çevrim miktarını girin: ");
        double miktar = scan.nextDouble();


        donustur(secim, miktar);


    }

    private static void donustur(String secim, double miktar) {

        switch (secim) {
            case "saat":
                System.out.println("merak ettiğin saat " + miktar * 60 * 60 + " saniyedir.");
                break;
            case "mil":
                System.out.println("merak ettiğin mil " + miktar * 1.61 + " km'dir.");
                break;
            case "kg":
                System.out.println("merak ettiğin kilo " + miktar * 1000 + " gramdır.");
                break;
            default:
                System.out.println("Lütfen seçiminizi doğru yapın");


        }

    }


}

