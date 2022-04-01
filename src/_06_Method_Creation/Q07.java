package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("string gir: ");
        String str = scan.nextLine();

        reverseString(str);

    }

    private static void reverseString(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }

    }

}
