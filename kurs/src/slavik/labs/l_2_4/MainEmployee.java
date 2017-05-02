package slavik.labs.l_2_4;

public class MainEmployee {
    public static void main(String[] args) {
        new Employee("A", "B", "work1", 334455);
        new Employee("Y", "U", "work2", 112233);
        new Employee("Y", "U", "work3", 445566);
        System.out.println(Employee.getNumberOfEmployees());
    }
}
