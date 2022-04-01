package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String pinHafiza = "1234";
        int count = 3;

        do {
            System.out.print("Pin kodunuz: ");
            String pin = scan.nextLine();

            if (pin.equalsIgnoreCase(pinHafiza)) {
                System.out.println("Şireniz doğru");
                break;
            } else {
                count--;
                if (count > 0) {
                    System.out.println("Şifreniz yanlış " + count + " hakkınız kaldı");
                } else {
                    System.out.println("Hakkınız kalmadı daha sonra tekrar deneyin.");
                }

            }

        } while (count > 0);
    }
}
