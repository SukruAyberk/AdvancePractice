package _09_Arrays;

public class Q17 {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {

        String[] somun = {"m4", "m20", "m6", "m10", "m12", "m5"};
        String[] civata = {"m6", "M4", "m8", "m12", "m10", "m20"};

        for (int i = 0; i < somun.length; i++) {
            for (int j = 0; j < civata.length; j++) {
                if (civata[j].equalsIgnoreCase(somun[i])) {
                    System.out.println(civata[j] + " civatası ve " + somun[i] + " somunu uyumludur.");
                }
            }
        }

    }

}
