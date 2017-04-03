package _nikulin.labs.lab_2_2_4;

public class DemoPerson {
    public static void main(String [] args) {
        Person object = new Person();

        object.set("Alexan");
        object.show();

        object.set("Peter", "Krasko");
        object.show();

        object.set("Michael", "Melnik","male");
        object.show();

        object.set("Masha", "Dopler", 36, "female");
        object.show();

        object.set("Edward", "Maxnov", 23, "male", 7654329);
        object.show();
    }
}

