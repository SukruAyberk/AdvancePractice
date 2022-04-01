package _07_ForLoop;

import java.util.Scanner;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf gir: ");
        char harf = scan.next().charAt(0);

        for (char i = 'A'; i <= harf ; i++) {
            for (char j = 'A'; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
