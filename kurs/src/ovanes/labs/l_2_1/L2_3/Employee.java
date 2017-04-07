package ovanes.labs.l_2_1.L2_3;

/**
 * Created by User on 06.04.2017.
 */
public class Employee {
    void calcSalary (String name, double...salary){
        double totalSalary = 0.0;
        for (double value : salary)
            totalSalary+=value;
        System.out.println("Employee" + name + "->totalSalary:" + totalSalary);
    }
}
