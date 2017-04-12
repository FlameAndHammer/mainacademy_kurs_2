package dana.labs.l_2_2;

/**
 * Created by Dana on 02.04.2017.
 */
public class Accountant {
    public static void main(String[] args) {
        Employee empl1 = new Employee();

        empl1.calcSalary("pavel", 123.1, 233.2, 456.7);
        System.out.println(empl1.getTotalS());
    }
}
