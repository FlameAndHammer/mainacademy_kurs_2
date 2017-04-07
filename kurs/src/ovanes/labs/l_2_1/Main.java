package ovanes.labs.l_2_1;

public class Main {

    public static void main(String[] args) {
        Computer object = new Computer();
        System.out.println(object);




        System.out.println("-------------------------------------------");
        System.out.println("FrequencyCPU: " + object.getFrequencyCPU());
        System.out.println("Manufacturer: " + object.getManufacturer());
        System.out.println("Price: " + object.getPrice());
        object.setPrice(100.6);
        System.out.println("New price: " + object.getPrice());

        // lab 2-1-3
        System.out.println("-------------------------------------------");
        Computer [] arrayComputer = new Computer[5];
        for (int i=0; i<arrayComputer.length; i++) {
            arrayComputer[i] = new Computer();
            arrayComputer[i].setSerialNumber(10002015 + i);
        }
        int number = 1;
        for(Computer obj : arrayComputer)
            System.out.println("SerialNumber computer " + (number++) + ": " + obj.getSerialNumber());

        // lab 2-1-4
        System.out.println("-------------------------------------------");
        for (int i=0; i<arrayComputer.length; i++) {
            arrayComputer[i].setPrice(111 + i*10 - i);
        }
        for(Computer obj : arrayComputer) {
            System.out.print("SerialNumber computer " + ": " + obj.getSerialNumber());
            System.out.println("; Price: " + obj.getPrice());
        }
        for (int k=0; k<arrayComputer.length; k++) {
            double price = arrayComputer[k].getPrice();
            price += price*0.1;
            arrayComputer[k].setPrice(price);
        }
        System.out.println("\nAfter change:");
        for(Computer obj : arrayComputer) {
            System.out.print("SerialNumber computer " + ": " + obj.getSerialNumber());
            System.out.println("; Price: " + obj.getPrice());
        }

        // lab 2-1-5
        System.out.println("-------------------------------------------");
        Computer [] arrayComputers = new Computer[5];
        for (int i=0; i<arrayComputers.length; i++) {
            arrayComputers[i] = new Computer();
            arrayComputers[i].setSerialNumber(10002015 + i);
            if (i % 2 == 0) {
                arrayComputers[i].setManufacturer("ASUS");
            } else {
                arrayComputers[i].setManufacturer("HP");
            }
            arrayComputers[i].setPrice(111 + i*10 - i);
            arrayComputers[i].setQuantityCPU(4);
            arrayComputers[i].setFrequencyCPU(1 + 5 / (i+1));
        }
        int counter = 1;
        for(Computer obj : arrayComputers) {
            System.out.print("Computer " + counter++ + " -> ");
            obj.view();
        }
    }
}



