package olena.labs.L_2_1;

/**
 * Created by elenafostachuk on 3/30/17.
 */
public class Main {
    public  static void main(String[] args){
        Computer comp = new Computer();

        comp.setCounter(1);
        comp.setManufacturer("Apple, Asus");
        comp.setFrequencyCPU(100);
        comp.setSerialNumber(7777);
        comp.setPrice(1500);


        Computer[] fiveComps = new Computer[5];
        for(int i = 0; i < fiveComps.length; i++) {
            fiveComps[i] = comp;
            fiveComps[i].setCounter(i + 1);

            float price = fiveComps[i].getPrice();
            price+= price*0.1;
            fiveComps[i].setPrice(price);

            if (i % 2 == 0) {
                fiveComps[i].setManufacturer("Apple");
            } else {
                fiveComps[i].setManufacturer("Asus");
            }
                fiveComps[i].setFrequencyCPU( i + (i + 100));
                fiveComps[i].setQuantityCPU(900 - i);
                fiveComps[i].setSerialNumber(7777 + i);

        System.out.println();
        comp.view();

        }

    }

}
