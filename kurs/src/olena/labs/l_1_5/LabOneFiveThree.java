package olena.labs.l_1_5;

/**
 * Created by elenafostachuk on 3/6/17. Pifagor may approve it?
 */
public class LabOneFiveThree {
    public static void main(String[] args) {
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
}






