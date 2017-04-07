package _nikulin.labs.lab_2_5_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("The initial value of the field nextId = " +
                InitTest.getNextId());
        InitTest id_1 = new InitTest();
        System.out.println("ID object 1 -> " + id_1.getId());
        InitTest id_2 = new InitTest();
        System.out.println("ID object 2 -> " + id_2.getId());
        InitTest id_3 = new InitTest();
        System.out.println("ID object 3 -> " + id_3.getId());
        InitTest id_4 = new InitTest();
        System.out.println("ID object 4 -> " + id_4.getId());
        InitTest id_5 = new InitTest();
        System.out.println("ID object 5 -> " + id_5.getId());
        System.out.println("The current value of the field nextId = " +
                InitTest.getNextId());
    }
}
