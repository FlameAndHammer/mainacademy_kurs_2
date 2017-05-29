package _nikulin.labs.lab_2_10_1;

public class Main {

    public static void main(String[] args) {
        Integer obj1 = 67;
        Integer obj2 = new Integer(67);
        Integer obj3 = new Integer("67");
        Integer obj4 = Integer.valueOf("67");
        Integer obj5 = Integer.parseInt("67");

        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);
        System.out.println(obj1 == obj4);
        System.out.println(obj1 == obj5);

        System.out.println();
        System.out.println(obj2 == obj3);
        System.out.println(obj2 == obj4);
        System.out.println(obj2 == obj5);

        System.out.println();
        System.out.println(obj3 == obj4);
        System.out.println(obj3 == obj5);

        System.out.println();
        System.out.println(obj4 == obj5);

        System.out.println();
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj1.equals(obj4));
        System.out.println(obj1.equals(obj5));

        System.out.println("\n");
        Integer obj11 = 167;
        Integer obj21 = new Integer(167);
        Integer obj31 = new Integer("167");
        Integer obj41 = Integer.valueOf("167");
        Integer obj51 = Integer.parseInt("167");

        System.out.println(obj11 == obj21);
        System.out.println(obj11 == obj31);
        System.out.println(obj11 == obj41);
        System.out.println(obj11 == obj51);

        System.out.println();
        System.out.println(obj21 == obj31);
        System.out.println(obj21 == obj41);
        System.out.println(obj21 == obj51);

        System.out.println();
        System.out.println(obj31 == obj41);
        System.out.println(obj31 == obj51);

        System.out.println();
        System.out.println(obj41 == obj51);

        System.out.println();
        System.out.println(obj11.equals(obj21));
        System.out.println(obj11.equals(obj31));
        System.out.println(obj11.equals(obj41));
        System.out.println(obj11.equals(obj51));
    }
}
