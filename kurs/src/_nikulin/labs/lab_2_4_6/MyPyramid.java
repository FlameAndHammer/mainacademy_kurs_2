package _nikulin.labs.lab_2_4_6;

public class MyPyramid {
    public static void printPiramid(int h) {
        if (h < 1 || h > 9) {
            System.out.println("The height of the pyramid incorrect!");
            return;
        }

        for(int level = 1; level <= h; level++) {
            for(int count = 1; count <= (h - level); count++) {
                System.out.print(" ");
            }
            for(int value = 1; value<=level; value++) {
                System.out.print(value);
            }
            for (int value = level-1; value >= 1; value--) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
