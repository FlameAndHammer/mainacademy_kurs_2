package ovanes.labs.l_1_5;
import java.util.Scanner;
/**
 * Created by User on 23.03.2017.
 */
public class onefiveseven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit of the rane -->");
        long number = scanner.nextInt();

        long counter =1;
        long sumOfDivisors;
        while (counter<=number) {
            sumOfDivisors = 0;
            long currentDivider = 1;
            long secondDivider = counter;
            while (currentDivider<secondDivider){
                if (counter % currentDivider ==0 ) {
                    sumOfDivisors += currentDivider;
                    secondDivider = counter/currentDivider;
                    if (currentDivider !=1){
                        sumOfDivisors += secondDivider;
                    }
                }
                currentDivider++;
            }
            if (sumOfDivisors == counter) {
                System.out.println( "Perfect number = " + counter);

            }
            counter++;
        }

    }
}

