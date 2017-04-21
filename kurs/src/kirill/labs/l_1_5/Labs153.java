package kirill.labs.l_1_5;

/**
 * Created by Storm on 17.04.2017.
 */
public class Labs153 {
    public static void main(String[] args) {
        System.out.println("*|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("---------------------------------------");
        for (int i = 1; i < 10; i++){
            System.out.print(i + "|\t");
            for (int j = i; j < i*10; j = j+i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
