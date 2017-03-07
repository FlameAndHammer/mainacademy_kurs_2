package yuriy.labs.l_1_4;

/**
 * Created by Ruble on 28.02.2017.
 */
public class LabWork1_4_3 {

    public static void main(String[] args){
        boolean logical1 = true;
        boolean logical2 = false;

        System.out.print("logical1 AND logical2: ");
        System.out.println(logical1&&logical2);
        System.out.print("logical1 OR logical2: ");
        System.out.println(logical1||logical2);
        System.out.print("NOT logical1, NOT logical2: ");
        System.out.print(!logical1+", ");
        System.out.println(!logical2);
        System.out.print("logical1 XOR logical2: ");
        System.out.println(logical1^logical2);
    }
}
