package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("string gir: ");
        String str = scan.nextLine();
        int sayac = 1;

        int kelimeSayisi = kelimeSayisi(str, sayac);
        System.out.println("Number of words in the string: " + kelimeSayisi);

    }

    private static int kelimeSayisi(String str, int sayac) {

        int kelimeSayisi = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.contains(" ")) {
                str = str.replaceFirst(" ", "");
                sayac++;
            } else {
                break;
            }
        }
        kelimeSayisi = sayac;
        return kelimeSayisi;
    }
}
