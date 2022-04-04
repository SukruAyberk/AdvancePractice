package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int carpilacakSayi = 4;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        topla(carpilacakSayi, a, b, c, d);


    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        int toplam = 0;
        int carpim = 1;

        for (int i : toplanacakSayilar) {
            toplam += i;
        }

        toplam *= carpilacakSayi;
        System.out.println(toplam);

    }
}
