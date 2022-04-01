package _07_ForLoop;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        int sayi = 10;

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */

        sayi = 9;
        for (int i = sayi; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */

        System.out.println();

        sayi = 10;
        for (int i = sayi; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */

        System.out.println();

        sayi = 9;

        for (int i = 0; i < sayi ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
