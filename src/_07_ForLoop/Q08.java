package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String str = scan.next();
        String pstr = "";

        // burada plaindrome kelimeyi oluşturduk yani tersten yazdırdık
        for (int i = str.length() - 1; i >= 0; i--) {
            pstr = pstr + str.charAt(i);
        }

        // burada palndrome olup olmadığını kontrol ettik
        if (pstr.equalsIgnoreCase(str)) {
            System.out.println(str + " kelimesi plandrome.");
        } else {
            System.out.println(str + " kelimesi plandrome değil.");
        }

    }

}

