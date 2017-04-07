package _nikulin.labs.lab_2_4_4;

public class Demo {
    public static void main(String[] args) {
        Employee object_1 = new Employee("Ivan", "Ivanov", "teacher", 2345678);
        Employee jbject_2 = new Employee("Igor", "Maslov", "working", 1324356);
        new Employee("Daria", "Zubkova", "manager", 9095555);
        System.out.println("Number of employees -> " +
                Employee.getNumberOfEmployees());
    }
}
