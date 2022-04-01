package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        String harf = "";

        for (int i = 0; i <= 255; i++) {
            int sayi = i;
            harf = Character.toString(i);
            System.out.println("harf = " + harf + ", Sayı: " + i);
        }

        int i = 0;
        while (i <= 255) {
            harf = Character.toString(i);
            System.out.println("harf = " + harf + ", Sayı: " + i);
            i++;
        }


    }
}


