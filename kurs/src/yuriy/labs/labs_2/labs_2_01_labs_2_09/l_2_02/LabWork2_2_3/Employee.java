package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_02.LabWork2_2_3;

/**
 * Created by Ruble on 02.04.2017.
 */
/*

Write class Employee with method calcSalary with argument name(String) and varargs
        salary(double…). This method should calculate total salary of employee and print his
        name and total salary.
        Write class Accountant that will be create Employee instance and use his method with a
        different number of data.
*/

public class Employee {
    public Employee() {
        String name;
        double salary;
    }

    public String calcSalary (String name, double... salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++){
            sum += salary[i];
        }

        String print = "Employee: " + name + ",\t" + "Summ: " + sum ;
        return print;
    }



}
