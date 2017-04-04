package _nikulin.labs.lab_2_2_3;

public class Employee {
    void calcSalary(String name, double... salary) {
        double totalSalary = 0.0;
        for (double value : salary)
            totalSalary += value;
        System.out.println("Employee " + name + " -> totalSalary: " + totalSalary);
    }
}
