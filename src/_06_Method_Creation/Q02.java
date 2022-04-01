package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/


        Scanner scan = new Scanner(System.in);
        System.out.print("name1 gir: ");
        String name1 = scan.next();

        System.out.print("name2 gir: ");
        String name2 = scan.next();

        String modifiedString = stringBirlestirenMerhod(name1, name2);
        System.out.println(modifiedString);


    }

    private static String stringBirlestirenMerhod(String name1, String name2) {
        String yeniString = "";

        if (name1.length() % 2 == 0) {
            yeniString = (name1.substring(0, name1.length() / 2)) + name2 + name1.substring(name1.length() / 2);
        } else{
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }

        return yeniString;
    }


}
