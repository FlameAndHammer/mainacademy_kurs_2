package yuriy.labs.l_2_02.LabWork2_2_3;

/**
 * Created by Ruble on 02.04.2017.
 */
/*

Write class Accountant that will be create Employee instance and use his method with a
        different number of data.
*/

public class Accountant {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1.calcSalary("Petya", 1332, 534, 456,3546,34356));
    }

}
