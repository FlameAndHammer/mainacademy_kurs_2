package maksim.labs.l_1_6;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int sum = 0;
        int max = m[1];
        int min = m[1];
        System.out.print("Incoming data: ");
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
            sum += m[i];
            if (max < m[i]) {
                max = m[i];
                 }
            if (min > m[i]) {
                min = m[i];
            }
        }
        int average = sum / m.length;
        System.out.println();
        System.out.println("average: " + average);
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
