package deneme;

import java.util.Scanner;

public class SDGSGD {

    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Değerler: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Girmek istediğiniz değeri tuşlayın: ");
        int target = scanner.nextInt();


        int indexValue = indexBulanMethod(arr, target);
        System.out.println("index değeriniz: " + indexValue);

        /*
        int target = 6;
        int indexValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indexValue = i;
            }
        }

        System.out.println("index değeri = " + indexValue);

         */



    }

    public static int indexBulanMethod(int[]arr, int target){
        int indexValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indexValue = i;
            }
        }
        return indexValue;
    }

}
