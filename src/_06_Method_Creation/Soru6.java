package _06_Method_Creation;

import java.util.Scanner;

public class Soru6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("string gir: ");
        String str = scan.nextLine();

        System.out.println(coklukartaktersilme(str));

    }

    private static String coklukartaktersilme(String str) {

        String sonuc = "";
        for (int i = 0; i < str.length() - 1; i++) {
            for (int x = 1; x < str.length(); x++) {
                if (str.charAt(i) == str.charAt(x)) {
                    sonuc += str.charAt(i);
                    str = str.replace(str.substring(x, x + 1), "");

                }
            }
        }
        return (sonuc);
    }
}

