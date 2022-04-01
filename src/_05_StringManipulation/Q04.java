package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scan.nextLine();

        for (int i = cumle.length() - 1; i >= 0; i--) {
            System.out.print(cumle.substring(i, i + 1));
        }

    }
}
