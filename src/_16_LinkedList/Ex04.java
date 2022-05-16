package _16_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
		
			/*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

			 		LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("haluk", "ipek", "harun", "irem"));

                     Scanner scan = new Scanner(System.in);
                     System.out.print("isim giriniz : ");

                     String isim =scan.nextLine().toLowerCase();
                     if (ll1.remove(isim)){
                     System.out.println("Bu isim LinkedList'de vardi ve silindi");
                     System.out.println("silinmiş hali ile list : "+ll1);

        }            else System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
			 	
			 */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("haluk", "ipek", "harun", "irem"));
        System.out.println(ll1);
        Scanner scan = new Scanner(System.in);
        System.out.println("İsim gir: ");
        String name = scan.nextLine().toLowerCase();
        if (ll1.remove(name)) {
            System.out.println(name + " ismi LinkedListte vardı ve silindi");
            System.out.println("Yeni liste " + ll1);
        } else {
            System.out.println(name + " ismi listede yok");
        }


    }
}

