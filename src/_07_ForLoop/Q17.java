package _07_ForLoop;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz:");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.println();
                }
            }
            // System.out.println();
        }


    }
}


