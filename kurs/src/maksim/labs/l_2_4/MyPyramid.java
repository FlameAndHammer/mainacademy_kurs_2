package maksim.labs.l_2_4;

import java.util.Scanner;

/**
 * Created by Пк on 06.04.2017.
 */
public class MyPyramid {
    public static void printPyramid(int h){

        for (int i = 1; i <= h; i++){
            for (int sp = h - i; sp >= 1; sp--){
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + j);
            }
            for (int k = i-1; k >= 1; k-- ){
                System.out.print("\t" + k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
            int h;
            do {
                System.out.println("Enter the height of pyramid (digit from 1 to 9):");
                Scanner sc = new Scanner(System.in);
                h = sc.nextInt();
            }
            while (1 > h || h > 9);
        MyPyramid mp = new MyPyramid();
        mp.printPyramid(h);
    }
}
