package slavik.labs.l_1_5;
public class Lab154 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 300; i++) {
            if (count>10) break;
            if ((i % 3)==0 || (i % 4)==0) {
                count++;
                System.out.println(i);
            }
        }
    }
}
