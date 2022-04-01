package _06_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {
    static int bolen = 0;
    static boolean isAsal = false;

    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * kaç tane olduğunu sorsaydı sayaçla saydırırdık
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,25,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi = scan.nextInt();

        asalBolenlerMethod(sayi);

    }

    private static void asalBolenlerMethod(int sayi) {

        int asalBolen = 0;

        for (int i = 2; i <= sayi; i++) {

            if (sayi % i == 0) {
                bolen = i;
                asalMi(bolen);
            }
            if (isAsal) {
                asalBolen = bolen;
            }

        }
        System.out.println("Girdiğiniz sayının en büyük asal böleni: " + asalBolen);

    }

    private static boolean asalMi(int bolen) {

        // burada böleni kontrol ediyoruz sayıyı bölen sayı sadece kendisine bölünürse asaldır!

        for (int i = 2; i < bolen; i++) {
            if (bolen % i != 0) { // bölen sayısına kadar tüm tam sayılar böldüğünde kalan sıfır değilse: bu sayı kendisinden başka hiçbir sayıya bölünmez
                isAsal = true;
            } else {
                isAsal = false;
                break;
            }
        }

        return isAsal;

    }


}