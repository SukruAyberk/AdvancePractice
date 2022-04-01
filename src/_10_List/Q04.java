package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<Double>();
        System.out.print("Kaç adet not girmek istersiniz: ");
        int adet = scan.nextInt();
        double not = 0;
        int toplam = 0;
        int avg = 0;
        int sayac = 0;

        for (int i = 0; i < adet; i++) {

            System.out.print((i + 1) + ". notu girin: ");
            not = scan.nextDouble();
            list.add(not);

            toplam += list.get(i);
        }
        avg = toplam / list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > avg) {
                sayac++;
            }
        }


        System.out.println("Ortalama = " + avg + " ve geçen öğrenci sayısı = " + sayac);
    }
}
