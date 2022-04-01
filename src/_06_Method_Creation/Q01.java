package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir String girin: ");
        String str = scan.nextLine();

        String modifiedString = returnMethod(str);
        System.out.println(modifiedString);


    }

    private static String returnMethod(String str) {
        String yeniString = "";

        if (str.startsWith("gh")) {
            yeniString = str;
        } else if (str.startsWith("g")) {
            yeniString = str.substring(0, 1) + str.substring(2);
        } else if (str.substring(1, 2).equalsIgnoreCase("h")) {
            yeniString = str.substring(1);
        } else {
            yeniString = str.substring(2);
        }

        return yeniString;
    }


}

