package olena.labs.l_1_5;

/**
 * Created by elenafostachuk on 3/10/17.
 */
public class LabOneFiveSeven {
        public static void main(String[] args) {
            int n1 = 1;
            int n2 = 2;
            int n3 = 3;
            int sum = 0;
            for (int a = 0; a < 10; a++) {
                if (a % n1 == 0 | a % n2 == 0 | a % n3 == 0)
                    a = n1 + n2 + n3;
                    sum+= sum + a;
            }
            System.out.println(sum);
        }
    }

