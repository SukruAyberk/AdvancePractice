package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(cm) ve kilonuzu(kg) giriniz: ");
        double boy = scan.nextDouble();
        double kilo = scan.nextDouble();
        double bmi = kilo / ((boy/100) * (boy / 100)); //  0.0027763429752066114

        if (bmi > 0) {
            if (bmi <= 20) {
                System.out.println("Vücut kitle indeksiniz: " + bmi + ", oldukça zayıfsınız.");
            } else if (bmi <= 25) {
                System.out.println("Vücut kitle indeksiniz: " + bmi + ", normal sınırlardasınız.");
            } else if (bmi <= 30) {
                System.out.println("Vücut kitle indeksiniz: " + bmi + ", şişman kategoridesiniz.");
            } else {
                System.out.println("Vücut kitle indeksiniz: " + bmi + ", obezsiniz.");
            }
        } else {
            System.out.println("Lütfen girdiğiniz değerleri kontrol ediniz.");
        }


    }

}
