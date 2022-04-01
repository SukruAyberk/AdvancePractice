package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int age = scan.nextInt();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        int kilo = scan.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("18 yasindan kucuk ise kan bagisi yapamaz");
        } else if (age >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.");
            } else if (kilo >= 50) {
                System.out.println("18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.");
            } else {
                System.out.println("Kilonuzu hatalı girdiniz.");
            }
        } else {
            System.out.println("Yaşınızı hatalı girdiniz.");
        }

    }

}
