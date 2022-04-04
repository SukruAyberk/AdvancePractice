package _12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String harf1 = "m";
        String harf2 = "e";
        String harf3 = "r";
        String harf4 = "v";
        String harf5 = "e";

        stringBirlestir(harf1, harf2, harf3, harf4, harf5);

    }

    private static void stringBirlestir(String... harf) {

        String isim = "";

        for (String i : harf) {
            isim += i;
        }

        System.out.println(isim);

    }


}

