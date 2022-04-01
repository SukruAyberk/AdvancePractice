package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir string gir: ");
        String str = scanner.nextLine();

        int aHarfiSayisi = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                aHarfiSayisi++;
            } else if (str.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("Stringdeki a harfi sayısı = " + aHarfiSayisi);

    }
}
