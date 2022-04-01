package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */

        Scanner scan = new Scanner(System.in);
        String x = "";

        do {
            System.out.println("Program çalışıyor çıkmak için x'e basın: ");
            x = scan.next();
        } while (!x.equalsIgnoreCase("x"));
        System.out.println("Program bitti.");



    }
}
