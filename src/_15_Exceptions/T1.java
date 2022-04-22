package _15_Exceptions;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int v = 0;
        int f = 0;

        try {
            System.out.println("Vize notunu girin: ");
            v = scanner.nextInt();

            System.out.println("Final notunu girin: ");
            f = scanner.nextInt();

            if (v < 0 || v > 100 || f < 0 || f > 100) {
                throw new ArithmeticException();
            } else {
                double avg = (0.4 * v) + (0.6 * f);
                System.out.println("Ortalama: " + avg);
            }

        } catch (ArithmeticException e) {
            System.out.println("Notlar 0-100 arasında olmalı");
        }


    }
}
