package ovanes.labs.l_1_5;

/**
 * Created by User on 12.03.2017.
 */
public class onefivethree {
    public static void main(String[] args) {


        System.out.println("* | 1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("--------------------------------------");
        for(int i=1; i<=9; i++) {
        System.out.print(i + " | ");
        for (int j=1; j<=9; j++) {
            System.out.print(i * j + "\t");
        }
        System.out.println();
    }
}
}
