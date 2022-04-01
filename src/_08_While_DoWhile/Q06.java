package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı gir: ");
		int sayi1 = scan.nextInt();

		System.out.print("İkinci sayıyı gir: ");
		int sayi2 = scan.nextInt();

		bolmeMethodu(sayi1, sayi2);

	}

	private static void bolmeMethodu(int sayi1, int sayi2) {

		int sayac = 0;

		while (sayi2 <= sayi1) {

			sayi1 -= sayi2;
			sayac++;

		}
		System.out.println("Bölüm>>"+sayac);
		System.out.println("kalan>>"+sayi1);

	}

}


