package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        // 100 tane case oluştur alt alta 0-50 için mesela 49 tane oluştur 49'a D yazdır -_-

        Scanner scan = new Scanner(System.in);
        System.out.print("notunuzu girin: ");
        int note = scan.nextInt();

        switch (note) {
            case 0 - 49:
                System.out.println("D");
                break;
            case 50, 59:
                System.out.println("C");
                break;
            case 60 - 79:
                System.out.println("B");
                break;
            case 80 - 100:
                System.out.println("A");
                break;


        }

    }
}
