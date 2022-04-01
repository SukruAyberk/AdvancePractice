package _09_Arrays;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str = "Congratulations";
        String[] arr = str.split("");
        String[] tersArr = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        int sayac = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            tersArr[sayac] = arr[i];
            sayac++;

        }

        for (int i = 0; i < tersArr.length ; i++) {
            if (tersArr[i].contains("a") || tersArr[i].contains("o") || tersArr[i].contains("u")) {
                tersArr[i] = "i";
            }
        }

        System.out.println(Arrays.toString(tersArr));
    }

}
