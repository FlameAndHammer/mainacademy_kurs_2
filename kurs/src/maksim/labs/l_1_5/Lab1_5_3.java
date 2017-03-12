package maksim.labs.l_1_5;

/**
 * Created by Пк on 06.03.2017.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.println("*\t│\t1\t2\t3\t4\t5\t6\t7\t8\t9\t│");
        System.out.println("───┼──────────────────────────────┤");
        for (int line=1; line <= 9; line++) {
            System.out.print(line + "\t│");
            for (int col=1; col <=9; col++){
                System.out.print("\t" + (line * col));
            }
            System.out.println("\t│");
        }
        System.out.println("───┴──────────────────────────────┘");
    }
}
