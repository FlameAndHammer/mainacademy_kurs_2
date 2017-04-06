package arthur.labs.l_2_2_3;

/**
 * Created by Arthur on 30.03.2017.
 * Write class Employee with method calcSalary with argument name(String)
 * and varargs salary(double…). This method should calculate total salary of employee
 * and print his name and total salary. Write class Accountant that will be create Employee instance
 * and use his method with a different number of data.
 */
public class Employee {

    public String calcSalary(String name, double... monthSalary){
        int total = 0;
        for (double cell : monthSalary) {
            total += cell;
        }
        String print = "Employee: " + name + "    Total: " + total ;
        return print;
    }
}
