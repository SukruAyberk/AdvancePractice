package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string gir: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        List<String> list = new ArrayList<String>();

        // list'e eklemek istersen
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        System.out.println(list);
        System.out.println(Arrays.toString(words));

        String enUzunKelime = enUzunKelimeBulanMethod(words);
        System.out.println(enUzunKelime);

    }

    private static String enUzunKelimeBulanMethod(String[] words) {
        String sonuc = "";
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                sonuc = words[i];
                max = words[i].length();
            }
        }

        return sonuc;
    }
}
