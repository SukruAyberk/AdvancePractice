package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 kelimeden oluşan isim girin: ");
        String isim = scanner.nextLine();

        String name1 = isim.substring(0, 1);
        String name2 = isim.substring(isim.indexOf(" ") + 1, isim.indexOf(" ") + 2);
        String name3 = isim.substring(isim.lastIndexOf(" ") + 1, isim.lastIndexOf(" ") + 2); // sondan başlayarak en yakın boşluğu bulduk ve boluktan sonraki 1, 2 aralığını aldık

        System.out.println(name1 + "." + name2 + "." + name3 + ".");

    }
}
