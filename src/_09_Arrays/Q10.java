package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (array[i].contains("Gayet")) {
                array[i] = str.replace("Gayet", "Cook");
            }

        }
        System.out.println(Arrays.toString(array));




    }

}
