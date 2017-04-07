package ovanes.labs.l_2_1.L2_3;

/**
 * Created by User on 06.04.2017.
 */
public class Accountant {

    public static void main(String[] args) {
        Employee object = new Employee();
        object.calcSalary( "Vanin",  200.4, 180.3,201.2);
        object.calcSalary(  "Ivankin", 200.4, 180.3, 201.2,199.4,189.3,200.7);
        double [] array = {100.4, 156.3, 134.7, 123.9, 141.0};
        object.calcSalary( "Ivankov", array);
    }
}
