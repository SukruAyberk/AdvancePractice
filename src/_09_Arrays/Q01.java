package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sınırı girin: ");
        int sinir = scan.nextInt();
        int[] arr = new int[sinir];
        int fark = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        fark = arr[arr.length - 1] - arr[0];
        System.out.println("En büyük ve en küçük sayı arasındaki fark = " + fark);


    }

}
