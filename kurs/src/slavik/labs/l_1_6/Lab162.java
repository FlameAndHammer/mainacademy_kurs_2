package slavik.labs.l_1_6;
public class Lab162 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = m[0];
        int max = m[0];
        int sum = 0;
        for (int aM : m) {
            if (min < aM) min = aM;
            if (max > aM) max = aM;
            sum = sum + aM;
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
        System.out.println("Average:" + sum/m.length);
    }
}