package _15_Exceptions;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunu girin: ");
        int v = scanner.nextInt();

        System.out.println("Final notunu girin: ");
        int f = scanner.nextInt();

        if (v < 0 || v > 100 || f < 0 || f > 100) {
            System.out.println("Notlar 0-100 arasında olmalı");
        } else {
            double avg = (0.4 * v) + (0.6 * f);
            System.out.println("Ortalama: " + avg);
        }


    }
}
