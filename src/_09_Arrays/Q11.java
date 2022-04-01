package _09_Arrays;

public class Q11 {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
        int toplam1 = 0;
        int toplam2 = 0;
        int toplam3 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                toplam1 += arr1[i][j];

            }
        }

        for (int k = 0; k < arr2.length; k++) {
            for (int l = 0; l < arr2[k].length; l++) {

                toplam2 += arr2[k][l];

            }
        }
        toplam3 = toplam1 + toplam2;
        System.out.println("Birinci array'in toplamı = " + toplam1);
        System.out.println("İkinci array'in toplamı = " + toplam2);
        System.out.println("İki arrayin toplamı = " + toplam3);

    }

}
