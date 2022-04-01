package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("string gir: ");
        String str = scan.nextLine();

        boolean kontrol = kontrolMethod(str);
        System.out.println(kontrol);

    }

    private static boolean kontrolMethod(String str) {
        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }

    }


}
