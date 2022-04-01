package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        String sayi = scan.nextLine();
        int sayac = 0;
        String output = "";

        while (sayac < sayi.length()) {
            if (sayi.charAt(sayac) <= '9' && sayi.charAt(sayac) >= '1') {
                if (Integer.valueOf(sayi.charAt(sayac) + "") % 2 == 1) { // noktalı virgülün amacı string değerlerini yazmamızı istememiz koymazsak sayı değerlerini alır
                    output += (sayi.charAt(sayac) + "");
                }
            }

            sayac++;
        }
        System.out.println("Indexi tek sayi olan karakterler: " + output);
    }

}
