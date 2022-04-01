package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ayı sayı olarak girin: ");
        int month = scanner.nextInt();
        int gun;


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gun = 31;
                System.out.println(gun);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gun = 30;
                System.out.println(gun);
                break;
            case 2:
                System.out.print("Lütfen yilinizi girin: ");
                int yil = scanner.nextInt();

                if (yil % 4 == 0) {
                    gun = 29;
                    System.out.println(gun);
                } else {
                    gun = 28;
                    System.out.println(gun);
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir ay girin!");


        }


    }
}

