package _07_ForLoop;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string gir: ");
        String str = scan.nextLine();

        reverseString(str);

    }

    private static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }

    }
}
