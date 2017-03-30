package slavik.labs.l_1_6;
import java.util.Arrays;
import java.util.Scanner;
public class Lab165 {
    public static void main(String argv[]) {
        System.out.println("Length array 4x4");
        int lengthI = 4;
        int lengthJ = 4;
        String [][] array = new String[lengthI] [lengthJ];
        String [][] arr = new String[lengthI] [lengthJ];
        Scanner param = new Scanner(System.in);
        System.out.println("Enter number:");
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                String aString = Integer.toString(param.nextInt());
                arr[i][j] =  aString;
            }
        }
        System.out.println("Old matrica 4x4:");
                for (String[] done:arr) {
                    System.out.println(Arrays.toString(done));
                }
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                  array [i][j] =  arr[j][i];
            }
        }
        System.out.println();
        System.out.println("New matrica 4x4:");
                for (String[] done:array) {
                    System.out.println(Arrays.toString(done));
        }
   }
 }