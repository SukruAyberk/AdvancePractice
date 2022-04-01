package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        // Scanner scan = new Scanner(System.in);
        //        System.out.println("Lütfen hızınızı giriniz: ");
        //        int hız = scan.nextInt();
        //
        //        System.out.println("Ehliyetiniz var mı? ");
        //        boolean ehliyet = scan.hasNext("true");
        //
        //        if (ehliyet == true) {
        //            System.out.println("Ehliyetiniz var.");
        //            if (hız <= 45) {
        //                System.out.println("Ceza almadınız.");
        //            } else if (hız <= 84) {
        //                System.out.println("Cezanız 150$'dır.");
        //            } else if (hız <= 94) {
        //                System.out.println("Cezanız 320$'dır.");
        //            } else {
        //                System.out.println("Cezanız 500$'dır.");
        //            }
        //        } else {
        //            System.out.println("Ehliyetiniz yok.");
        //            if (hız <= 45) {
        //                System.out.println("Ehliyetiniz olmadığı için cezanız 200$'dır.");
        //            } else if (hız <= 84) {
        //                System.out.println("Cezanız 350$'dır.");
        //            } else if (hız <= 94) {
        //                System.out.println("Cezanız 520$'dır.");
        //            } else {
        //                System.out.println("Cezanız 700$'dır.");
        //            }
        //        }

        // ya da

        Scanner scan = new Scanner(System.in);

        System.out.print("Ehliyetiniz var mı? Varsa 1 yoksa 0 tuşlayın: ");
        int ehliyet = scan.nextInt();

        if (ehliyet == 0 || ehliyet == 1) {

            if (ehliyet == 0) {
                System.out.println("hızınızı sormadan kafadan 200$ kitledim size.");
            }

            System.out.print("Lütfen hızınızı giriniz: ");
            int hız = scan.nextInt();

            if (ehliyet == 1) {
                if (hız < 0) {
                    System.out.println("Negatif hız olmaz hatalı giriş yaptınız.");
                } else if (hız >= 55 && hız < 75) {
                    System.out.println("Cezanız 100$'dır.");
                } else if (hız >= 75 && hız < 84) {
                    System.out.println("Cezanız 150$'dır.");
                } else if (hız >= 84 && hız < 94) {
                    System.out.println("Cezanız 320$'dır.");
                } else if (hız >= 94) {
                    System.out.println("Cezanız 500$'dır.");
                } else {
                    System.out.println("Hız sınırında seyahat ediyorsunuz hayırlı yolculuklar.");
                }
            } else if (ehliyet == 0) {
                if (hız < 0) {
                    System.out.println("Negatif hız olmaz hatalı giriş yaptınız.");
                } else if (hız >= 55 && hız < 75) {
                    System.out.println("Cezanız 300$'dır.");
                } else if (hız >= 75 && hız < 84) {
                    System.out.println("Cezanız 350$'dır.");
                } else if (hız >= 84 && hız < 94) {
                    System.out.println("Cezanız 520$'dır.");
                } else if (hız >= 94) {
                    System.out.println("Cezanız 700$'dır.");
                } else {
                    System.out.println("Hız sınırında seyahat ediyorsunuz ancak ehliyetsiz olduğunuz için cezanız 200$'dır.");
                }
            } else {
                System.out.println("Agam ehliyetin var mı yok mu amk?");
            }
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}
