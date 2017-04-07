package ovanes.labs.l_1_6;

/**
 * Created by User on 23.03.2017.
 */
public class onesixone {
    public static void main(String[] args) {

    int[] iNumbers;
    iNumbers = new int[31];
    for (int i = 2; i <= 30 ; i = i + 2) {
        iNumbers[i] = i;
        System.out.print( iNumbers[i]+ " ");
    }
}
}

