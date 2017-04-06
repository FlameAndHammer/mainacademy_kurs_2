package artur.labs.l_2_4;

import java.util.Scanner;

/**
 Created by Arthur on 05.04.2017.
  Write the MyPyramid class with the public static method printPyramid (int h),
 Which takes the parameter h an integer between 1 and 9 and outputs pyramids
 Number of height h.
 Example: H = 4 method should print pyramids
 1
 121
 12321
 1234321
 */
public class MyPiramid {
    public static void printPiramid(int n) {
        for ( int middle = 1; middle <= n; middle++) { // lines
            String left = "";
            String right = "";
            for (int i = 1; i < middle; i++) { // figures inside each line
                left += i ;
                right += (middle - i);
            }
            System.out.println(left + middle + right);
        }
    }

    public static void main(String[] args) {
            System.out.println("Input a number  ");
            Scanner number1 = new Scanner(System.in);
            int n = number1.nextInt();
            printPiramid(n);
    }
}
