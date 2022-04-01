package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz:");
        int sayi=scan.nextInt();

        for (int i = 1; i<=sayi; i++) {
            for (int j = 1; j <=sayi; j++) {
                if (i+j>=sayi+1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("");



        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
