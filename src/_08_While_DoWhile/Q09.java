package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scanner = new Scanner(System.in);
        int pin = 1234;
        int girilenPin = 0;

        do {
            System.out.print("Lütfen pin kodunuzu girin: ");
            girilenPin = scanner.nextInt();
            if (pin != girilenPin) {
                System.out.println("Hatalı giriş.");
            }
        } while (pin != girilenPin);
        System.out.println("Girişiniz doğru.");


    }
}

