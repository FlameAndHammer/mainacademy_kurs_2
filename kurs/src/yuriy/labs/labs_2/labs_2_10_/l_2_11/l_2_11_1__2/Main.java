package yuriy.labs.labs_2.labs_2_10_.l_2_11.l_2_11_1__2;

/**
 * Created by Ruble on 09.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception");
        }
        catch (Exception exp) {
            System.out.println(exp);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
