package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen x eksenini giriniz: ");
        int x = scan.nextInt();
        System.out.print("Lütfen y eksenini cinsinden giriniz: ");
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(x + ", " + y + " birinci bölgededir.");
        } else if (x < 0 && y > 0) {
            System.out.println(x + ", " + y + " ikinci bölgededir.");
        } else if (x < 0 && y < 0) {
            System.out.println(x + ", " + y + " üçüncü bölgededir.");
        } else if (x > 0 && y < 0) {
            System.out.println(x + ", " + y + " dördüncü bölgededir.");
        } else if (x > 0 && y == 0) {
            System.out.println(x + ", " + y + " +x ekseni üzerindedir.");
        } else if (x < 0 && y == 0) {
            System.out.println(x + ", " + y + " -x ekseni üzerindedir.");
        } else if (x == 0 && y > 0) {
            System.out.println(x + ", " + y + " +y ekseni üzerindedir.");
        } else if (x == 0 && y < 0) {
            System.out.println(x + ", " + y + " -y ekseni üzerindedir.");
        } else {
            System.out.println(x + ", " + y + " orjindedir.");
        }

        // ya da

        if (x > 0 && y > 0) {
            System.out.println(x + ", " + y + " birinci bölgededir.");
        } else if (x < 0 && y > 0) {
            System.out.println(x + ", " + y + " ikinci bölgededir.");
        } else if (x < 0 && y < 0) {
            System.out.println(x + ", " + y + " üçüncü bölgededir.");
        } else if (x > 0 && y < 0) {
            System.out.println(x + ", " + y + " dördüncü bölgededir.");
        } else if (x != 0 && y == 0) {
            System.out.println(x + ", " + y + " x ekseni üzerindedir.");
        } else if (x == 0 && y != 0) {
            System.out.println(x + ", " + y + " y ekseni üzerindedir.");
        } else {
            System.out.println(x + ", " + y + " orjindedir.");
        }


    }

}

