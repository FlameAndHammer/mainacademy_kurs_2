package _nikulin.labs.lab_2_11_1;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("Demo exception");
        }
        catch (Exception exp) {
            System.out.println(exp);
        }
        finally {
            System.out.println("Run block finally");
        }
    }
}
