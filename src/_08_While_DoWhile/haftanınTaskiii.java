package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Topun düşeceği yuksekligi girin: ");
        double yukseklik = scan.nextDouble();
        double aldigiYol = 0;
        int ziplamaSayac = 0;

        // top düşüyor yani önce aksiyon var şart ise yükseklik bir olana kadar yani şart sonra
        // yanni do while

        do {
            aldigiYol += yukseklik; // ilk olarak ilk düştüğü mesafeyi aldık (inerkenki yükseklik)
            ziplamaSayac++;
            yukseklik *= 0.75; // 3/4
            aldigiYol += yukseklik; // 3/4 kadar yükselecek tekrar düşmesi ise 27. satırda gerçekleşecek (çıkarkenki yükseklik)
        } while (yukseklik >= 1);

        System.out.println("Zıplama sayısı = " + ziplamaSayac);
        System.out.println("Aldığı yol = " + aldigiYol);


    }
}
