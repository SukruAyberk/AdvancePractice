package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(pickName.indexOf("I"));
        System.out.println(pickName.substring(0,1) + " " + pickName.substring(11,12) + " " + pickName.substring(8,9).toLowerCase());

    }

}
