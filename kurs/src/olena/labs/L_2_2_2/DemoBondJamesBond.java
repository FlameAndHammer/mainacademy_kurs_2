package olena.labs.L_2_2_2;

/**
 * Created by elenafostachuk on 4/5/17.
 */
public class DemoBondJamesBond {
    public static void main(String[] args) {
        Person bondJamesBond = new Person();

        bondJamesBond.set("Bond");
        bondJamesBond.show();

        bondJamesBond.set("Bond", "James", "male", "MI-6");
        bondJamesBond.show();

        bondJamesBond.set("Bond", "James", "male", "MI-6", 33, 007, 777);
        bondJamesBond.show();

    }
}

