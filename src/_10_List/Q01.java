package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimler = new ArrayList<String>();
        ArrayList<String> aOlmayanIsimler = new ArrayList<String>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Omer");

        System.out.println(isimler);

        for (String i : isimler) {
            if (!i.toLowerCase().contains("a")) {
                aOlmayanIsimler.add(i);
            }
        }

        System.out.println(aOlmayanIsimler);

        for (int i = 0; i < isimler.size(); i++) {
            for (int j = 0; j < isimler.get(i).length(); j++) {
                if (isimler.get(i).toLowerCase().contains("a")) {
                    isimler.remove(i);
                }
            }
        }
        System.out.println(isimler);


    }


}
