package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        List<Integer> list = new ArrayList<Integer>();
        int sayi = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        list.add(n1);
        list.add(n2);



        for (int i = 2; i < sayi; i++) {
            n3 = n1 + n2;
            list.add(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(list);








    }
}
