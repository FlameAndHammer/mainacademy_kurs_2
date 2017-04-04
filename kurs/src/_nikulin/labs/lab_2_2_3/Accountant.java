package _nikulin.labs.lab_2_2_3;

public class Accountant {
    public static void main(String [] args) {
        Employee object = new Employee();

        object.calcSalary("Petrov", 200.4, 180.3, 201.2);

        object.calcSalary("Sidorov", 200.4, 180.3, 201.2, 199.4, 189.3, 200.7);

        double[] array = {100.34, 156.3, 134.7, 123.9, 141.0};
        object.calcSalary("Krakov", array);
    }
}
