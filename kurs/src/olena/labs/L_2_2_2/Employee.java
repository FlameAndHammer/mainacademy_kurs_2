package olena.labs.L_2_2_2;

/**
 * Created by elenafostachuk on 4/3/17.
 */
public class Employee {
    double monthSalary = 0;

    public double calcSalary(String name, double... weekSalary) {
        for (double res : weekSalary) {
            monthSalary += res;
        }
String print ="Employee: " + name + "    month salary: " + monthSalary;
        return monthSalary;
    }
}


