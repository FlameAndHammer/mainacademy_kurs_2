package maksim.labs.l_2_2;

/**
 * Created by Пк on 30.03.2017.
 */
public class Employee {
    double totalSalary = 0;
    public double calcSalary(String name, double... salary){

        for (double x : salary) {
            totalSalary += x;
        }
        return totalSalary;

    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
