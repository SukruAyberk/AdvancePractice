package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    static boolean isArmstrong = false;
    static int armstrong = 0;
    static int rakam = 0;


    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = scan.nextInt();

        boolean isArmstrong = isArmstrong(sayi);

        if (sayi == armstrong) {
            isArmstrong = true;
            System.out.println(sayi + " sayısı = " + armstrong + " olduğundan armstrong sayıdır");
        } else {
            System.out.println(sayi + " sayısı != " + armstrong + " olduğundan armstrong sayı değildir.");
        }


    }

    private static boolean isArmstrong(int sayi) {


        while (sayi > 0) {


            rakam = sayi % 10;

            armstrong = armstrong + (rakam * rakam * rakam);

            sayi /= 10;

        }


        return isArmstrong;
    }

}
