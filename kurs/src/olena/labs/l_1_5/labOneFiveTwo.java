package olena.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by elenafostachuk on 3/5/17.
 */
        public class labOneFiveTwo {
        public static void main(String[] args) {
                System.out.println("Enter number: x");
                Scanner sc = new Scanner(System.in);
                String enter_x = sc.nextLine();
                switch (enter_x){
                        case "1":enter_x = "one";
                        break;
                        case "2": enter_x = "two";
                        break;
                        case "3": enter_x = "three";
                        break;
                        case "4": enter_x = "four";
                        break;
                        case "5": enter_x = "five";
                        break;
                        case "6": enter_x = "six";
                        break;
                        case "7": enter_x = "seven";
                        break;
                        case "8": enter_x = "eight";
                        break;
                        case "9": enter_x = "nine";
                        break;
                        default: enter_x = "other";
                        break;
                }
                System.out.println(enter_x);

        }
}











