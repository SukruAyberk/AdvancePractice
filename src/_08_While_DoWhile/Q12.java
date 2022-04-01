package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        int baslangic = 0;

        while (baslangic <= sayi) {

            if (baslangic % 2 != 0) {
                System.out.println(baslangic);
            }
            baslangic++;

        }


    }
}
