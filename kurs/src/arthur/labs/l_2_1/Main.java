package arthur.labs.l_2_1;

/**
 * Created by Arthur on 22.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Computer computer1 = new Computer();
        //computer1.setPrice(345.34f);

        Computer[] array = new Computer[5];
        for(int i=0; i<5; i++){

            array[i] = new Computer();
            array[i].setManufacturer("Dell ");
            array[i].setSerialNumber( (int) (Math.random() * 100_000) );
            array[i].setPrice((float) Math.random() * 1000 );
            array[i].setPrice( array[i].getPrice() * 1.1f );
            array[i].setQuantityCPU( (int)Math.pow(2,i) );
            array[i].setFrequencyCPU( (int) Math.pow (2 ,  20 + i )  );
            array[i].view();
        }
    }
}
