package maksim.labs.l_1_5;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_4 {
    public static void main(String[] args) {
        int nn = 1;
        for (int loop = 1; loop <= 300; loop++){
            int a3 = loop % 3;
            int a4 = loop % 4;
            if (loop > 2 && nn <= 10 && (a3 == 0 || a4 == 0)){
                System.out.println(nn + ". Number " + loop + " is devisible evenly by 3 or 4");
                nn++;
            }
        }
    }
}

