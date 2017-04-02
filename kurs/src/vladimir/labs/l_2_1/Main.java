package vladimir.labs.l_2_1;

import inna.labs.l_2_1.Сomputer;

/**
 * Created by Admin on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Computer object = new Computer();
        System.out.println(object);

        Computer[] arrayComputer = new Computer[5];
            for (int i = 0; i < arrayComputer.length; i++) {
            arrayComputer[i] = new Computer();
            arrayComputer[i].setSerialNumber(101040 + i);
            }
            // не могу понять как назначить первую цену
            for (int f = 0; f < arrayComputer.length; f++) {
                arrayComputer[f].getPrice();
                arrayComputer[f].setPrice();
                    }
            for (Computer obj : arrayComputer){
            System.out.println("PC serial No - " + obj.getSerialNumber()+"; Computer price is - " + obj.getPrice());

        }
    }
}
