package slavik.labs.l_2_4;
    public class MyPyramid {
        public static void printPiramid(int h) {
            for (int j = 1; j <= h; j++) {
                for (int i = 1; i <= h - j; i++) {
                    System.out.print(" ");
                }
                    for (int m = 1; m <= j;  ++m) {
                        System.out.print(m);
                    }
                    for (int m = j; m != 1; m--) {
                    System.out.print(m-1);
                    }
                    System.out.println();
                }
            }
        }