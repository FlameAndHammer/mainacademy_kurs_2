package maksim.labs.l_2_2;
import java.util.Random;
/**
 * Created by Пк on 30.03.2017.
 */
public class Accountant {
    public static void main(String[] args) {
        String name = "";
        for (int i = 0; i < (int) (3 + (Math.random() * 10)); i++) {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');
            name += c;
        }
        Employee empl = new Employee();
        double salary = 0;
        for (int i = 1; i <= 12; i++) {
            salary = 500 + (Math.random() * 1000);
            empl.calcSalary(name, salary);
            System.out.println(salary);
        }
        System.out.println("Last name: " + name + "\nTotal salary: " + empl.calcSalary(name,salary));
    }
}
