package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string gir: ");
        String str = scan.nextLine();
        String[] arr = str.split("");
        String enCokTekrar = "";
        int count = 0;
        int maxCount = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                enCokTekrar = arr[i];
            } else if (count == maxCount) {
                enCokTekrar += ", " + arr[i];
            }
            count = 0;

        }

        System.out.println("Ençok tekrar eden harf: " + enCokTekrar + " = " + maxCount);


    }
}

