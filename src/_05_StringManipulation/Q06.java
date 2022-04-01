package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Mail adresinizi girin: ");
        String mail = scan.nextLine();

        if (!(mail.contains("@gmail.com") || mail.contains("@hotmail.com"))) {
            System.out.println("Lğtfen geçerli bir mail adresi girin");
        } else if (mail.contains("hotmail")) {
            System.out.println(mail.replace("hotmail", "gmail"));
        } else {
            System.out.println(mail);
        }

    }
}
