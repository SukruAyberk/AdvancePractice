package _06_Method_Creation;

import java.util.Scanner;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("string gir: ");
        String str = scan.nextLine();

        String modifiedString = modifiedString(str);
        System.out.println(modifiedString);

    }

    private static String modifiedString(String str) {

        String yeniString = "";

        for (int i = 0; i < str.length(); i++) {
            if (!yeniString.contains(str.substring(i, i + 1))) {
                yeniString += str.substring(i, i + 1);
            }
        }
        return yeniString;
    }
}
