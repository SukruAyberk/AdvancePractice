package _07_ForLoop;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf gir: ");
        char harf = scan.next().charAt(0);

        for (char i = 'A'; i <= harf ; i++) {
            for (char j = 'A'; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }

}
