package _07_ForLoop;

import java.util.Scanner;

public class Q13 {


    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle gir: ");
        String cumle = scanner.nextLine();
        System.out.print("Bulmak istediğiniz harfi girin: ");
        String harf = scanner.next();
        int harfToplami = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf.charAt(0)) {
                harfToplami++;
            }
        }
        System.out.println(harf + " harfi cümlede " + harfToplami + " kadar geçiyor.");

    }

}
