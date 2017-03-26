package slavik.labs.l_1_5;
public class Lab153 {
    public static void main(String[] args) {
        System.out.print("*| ");
        for (int i = 1; i <= 9; i++)
            System.out.print(i+"  ");
        System.out.println();
        for (int i = 1; i < 16; i++)
            System.out.print("--");
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "|");
        for (int j = 1; j <= 9 ; j++) {
            if (i * j <= 9) System.out.print(" ");
            System.out.print(i * j + " ");
        }
        System.out.println();
        }
    }
}

