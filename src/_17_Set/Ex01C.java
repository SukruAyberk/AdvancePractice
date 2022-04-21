package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01C {

     /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        elementEkle(set, arr);
        setYazdir(set);

    }

    private static void setYazdir(Set<Integer> set) {

        for (Integer i : set) {
            System.out.print(i + " ");
        }

    }

    private static void elementEkle(Set<Integer> set, int[] arr) {

        for (Integer i : arr) {
            set.add(i);
        }
        System.out.println(set);

    }

}
