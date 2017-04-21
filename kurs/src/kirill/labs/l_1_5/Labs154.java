package kirill.labs.l_1_5;

/**
 * Created by Storm on 17.04.2017.
 */
public class Labs154 {
    public static void main(String[] args) {
        System.out.println("Programm print the first 10 numbers that is devisible evenly by 3 or 4");
        int a=0;
        for (int i=1; i<=300; i++){
            if (i%3==0 || i%4==0) {
                a++;
                System.out.println(i);
            }
            if (a<10) {
                System.out.print("");
            } else {
                break;
            }
        }

    }
}



