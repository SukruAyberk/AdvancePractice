package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sayi = 1;
        double sonuc = 0;
        boolean tamkare = false;

        while (sayi > 0) {
            System.out.print("Bir sayı girin: ");
            sayi = scan.nextDouble();
            sonuc = Math.sqrt(sayi);

            if (sayi <= 0) {
                System.out.println("Sıfır veya küçük bir sayı girdiğiniz için döngü bitti");
                break;
            }

            if (sonuc * sonuc == sayi) {
                tamkare = true;
                System.out.println(tamkare);
            } else {
                tamkare = false;
                System.out.println(tamkare);
            }
        }


    }
}
