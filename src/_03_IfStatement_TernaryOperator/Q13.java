package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci kenarı giriniz: ");
        int kenar1 = scan.nextInt();

        System.out.println("Lütfen ikinci kenarı giriniz: ");
        int kenar2 = scan.nextInt();

        System.out.println("Lütfen üçüncü kenarı giriniz: ");
        int kenar3 = scan.nextInt();

        if ((kenar1 * kenar1) + (kenar2 * kenar2) == (kenar3 * kenar3)) {
            System.out.println("Bu bir dik üçgendir");
        } else {
            System.out.println("Bu bir dik üçgen değildir.");
        }

    }
}
