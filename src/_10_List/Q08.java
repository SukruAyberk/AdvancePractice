package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> list = new ArrayList<String>();
        List<String> log = new ArrayList<String>();
        list.add("Umit");
        list.add("Emin");
        list.add("Kemal");
        list.add("Kerem");
        list.add("Taylan");
        list.add("Orhan");
        list.add("Sinan");
        list.add("Furkan");
        list.add("Ahmet");
        list.add("Ali");


        int ilkIndex = 3;
        int ikinciIndex = 8;
        System.out.println(list);

        log.add(list.remove(2)); // 3 -> 0
        log.add(list.remove(7 - 1)); // 8 -> 1

        list.add(2, log.get(1));
        list.add(7, log.get(0));
        System.out.println(list);


    }

}
