package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayı giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " en büyük sayıdır.");
            if (num2 >= num3) {
                System.out.println(num3 + " en küçük sayıdır.");
            } else {
                System.out.println(num2 + " en küçük sayıdır.");
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " en büyük sayıdır.");
            if (num1 >= num3) {
                System.out.println(num3 + " en küçük sayıdır.");
            } else {
                System.out.println(num1 + " en küçük sayıdır.");
            }
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " en büyük sayıdır.");
            if (num1 >= num2) {
                System.out.println(num2 + " en küçük sayıdır.");
            } else {
                System.out.println(num1 + " en küçük sayıdır.");
            }
        } else {
            System.out.println("Sayılar birbirine eşittir." + num1 + " = " + num2 + " = " + num3);
        }

    }
}

