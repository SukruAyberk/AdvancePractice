package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan = new Scanner(System.in);
        System.out.print("Pazartesi: 1\nSalı: 2\nCarsamba: 3\nPersembe: 4\nCuma: 5\nCumartesi: 6\nPazar: 7\nLutfen haftanin kacinci gununde oldunu girin: ");
        int gun = scan.nextInt();

        if (gun <= 0 || gun > 7) {
            System.out.println("Yanlis deger girdiniz!");
        } else {
            System.out.print("Kac gun sonrasini ogrenmek istiyorsunuz: ");
            int kacGunSonrasi = scan.nextInt();
            int bulunanGun = (kacGunSonrasi + gun) % 7;
            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden Pazar");
                    break;
                default:
                    System.out.println("Haftada 7 gun vardir.");
            }
        }
    }
}

