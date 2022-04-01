package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int num = scan.nextInt();

        PowersofTwo(num);

    }

    private static void PowersofTwo(int num) {

        if (num % 2 == 0) {
            System.out.println("İkinin kuvveti");
        } else {
            System.out.println("İkinin kuvveti değil");
        }

    }
}

