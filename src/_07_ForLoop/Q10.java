package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime girin: ");
        String str = scan.next();
        String sesliHarfler = "aeıiouöüAEIİOUÖÜ";
        boolean isSesliHarf = false;

        for (int i = 0; i < sesliHarfler.length(); i++) {
            if (str.substring(0, 1).equals(sesliHarfler.substring(i, i + 1))) {
                isSesliHarf = true;
            }
        }
        if (isSesliHarf) {
            System.out.println(str + " harfi seslidir.");
        } else {
            System.out.println(str + " harfi sesli değildir.");
        }


    }
}


