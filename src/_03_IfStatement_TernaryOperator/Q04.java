package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çalıştığınız alanı giriniz: ");
        String meslek = scan.next();

        String qa = "Quality Analyst";
        String dev = "Developer";
        String ba = "Busines Analyst";
        String pm = "Project Manager";

        if (meslek.equalsIgnoreCase("qa")) {
            System.out.println("Mesleğiniz: " + qa);
        } else if (meslek.equalsIgnoreCase("dev")) {
            System.out.println("Mesleğiniz: " + dev);
        } else if (meslek.equalsIgnoreCase("ba")) {
            System.out.println("Mesleğiniz: " + ba);
        } else if (meslek.equalsIgnoreCase("pm")) {
            System.out.println("Mesleğiniz: " + pm);
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }

    }

}
