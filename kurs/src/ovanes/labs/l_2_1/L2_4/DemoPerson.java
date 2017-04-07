package ovanes.labs.l_2_1.L2_4;

/**
 * Created by User on 06.04.2017.
 */

public class DemoPerson {
    public static void main(String[] args) {
        Person object = new Person();
        object.set("Bob");
        object.show();
        object.set("BoBu", "BoBUI");
        object.show();
        object.set("Bik", "Bek","transgender",999);
        object.show();
        object.set("Maik","Bojarsky",999, "Kanaliya",4554);
        object.show();
   }
}
