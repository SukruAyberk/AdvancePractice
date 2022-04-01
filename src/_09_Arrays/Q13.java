package _09_Arrays;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Array'in kaç elemanlı olacağını girin: ");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            arr[i] = scan.nextInt();

            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }

        System.out.println("3'e bölünebilen sayı adedi = " + sayac);
    }

}
