package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        int sayi = 100;


        for (int i = 2; i < sayi; i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                list.add(i);
            }
        }

        System.out.println("Asal sayılar: " + list);

    }
}
