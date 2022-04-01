package _09_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        String str = "Javacilar cook afilli";
        String[] arr = str.split("");
        int sayac = 0;

        List<String> harf = new ArrayList<String>();
        List<Integer> adet = new ArrayList<Integer>();
        List<String> arr2 = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!harf.contains(arr[i])) {
                    harf.add(arr[i]);
                }
            }
        }

        System.out.println(harf);

        for (int i = 0; i < harf.size(); i++) {
            sayac = 0;
            for (int j = 0; j < arr.length; j++) {
                if (harf.get(i).equalsIgnoreCase(arr[j])) {
                    sayac++;
                }
            }
            adet.add(sayac);
        }

        System.out.println(adet);

        for (int i = 0; i < adet.size(); i++) {
            arr2.add(harf.get(i) + " = " + adet.get(i));
        }

        System.out.println(arr2);


    }
}
    

