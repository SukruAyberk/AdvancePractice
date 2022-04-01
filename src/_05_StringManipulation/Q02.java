package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Isminizi ve soyismizi girin: ");
        String isim = scan.nextLine();

        String name = isim.substring(0, isim.indexOf(" "));
        String lastName = isim.substring(isim.indexOf(" ") + 1, isim.length());

        System.out.println(name);
        System.out.println(lastName);

    }
}
