package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet pozitif tam sayı giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c) {
            System.out.println("Üçgeniniz eşkenar üçgendir. " + "a =  " + a + ", b = " + b  + ", c = " + c);
        } else if ((a + b > c && a - b < c) || (a+c>b && b>a-c) || (b+c>a && a>b-c)) {
            System.out.println("Girdiğiniz değerler üçgen olma şartınız sağlıyor. "+ "a =  " + a + ", b = " + b  + ", c = " + c);
        } else {
            System.out.println("Girdiğiniz değerler üçgen olma şartını sağlamıyor.");
        }



    }

}
