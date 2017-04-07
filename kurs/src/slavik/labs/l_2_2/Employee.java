package slavik.labs.l_2_2;

public class Employee {
    void calcSalary(String name, double... salary){
        double Sum = 0;
        for (double val:salary) {
            Sum = Sum + val;
        }  System.out.println(name + " " + Sum);
    }
}
