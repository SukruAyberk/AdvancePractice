package _17_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex02C {

     /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
Colections.sort(arr1)
     */

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        l1 = randomListeUret1(l1);
        System.out.println(l1);
        l2 = randomListeUret2(l2);
        System.out.println(l2);

        List<Integer> l1Fark = new ArrayList<Integer>(l1);
        List<Integer> l2Fark = new ArrayList<Integer>(l2);

        l1Fark.removeAll(l2);
        l2Fark.removeAll(l1);
        System.out.println("Farklı list1: " + l1Fark);
        System.out.println("Farklı list2: " + l2Fark);

        System.out.println();

        l2Fark.addAll(l1Fark);
        Collections.sort(l2);
        System.out.println(l2);
        Collections.reverse(l2);
        System.out.println(l2);



    }

    private static void ortakElemanVarMi(List<Integer> l1, List<Integer> l2) {

        int ortakEleman = 0;

        for (int i = 0; i < l1.size(); i++) {



        }

    }

    private static List<Integer> randomListeUret2(List<Integer> l2) {

        Random rnd = new Random();
        int randomSayi = 0;
        for (int i = 0; i < 10; i++) {
            randomSayi = rnd.nextInt(21);
            l2.add(randomSayi);
        }

        return l2;
    }

    private static List<Integer> randomListeUret1(List<Integer> l1) {
        Random rnd = new Random();
        int randomSayi = 0;
        for (int i = 0; i < 10; i++) {
            randomSayi = rnd.nextInt(21);
            l1.add(randomSayi);
        }

        return l1;
    }

}
