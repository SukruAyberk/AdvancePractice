package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("$")) {
                toplam1 += Integer.parseInt(arr[i].replaceAll("\\D", ""));
            } else if (arr[i].contains("£")) {
                toplam2 += Integer.parseInt(arr[i].replaceAll("\\D", ""));
            }
        }

        System.out.println("Dolar toplam = " + toplam1);
        System.out.println("Sterlin toplam = " + toplam2);


    }
}


