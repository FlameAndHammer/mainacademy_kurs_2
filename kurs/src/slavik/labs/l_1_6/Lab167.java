package slavik.labs.l_1_6;
import java.util.Arrays;
public class Lab167 {
    public static void main(String[] args) {
        int count1, count2, count3, count4;
        int arr[][] = {{1, 1, 1, 1, 1}, {2, 1, 3, 1, 1}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        for (int i = 0; i < arr.length; i++) {
            count1 = count2 = count3 = count4 = 0;
            if (i!=0) System.out.println("]");
            System.out.print("Line " + i + ": [");
            for (int j = 0; j <= arr.length; j++) {
                if (arr[i][j] == 1) {
                    if (count1 == 1) count2 = 0;
                        if (count1 == 0 && count2 == 0 && count3 == 0 &&  count4 == 1) {
                            System.out.print(",");
                            count3++;               // Flag ','
                        }
                     if (j < 4) {
                        if (arr[i][j + 1] != 1 || j + 1 == arr.length ) count1 = 1; // Flag end
                    }
                    if (count1 == 1 || count2 == 0){
                        System.out.print(j);
                        count1 = 0;
                        count4 = 1;     // Flag print j
                        count3 = 0;
                    }
                    if (j < 3) {
                        if (arr[i][j + 1] == 1 && arr[i][j + 2] == 1 && count2 == 0) {
                            System.out.print("-");
                            count2++;               // Flag '-'
                        }
                    }
                }
            }
        }   System.out.print("]");
    }
}
