package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
  /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("string gir: ");
        String str = scan.nextLine();
        String ttenCumle = ttenMethod(str);
        System.out.println(ttenCumle);


    }

    private static String ttenMethod(String str) {
        String reverseSentence = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.substring(i, (i + 1)).equals(" ")) {
                reverseSentence += str.substring(i);
                str = str.substring(0, i); // tekrar aynı aralığa bakmasın diye yaptık
            }
            if (i == 0) {
                reverseSentence = reverseSentence + " " + str.substring(i);
            }
        }

        return reverseSentence;
    }

}
