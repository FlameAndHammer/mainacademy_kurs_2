package maksim.labs.l_2_2;

/**
 * Created by Пк on 30.03.2017.
 */
public class Employee {
    public double calcSalary(String name, double... salary){
        double totalSalary = 0;
        for (double x : salary) {
            totalSalary += x;
        }
        return totalSalary;

    }
    public void view(){

    }
}
