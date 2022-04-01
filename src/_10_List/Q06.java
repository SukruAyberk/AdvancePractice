package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> list = new ArrayList<Integer>();

        //  for (int i = 0; i < arr.length; i++) {
        //
        //            if (!list.contains(arr[i])) {
        //                list.add(arr[i]);
        //            }
        //
        //        }
        //
        //        System.out.println(list);

        for (Integer i : arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list);


        int[] tekrarsizArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            tekrarsizArr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(tekrarsizArr));


    }

}
