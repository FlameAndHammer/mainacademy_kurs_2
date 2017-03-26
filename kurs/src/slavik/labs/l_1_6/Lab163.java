package slavik.labs.l_1_6;
public class Lab163 {
    public static void main(String[] args) {
        int[][] m = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        for (int i = 0; i <= 3; i++) {
            for (int numbers : m[i])
                System.out.print(numbers + "\t");
            System.out.println();
        }
    }
}